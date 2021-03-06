import * as React from "react";
import { RepositoryPerformanceTestTimeline } from "../../model/RepositoryModel";
import moment from "moment";
import RepositoryGraphActiveDot from "../Graph/RepositoryGraphActiveDot";
import RepositoryGraphDot from "../Graph/RepositoryGraphDot";
import RepositoryPerformanceTimelineGraphTooltip from "./RepositoryPerformanceTimelineGraphTooltip";
import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
  Legend,
  ResponsiveContainer,
} from "recharts";

interface RepositoryPerformanceTimelineGraphProps {
  performanceTestTimeline: RepositoryPerformanceTestTimeline;
  graphWidth?: number;
}

const RepositoryPerformanceTimelineGraph = ({
  performanceTestTimeline,
  graphWidth,
}: RepositoryPerformanceTimelineGraphProps) => {
  const data = performanceTestTimeline.entries.map((entry) => ({
    date: moment.utc(entry.createdTimestamp).format("YYYY-MM-DD hh:mm:ss"),
    createdTimestamp: entry.createdTimestamp,
    publicId: entry.publicId,
    average: entry.performanceResult.average,
    p95: entry.performanceResult.p95,
    maximum: entry.performanceResult.maximum,
    requestsPerSecond: entry.performanceResult.requestsPerSecond,
  }));

  const xAxisTickFormatter = (value) => moment(value).format("MMM Do YYYY");

  const p95YAxisTickFormatter = (value) => `${value}ms`;

  return (
    <div data-testid="repository-performance-timeline-graph">
      <ResponsiveContainer width={graphWidth || "100%"} height={300}>
        <LineChart
          data={data}
          margin={{
            top: 30,
            right: 50,
            left: 20,
            bottom: 5,
          }}
        >
          <CartesianGrid strokeDasharray="3 3" />
          <XAxis dataKey="date" tickFormatter={xAxisTickFormatter} />
          <YAxis
            yAxisId="p95"
            orientation="left"
            tickFormatter={p95YAxisTickFormatter}
          />
          <YAxis yAxisId="requestsPerSecond" orientation="right" />
          <Legend
            formatter={(value, _) =>
              value === "p95" ? "p95 response time" : "Requests per second"
            }
          />
          <Tooltip content={<RepositoryPerformanceTimelineGraphTooltip />} />
          <Line
            type="monotone"
            dataKey="requestsPerSecond"
            stroke="#d8ac54"
            activeDot={<RepositoryGraphActiveDot />}
            dot={<RepositoryGraphDot />}
            yAxisId="requestsPerSecond"
          />
          <Line
            type="monotone"
            dataKey="p95"
            stroke="#64aed8"
            activeDot={<RepositoryGraphActiveDot />}
            dot={<RepositoryGraphDot />}
            yAxisId="p95"
          />
        </LineChart>
      </ResponsiveContainer>
    </div>
  );
};

export default RepositoryPerformanceTimelineGraph;
