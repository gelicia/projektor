package projektor.route

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.request.receiveStream
import io.ktor.response.respond
import io.ktor.response.respondBytes
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.util.KtorExperimentalAPI
import io.ktor.util.getOrFail
import projektor.attachment.AttachmentStoreService
import projektor.attachment.CreateAttachmentResponse
import projektor.attachment.GetAttachmentsResponse
import projektor.server.api.PublicId

@KtorExperimentalAPI
fun Route.attachments(attachmentStoreService: AttachmentStoreService?) {
    post("/run/{publicId}/attachments/{attachmentName}") {
        val publicId = call.parameters.getOrFail("publicId")
        val attachmentName = call.parameters.getOrFail("attachmentName")
        val attachmentStream = call.receiveStream()

        if (attachmentStoreService != null) {
            attachmentStoreService.conditionallyCreateBucketIfNotExists()

            attachmentStoreService.addAttachment(PublicId(publicId), attachmentName, attachmentStream)

            call.respond(HttpStatusCode.OK, CreateAttachmentResponse(true, true, attachmentName))
        } else {
            call.respond(HttpStatusCode.BadRequest, CreateAttachmentResponse(false, false, null))
        }
    }

    get("/run/{publicId}/attachments/{attachmentName}") {
        val publicId = call.parameters.getOrFail("publicId")
        val attachmentName = call.parameters.getOrFail("attachmentName")

        if (attachmentStoreService != null) {
            val attachment = attachmentStoreService.getAttachment(PublicId(publicId), attachmentName)

            call.respondBytes(attachment.readBytes())
        } else {
            call.respond(HttpStatusCode.BadRequest)
        }
    }

    get("/run/{publicId}/attachments") {
        val publicId = call.parameters.getOrFail("publicId")

        if (attachmentStoreService != null) {
            val attachments = attachmentStoreService.listAttachments(PublicId(publicId))

            call.respond(HttpStatusCode.OK, GetAttachmentsResponse(attachments))
        } else {
            call.respond(HttpStatusCode.BadRequest)
        }
    }
}
