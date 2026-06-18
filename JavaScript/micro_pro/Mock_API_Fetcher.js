// Client Brief 3: The Unreliable Server (Mock API Fetcher)
// Message from the Client:
// "Our new marketing page needs to display a list of placeholder users. We are getting this data from a public external server. However, that external server is sometimes slow or goes offline entirely. We need a script that fetches the data, but if the server fails, the app shouldn't crash—it should log a clean error message to the console."

// The Problem: Network requests take time and can fail. You must handle the waiting period and the potential failure securely.

// Your Input: The public URL: https://jsonplaceholder.typicode.com/users

// Acceptance Criteria:

// Write an asynchronous function that reaches out to that URL.

// Extract only the names of the users from the response and log them to the console.

// Manually change the URL to something fake (like https://jsonplaceholdeeeeer.com/users) and ensure your code catches the crash and prints a friendly fallback message instead of a massive red system error.

async function fetchUsers() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    const data = await response.json();
    const users = data.map((user) => `${user.name}`);
    const listContainr = document.getElementById("user-display");
    listContainr.innerHTML = users.map((name) => `<li>${name}</li>`).join(" ");
    console.log(users);
    // console.log(data);
  } catch (error) {
    console.log("Unable to load user profiles.");
    document.getElementById("user-display").innerHTML =
      "<h4>Unable to load user profiles.</h4>";
  }
}

fetchUsers();
