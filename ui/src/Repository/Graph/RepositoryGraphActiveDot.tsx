import * as React from "react";
import { Dot } from "recharts";
import { navigate } from "@reach/router";
import { makeStyles } from "@material-ui/styles";

const useStyles = makeStyles(() => ({
  dot: {
    "&:hover": {
      cursor: "pointer",
    },
  },
}));

const RepositoryGraphActiveDot = (props) => {
  const classes = useStyles({});
  const { cy, cx, fill, dataKey, payload } = props;
  const { publicId, passed } = payload;

  const dotOnClick = () => {
    window.open(`/tests/${publicId}`);
  };
  return (
    <Dot
      r={8}
      cy={cy}
      cx={cx}
      fill={fill}
      stroke={passed ? 'green' : 'red'}   
      onClick={dotOnClick}
      className={classes.dot}
      role={`active-dot-${dataKey}-${publicId}`}
    />
  );
};

export default RepositoryGraphActiveDot;
