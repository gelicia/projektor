import * as React from "react";
import moment from "moment";
import TestRunDateItem from "./TestRunDateItem";

interface TestRunDateProps {
  createdTimestamp: Date;
}

const TestRunDate = ({ createdTimestamp }: TestRunDateProps) => {
  return (
    <TestRunDateItem
      label="Report created"
      testId="test-run-report-created-timestamp"
      value={moment(createdTimestamp).format("MMMM Do YYYY, h:mm:ss a")}
    />
  );
};

export default TestRunDate;
