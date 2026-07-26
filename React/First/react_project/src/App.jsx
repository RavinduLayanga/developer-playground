const App = () => {
  const userName = "Alice";
  const greetUser = (name) => `Hello, ${name}!`;
  const userInfo = { age: 25, location: " New York" };
  //Inline style object
  const titleStyle = {
    color: "blue",
    fontSize: "24px",
    textAlign: "center",
    margin: "20px 0",
  };
  return (
    <>
      {/* Pasing strings with quotes */}
      <img src="images/nature.jpg" width="300" alt="Nature" />

      {/* Referancing a Javascript Variable */}
      <p>Your Name is : {userName}</p>

      {/* Calling a JavaScript Variable */}
      <p>Greeting: {greetUser(userName)}</p>

      {/* Using JavaScript object */}
      <p>
        Age: {userInfo.age}, Location: {userInfo.location}
      </p>
      <h1 style={titleStyle}> Welcome to React!</h1>
      {/* 
      <input type="text" placeholder="Type your name" autoComplete="off" /> */}
    </>
  );
};

//Export thr App component
export default App;
