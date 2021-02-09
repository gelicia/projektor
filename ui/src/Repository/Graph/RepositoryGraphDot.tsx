import * as React from "react";
import { Dot } from "recharts";

const RepositoryGraphDot = (props) => {
  const { dataKey, payload } = props;
  const { publicId, passed } = payload;
  const value = payload[dataKey];

  return (
    <Dot
      {...props}
      role={`dot-${dataKey}-${publicId}`}
      aria-label={`dot-${dataKey}-${value}`}
      stroke={passed ? 'green' : 'red'}
    />
  );
};

export default RepositoryGraphDot;
