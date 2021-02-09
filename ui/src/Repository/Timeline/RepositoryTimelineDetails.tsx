import * as React from "react";
import { RepositoryTimeline } from "../../model/RepositoryModel";
import PageTitle from "../../PageTitle";
import RepositoryTimelineGraph from "./RepositoryTimelineGraph";
import { Typography, FormControlLabel, Checkbox } from "@material-ui/core";

interface RepositoryTimelineDetailsProps {
  timeline: RepositoryTimeline;
  repoName: string;
  hideIfEmpty: boolean;
}
const RepositoryTimelineDetails = ({
  timeline,
  repoName,
  hideIfEmpty,
}: RepositoryTimelineDetailsProps) => {
  const [isHideFailed, setIsHideFailed] = React.useState(false)
  return (
    <div>
      {timeline ? (
        <PageTitle
          title="Test execution time"
          testid="repository-timeline-title"
        />
      ) : null}
      {timeline ? (
        <>
          <RepositoryTimelineGraph timeline={timeline} isHideFailed={isHideFailed} />
          <FormControlLabel
        control={
          <Checkbox
            checked={isHideFailed}
            onChange={(e) => {setIsHideFailed(e.target.checked)}}
            color="primary"
          />
        }
        label="Hide Failed Tests"
      />
        </>
      ) : hideIfEmpty ? null : (
        <Typography align="center" data-testid="repo-no-timeline">
          No test execution information available for repository {repoName}
        </Typography>
      )}
    </div>
  );
};

export default RepositoryTimelineDetails;
