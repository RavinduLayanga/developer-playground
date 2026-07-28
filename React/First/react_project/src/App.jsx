import PropTypes from "prop-types";
const BlueComponent = () => (
  <div style={{ color: "blue" }}>
    <p>This Component is blue.</p>
  </div>
);

const GreenComponent = () => (
  <div style={{ color: "green" }}>
    <p>This Component is Green.</p>
  </div>
);

const RedComponent = () => (
  <div style={{ color: "red" }}>
    <p>This Component is Red.</p>
  </div>
);

// Reusable components using props
// const ColourfulComponent =(props)=>(
//   <div style{{color:props.color}}>
//   <p>This Component is{props.color}.</p>
// </div>
// );
const ColourfulComponent = ({ color }) => (
  <div style={{ color: color }}>
    <p>This Component is {color}.</p>
  </div>
);

// Prop Types for Validation
ColourfulComponent.propTypes = {
  color: PropTypes.string.isRequired,
};

const App = () => {
  const color1 = "blue";
  const color2 = "green";
  // Reusable UserProfile Component
  const UserProfile = (props) => (
    <div>
      <h1>Name:{props.name}</h1>
      <h1>Date of Birth:{props.dateOfBirth}</h1>
      <h1>Company:{props.company}</h1>
      <h1>University:{props.univercity}</h1>
    </div>
  );

  return (
    <div>
      <BlueComponent />
      <GreenComponent />
      <RedComponent />
      <ColourfulComponent color="yellow" />
      <ColourfulComponent color="brown" />
      <ColourfulComponent color="pink" />
      <ColourfulComponent color={color1}>
        <p>Blue is considered a calming color for the eyes.</p>
      </ColourfulComponent>
      <ColourfulComponent color={color2}>
        <p>Green symbolizes nature, renewal, and energy.</p>
      </ColourfulComponent>

      <UserProfile
        name="Mark Zuckerberg"
        dateOfBirth="1984-05-14"
        company="Meta (formerly Facebook)"
        univercity="Harvard University"
      />
    </div>
  );
};

export default App;
