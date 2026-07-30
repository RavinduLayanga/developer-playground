import TodoItem from "./TodoItem";
const TodoList = () => {
  const listStyle = {
    listStyleType: "none",
    padding: 0,
  };
  return (
    <div>
      <h2>My To-Do List</h2>
      <ul style={listStyle}>
        <TodoItem description="Buy groceries" finished={false} />
        <TodoItem description="Wash the car" finished={true} />
        <TodoItem description="Reed the book" finished={false} />
      </ul>
    </div>
  );
};

export default TodoList;
