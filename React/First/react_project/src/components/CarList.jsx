const CarList = ({ make }) => {
  const cars = [
    { id: 1, make: "Toyota", model: "Camry", color: "Silver" },
    { id: 2, make: "Honda", model: "Civic", color: "Red" },
    { id: 3, make: "Ford", model: "Mustang", color: "Blue" },
    { id: 4, make: "Tesla", model: "Model 3", color: "Black" },
    { id: 5, make: "BMW", model: "X5", color: "White" },
    { id: 6, make: "Toyota", model: "Corolla", color: "Grey" },
    { id: 7, make: "Honda", model: "Accord", color: "Green" },
    { id: 8, make: "Ford", model: "F-150", color: "Red" },
    { id: 9, make: "Tesla", model: "Model S", color: "White" },
    { id: 10, make: "BMW", model: "3 Series", color: "Black" },
    { id: 11, make: "Toyota", model: "RAV4", color: "Blue" },
    { id: 12, make: "Honda", model: "CR-V", color: "Silver" },
    { id: 13, make: "Ford", model: "Escape", color: "White" },
    { id: 14, make: "Tesla", model: "Model Y", color: "Red" },
    { id: 15, make: "BMW", model: "5 Series", color: "Black" },
  ];
  const filteredCars = make ? cars.filter((car) => car.make === make) : cars;
  return (
    <div>
      <h2>Car - {make ? `${make} cars.` : "All Models."}</h2>
      <ul>
        {filteredCars.map((car) => (
          <li key={car.id}>
            <h3>
              {car.make} {car.model}
            </h3>
            <p>Color: {car.color}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CarList;
