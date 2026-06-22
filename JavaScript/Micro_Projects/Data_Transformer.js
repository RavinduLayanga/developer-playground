// Client Brief 1: The Dispatcher Dashboard (Data Transformer)
// Message from the Client (Operations Manager):
// "We are building a new dashboard for our fleet dispatchers. Our legacy database gives us a messy list of all drivers, but the dispatchers only want to see the active ones. Also, they don't want to see all the background data—just a clean, readable label with the driver's name and what vehicle they are driving so they can assign routes quickly."

// The Problem: You have raw, bloated data, and you need to filter out the noise and reshape it for a UI.

// Your Input (Mock Data):

// JavaScript
// const drivers = [
//   { id: 1, name: "Kamal", vehicle: "Van", status: "active" },
//   { id: 2, name: "Ruwan", vehicle: "Truck", status: "off-duty" },
//   { id: 3, name: "Nimal", vehicle: "Motorcycle", status: "active" }
// ];
// Acceptance Criteria: Write a script that evaluates the array and outputs a brand new array of strings that looks exactly like this:
// ["Kamal - Van", "Nimal - Motorcycle"]

console.log("Dispatcher Dashboard - Data Transformer");
const drivers = [
  { id: 1, name: "Kamal", vehicle: "Van", status: "active" },
  { id: 2, name: "Ruwan", vehicle: "Truck", status: "off-duty" },
  { id: 3, name: "Nimal", vehicle: "Motorcycle", status: "active" },
];

const activeDrivers = [];

for (let i = 0; i < drivers.length; i++) {
  if (drivers[i].status === "active") {
    activeDrivers.push(`${drivers[i].name} - ${drivers[i].vehicle}`);
  }
}

console.log(activeDrivers);

const activeDrivers2 = drivers
  .filter((driver) => driver.status === "active")
  .map((driver) => `${driver.name} - ${driver.vehicle}`);

console.log(activeDrivers2);
