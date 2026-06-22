// Client Brief 4: The Corporate Migration (CSV-to-JSON Parser)
// Message from the Data Migration Team:
// "HR gave us the new employee roster, but it's in a raw CSV text format. Our new Node.js backend only understands structured JSON arrays. We need a script to run on the server that reads this raw text and converts it into an array of objects so we can insert it into our database."

// The Problem: You need to manipulate strings and arrays to convert unstructured text into structured, usable data.

// Your Input (Mock Data):

// JavaScript
// const csvData = "id,name,role\n1,Amara,Engineer\n2,Kasun,Designer\n3,Salinda,Manager";
// Acceptance Criteria: Write a script that splits the string by line breaks and commas, dynamically creating an array of objects.

// Expected Output:

// JavaScript
// [
//   { id: "1", name: "Amara", role: "Engineer" },
//   { id: "2", name: "Kasun", role: "Designer" },
//   { id: "3", name: "Salinda", role: "Manager" }
// ]

const csvData =
  "id,name,role\n1,Amara,Engineer\n2,Kasun,Designer\n3,Salinda,Manager";

const rows = csvData.split("\n");
const headers = rows.shift().split(",");

const employeesArray = rows.map((row) => {
  const columns = row.split(",");

  let obj = {};

  headers.forEach((header, index) => {
    obj[header] = columns[index];
  });
  return obj;
});

console.log(employeesArray);
