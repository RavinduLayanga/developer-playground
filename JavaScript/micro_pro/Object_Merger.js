// Client Brief 2: Inventory State Update (Object Merger)
// Message from the Tech Lead:
// "When a pharmacist updates the stock for a medication in our system, the frontend only sends the fields that actually changed (like the new quantity). We need a utility function that takes the original database record and the incoming updates, and combines them. Crucially, it must NOT mutate the original database record directly in memory, otherwise our history logs will break."

// The Problem: You need to safely update an entity's state by merging old data with new data, which is the foundational concept of React state management.

// Your Input (Mock Data):

// JavaScript
// const currentMedicine = { id: "MED001", name: "Paracetamol", stock: 50, price: 120 };
// const incomingUpdate = { stock: 35 }; // Someone bought 15 units
// Acceptance Criteria: Write a function updateStock(current, updates) that returns a completely new object reflecting the change, leaving currentMedicine untouched.

// Expected Output: { id: "MED001", name: "Paracetamol", stock: 35, price: 120 }

const currentMedicine = {
  id: "MED001",
  name: "Paracetamol",
  stock: 50,
  price: 120,
};
const incomingUpdate = { stock: 35 };

function updateStock(current, updates) {
  return { ...current, ...updates };
}

console.log(updateStock(currentMedicine, incomingUpdate));
