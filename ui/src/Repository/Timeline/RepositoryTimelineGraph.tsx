import * as React from "react";
import { RepositoryTimeline } from "../../model/RepositoryModel";
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
import * as d3 from "d3";
import moment from "moment";
import RepositoryTimelineGraphTooltip from "./RepositoryTimelineGraphTooltip";
import RepositoryGraphActiveDot from "../Graph/RepositoryGraphActiveDot";
import RepositoryGraphDot from "../Graph//RepositoryGraphDot";
import { formatSecondsDuration } from "../../dateUtils/dateUtils";

interface RepositoryTimelineGraphProps {
  timeline: RepositoryTimeline;
  graphWidth?: number;
  isHideFailed?: boolean;
}

const RepositoryTimelineGraph = ({
  timeline,
  graphWidth,
  isHideFailed,
}: RepositoryTimelineGraphProps) => {
  const [chartSize, setChartSize] = React.useState([1000, 200]);
  const [data, setData] = React.useState([]);
  const d3Ref = React.useRef(null);

  React.useEffect(() => {
    const dataProc = timeline.timelineEntries
      .map((entry) => ({
        date: moment.utc(entry.createdTimestamp).format("YYYY-MM-DD hh:mm:ss"),
        createdTimestamp: entry.createdTimestamp,
        publicId: entry.publicId,
        duration: entry.cumulativeDuration,
        totalTestCount: entry.totalTestCount,
        testAverageDuration: entry.testAverageDuration,
        passed: entry.passed,
      }))
      .filter((row) => {
        return isHideFailed ? row.passed : true;
      });

    setData(dataProc);
  }, [timeline, isHideFailed]);

  React.useEffect(() => {
    if (data.length > 0) {
      createUpdateTimelineGraph();
    }
  }, [data]);

  const createUpdateTimelineGraph = () => {
    const svg = d3.select(d3Ref.current);

    //evenly spaces runs on axis - not actually on a time linear scale to account for weekends, etc
    const dateScale = d3
      .scaleLinear()
      .domain([0, data.length])
      .range([0, chartSize[0]]);

    const durationScale = d3
      .scaleLinear()
      .domain(d3.extent(data.map((d) => d.duration)))
      .range([chartSize[1] / 2, 0]);

    const durationLine = d3
      .line()
      .x((_, i) => dateScale(i))
      .y((d) => durationScale(d.duration));

    var durationAxis = d3.axisLeft().scale(durationScale);

    const testCountScale = d3
      .scaleLinear()
      .domain(d3.extent(data.map((d) => d.totalTestCount)))
      .range([0, chartSize[1] / 2]);

    const testCountLine = d3
      .line()
      .x((_, i) => dateScale(i))
      .y((d) => chartSize[1] - testCountScale(d.totalTestCount));

    var testCountAxis = d3.axisRight().scale(testCountScale);

     //svg

     svg.selectAll("g.durationAxis")
     .data([data])
     .join(
       enter=> enter.append("g").attr("class", "durationAxis").attr("transform", `translate(50,0)`).call(durationAxis),
       update=> update.call(durationAxis),
       exit=> exit.remove(),
     )

     console.log(svg.selectAll('path .duration'))
    // .call(durationAxis)

   /* svg
      .selectAll("path.duration")
      .data([data], (d, i) => {console.log(d, i) return d.createdTimestamp})
      .join(
        (enter) =>
          enter
            .append("path")
            .attr("class", "duration")
            .attr("fill", "none")
            .attr("stroke", "steelblue")
            .attr("d", durationLine),
        (update) =>
          update.call((update) =>
            update.transition().duration(750).attr("d", durationLine)
          )
      );

    let update = svg.selectAll("path.duration")
    .data(data)

console.log(data)

update.enter()
    .append("path")
    .attr("d", durationLine)
    .attr("class", "duration")
    .attr("fill", "none")
    .attr("stroke", "black")

update.exit().remove()
*/
      /*svg
      .selectAll("path.duration")
      .data([data])
      .enter()
      .append("path")
      .attr("class", "duration")
      .attr("fill", "none")
      .attr("stroke", "steelblue")
      .attr("stroke-width", 1.5)
      .attr("stroke-linejoin", "round")
      .attr("stroke-linecap", "round")
      .attr("d", durationLine);

    svg
      .selectAll("path.testCount")
      .data([data])
      .enter()
      .append("path")
      .attr("class", "testCount")
      .attr("fill", "none")
      .attr("stroke", "green")
      .attr("stroke-width", 1.5)
      .attr("stroke-linejoin", "round")
      .attr("stroke-linecap", "round")
      .attr("d", testCountLine); */
  };

  const xAxisTickFormatter = (value) => moment(value).format("MMM Do YYYY");
  const durationYAxisFormatter = (value) => formatSecondsDuration(value, 3);

  return (
    <>
      <svg ref={d3Ref} width={chartSize[0]} height={chartSize[1]}>
        <path stroke="green" className="duration" />
      </svg>
      <div data-testid="repository-timeline-graph">
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
              yAxisId="duration"
              orientation="left"
              tickFormatter={durationYAxisFormatter}
            />
            <YAxis yAxisId="totalTestCount" orientation="right" />
            <Legend
              formatter={(value, _) =>
                value === "duration" ? "Test execution time" : "Test count"
              }
            />
            <Tooltip content={<RepositoryTimelineGraphTooltip />} />
            <Line
              type="monotone"
              dataKey="duration"
              stroke="#8884d8"
              activeDot={<RepositoryGraphActiveDot />}
              dot={<RepositoryGraphDot />}
              yAxisId="duration"
            />
            <Line
              type="monotone"
              dataKey="totalTestCount"
              stroke="#64aed8"
              activeDot={<RepositoryGraphActiveDot />}
              dot={<RepositoryGraphDot />}
              yAxisId="totalTestCount"
            />
          </LineChart>
        </ResponsiveContainer>
      </div>
    </>
  );
};

export default RepositoryTimelineGraph;
