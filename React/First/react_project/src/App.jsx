// If you ever need to disable the PropTypes warning for an entire file,
// you would put this exact comment on line 1:
// /* eslint-disable react/prop-types */

import PropTypes from "prop-types";

// ==========================================
// 1. HARDCODED COMPONENTS (The "Bad" Way)
// ==========================================
// These are not reusable.
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

// ==========================================
// 2. THE EVOLUTION OF PROPS (Reference Guide)
// ==========================================

/* 
  METHOD A: The Old Way (Using the full 'props' object)
  Notice how you have to type "props." every single time.
  
  const ColourfulComponent = (props) => (
    <div style={{ color: props.color }}>
      <p>This Component is {props.color}.</p>
      {props.children}
    </div>
  );
*/

/* 
  METHOD B: The Old Way + The || (Logical OR) Operator
  If no color is provided, it falls back to "blue".
  
  const ColourfulComponent = (props) => (
    <div style={{ color: props.color || "blue" }}>
      <p>This Component is {props.color || "blue"}.</p>
      {props.children}
    </div>
  );
*/

/* 
  METHOD C: The Old Way + PropTypes Validation
  Before modern tools, developers used this library to catch errors 
  (like passing a number when the component expected a string). 
  
  const ColourfulComponent = (props) => ( ... );
  
  ColourfulComponent.propTypes = {
    color: PropTypes.string.isRequired,
  };

  WHY WE DON'T USE THIS ANYMORE:
  Typing out propTypes for every single component was exhausting. 
  Today, the modern industry standard is to use TypeScript. 
  TypeScript is a version of JavaScript that forces strict data types 
  and checks for these exact errors before the code even runs, 
  making the 'prop-types' library completely obsolete.
*/

// ==========================================
// 3. THE MODERN WAY (Destructuring + Default Params)
// ==========================================
// This is the active component that will actually run!
// 1. We use { color, children } to instantly extract what we need.
// 2. We use = "blue" right in the parameters to set a default value,
//    which completely replaces the need for the old || operator.

const ColourfulComponent = ({ color = "blue", children }) => (
  <div style={{ color: color }}>
    <p>This Component is {color}.</p>
    {children}
  </div>
);

const App = () => {
  const color1 = "blue";
  const color2 = "green";

  // ==========================================
  // MULTIPLE PROPS EXAMPLE
  // ==========================================
  // Here is a component taking in a larger props object without destructuring.
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
      {/* Rendering the hardcoded components */}
      <BlueComponent />
      <GreenComponent />
      <RedComponent />

      {/* Rendering the reusable component with string props */}
      <ColourfulComponent color="yellow" />
      <ColourfulComponent color="brown" />
      <ColourfulComponent color="pink" />

      {/* Rendering with variables and passing 'children' (the <p> tags) */}
      <ColourfulComponent color={color1}>
        <p>Blue is considered a calming color for the eyes.</p>
      </ColourfulComponent>

      <ColourfulComponent color={color2}>
        <p>Green symbolizes nature, renewal, and energy.</p>
      </ColourfulComponent>

      {/* Passing multiple custom props to build a profile */}
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
