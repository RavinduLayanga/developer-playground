// ==========================================
// 1. PURE COMPONENT (The React Way)
// ==========================================
// A pure component acts like a strict math equation.
// If you give it the exact same input (name), it will ALWAYS
// return the exact same output. It does not mess with anything else.
const Greeting = ({ name }) => {
  return <h1>Hello, {name}!</h1>;
};

// ==========================================
// 2. IMPURE COMPONENT (The Bad Way)
// ==========================================
// This is breaking the rules because it relies on and modifies
// a variable that exists OUTSIDE of the component.

let counter = 0; // <-- The external variable

const ImpureGreeting = ({ name }) => {
  console.log("rendering ImpureGreeting");

  // SIDE EFFECT: We are modifying something outside of this function!
  counter++;
  console.log("counter value: ", counter);

  // Because of the counter, if we pass name="Vimal" three times,
  // we get three completely DIFFERENT results on the screen.
  return (
    <h1>
      Hello, {name}! Count: {counter}
    </h1>
  );
};

const App = () => {
  return (
    <>
      {/* These will always render exactly the same way. Predictable! */}
      <Greeting name="Kamal" />
      <Greeting name="Kamal" />
      <Greeting name="Kamal" />

      {/* These will render differently every single time. Unpredictable! */}
      <ImpureGreeting name="Vimal" />
      <ImpureGreeting name="Vimal" />
      <ImpureGreeting name="Vimal" />
      <ImpureGreeting name="Vimal" />
    </>
  );
};

export default App;
