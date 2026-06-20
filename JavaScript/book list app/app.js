//Book Class: represent a book
class Book {
  constructor(title, author, isbn) {
    this.author = author;
    this.title = title;
    this.isbn = isbn;
  }
}

//UI Class: handle UI tasks
class UI {
  static displayBooks() {
    const StoredBooks = [
      {
        title: "book one",
        author: "John Doe",
        isbn: "1234657",
      },
      {
        title: "book two",
        author: "Jane Doe",
        isbn: "98465789",
      },
    ];

    const books = StoredBooks;

    books.forEach((book) => UI.addBookToList(book));
  }

  static addBookToList(book) {
    const list = document.querySelector("#book-list");

    const row = document.createElement("tr");

    row.innerHTML = `
    <td>${book.title}</td>
    <td>${book.author}</td>
    <td>${book.isbn}</td>
    <td><a href="#" class="btn btn-danger btn-sm delete">X</a></td>
    `;

    list.appendChild(row);
  }

  static deleteBook(el) {
    if (el.classList.contains("delete")) {
      el.parentElement.parentElement.remove();
    }
  }

  static clearFields() {
    document.querySelector("#title").value = " ";
    document.querySelector("#author").value = " ";
    document.querySelector("#isbn").value = " ";
  }
}

// Store Class: handle storage
// Event: display books
document.addEventListener("DOMContentLoaded", UI.displayBooks);
// Event: add a book

document.querySelector("#book-form").addEventListener("submit", (e) => {
  // Prevent actual submit
  e.preventDefault();

  // Get form values
  const title = document.querySelector("#title").value;
  const author = document.querySelector("#author").value;
  const isbn = document.querySelector("#isbn").value;

  const book = new Book(title, author, isbn);

  // Add book to ui
  UI.addBookToList(book);

  // clear field
  UI.clearFields();
});

// Event: remove a book
document.querySelector("#book-list").addEventListener("click", (e) => {
  UI.deleteBook(e.target);
});
