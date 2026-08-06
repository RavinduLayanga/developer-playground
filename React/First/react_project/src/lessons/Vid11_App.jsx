import CarList from "./components/CarList";
const App = () => {
  return (
    <div>
      <h1>Welcome to the Car Showroom!</h1>
      <CarList make="Tesla" />
      <CarList make="Toyota" />
      <CarList />
    </div>
  );
};

export default App;
