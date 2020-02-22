/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRunAccess implements Serializable {

    private static final long serialVersionUID = -1615644481;

    private Long   testRunId;
    private String assetKey;

    public TestRunAccess() {}

    public TestRunAccess(TestRunAccess value) {
        this.testRunId = value.testRunId;
        this.assetKey = value.assetKey;
    }

    public TestRunAccess(
        Long   testRunId,
        String assetKey
    ) {
        this.testRunId = testRunId;
        this.assetKey = assetKey;
    }

    public Long getTestRunId() {
        return this.testRunId;
    }

    public TestRunAccess setTestRunId(Long testRunId) {
        this.testRunId = testRunId;
        return this;
    }

    public String getAssetKey() {
        return this.assetKey;
    }

    public TestRunAccess setAssetKey(String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final TestRunAccess other = (TestRunAccess) obj;
        if (testRunId == null) {
            if (other.testRunId != null)
                return false;
        }
        else if (!testRunId.equals(other.testRunId))
            return false;
        if (assetKey == null) {
            if (other.assetKey != null)
                return false;
        }
        else if (!assetKey.equals(other.assetKey))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.testRunId == null) ? 0 : this.testRunId.hashCode());
        result = prime * result + ((this.assetKey == null) ? 0 : this.assetKey.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestRunAccess (");

        sb.append(testRunId);
        sb.append(", ").append(assetKey);

        sb.append(")");
        return sb.toString();
    }
}
