const ShoppingList = ({ items }) => {
  const listStyle = {
    listStyleType: "none",
    padding: 0,
  };
  const itemStyle = {
    padding: "10px",
    margin: "5px 0",
    border: "1px solid #ccc",
    borderRadius: "5px",
    backgroundColor: "#f9f9f9",
    fontFamily: "Arial, sans-serif",
    fontSize: "16px",
  };
  // Directly mutating props (impure behaviour)
  // item.push({
  //   id: "add-item",
  //   label: "Add Item",
  // });

  // create new array, keeping props immutable
  const extendedItems = [...items, { id: "add item", label: "Add items" }];

  return (
    <ul style={listStyle}>
      {extendedItems.map((item) => (
        <li key={item.id} style={itemStyle}>
          {item.label}
        </li>
      ))}
    </ul>
  );
};

const App = () => {
  const items = [
    { id: 1, label: "Milk" },
    { id: 2, label: "Bread" },
    { id: 3, label: "Eggs" },
  ];
  return (
    <>
      <ShoppingList items={items} />
    </>
  );
};

export default App;
