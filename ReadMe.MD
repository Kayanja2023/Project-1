# Library Management System (Console Application)

## 📌 Overview
The **Library Management System** is a simple Java-based console application designed to manage a collection of books. Users can add, search, remove, and update book statuses while persisting data using file storage.

---

## 🛠 Features
- ✅ **Add a new book** (Title, Author, ISBN, Published Year)
- 🔍 **Search for a book** by title or author
- 📚 **View all available books** in the library
- 🔄 **Mark a book as borrowed or available**
- 🗑️ **Remove a book** from the system
- 💾 **Persist data** using file storage (`libraryData.txt`)
- 🎯 **User-friendly menu-driven interface**

---

## 📂 Project Structure
```sh
LibraryManagementSystem/
├── src/
│   ├── LibraryManagementSystem.java   // Main entry point for user interaction
│   ├── Book.java                      // Defines the Book class (Model)
│   ├── Library.java                    // Manages book operations (CRUD logic)
│   ├── LibraryFileHandler.java         // Handles file I/O for saving/loading books
│   ├── libraryData.txt                 // Stores the list of books (persistent data)
│
├── README.md                           // Project documentation
├── .gitignore                           // Ignore compiled files & libraryData.txt in Git

## 🚀 Getting Started

This section will help you set up and run the **Library Management System** on your local machine.

---

### 1️⃣ Prerequisites
Before running the project, ensure you have the following installed:

#### 🔹 Required:
- **Java Development Kit (JDK 8+)** - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- A **Java IDE** (e.g., **IntelliJ IDEA**, **Eclipse**, or **VS Code**) or a terminal for compilation.

#### 🔹 Optional (For Advanced Users):
- **Git for version control** - [Download Git](https://git-scm.com/downloads)

---

### 2️⃣ Installation & Running the Project
You can run the project using an **IDE** or **Command Line**.

#### **Option 1: Using an IDE (IntelliJ, Eclipse, VS Code)**
1. **Clone the repository** (if using Git):
   ```sh
   git clone https://github.com/yourusername/LibraryManagementSystem.git
   cd LibraryManagementSystem

#### **Option 2: Using the Terminal**
1. **Navigate to the project folder**:
   ```sh
   cd path/to/LibraryManagementSystem

2. **Compile the java files**:
    ```sh
     javac -d bin src/*.java

    - The -d bin flag ensures that compiled .class files are stored in a separate bin/ directory

3. **Run the program**
```sh
java -cp bin LibraryManagementSystem
```
4. **Expected Output**
```sh
Library Management System
1. Add a new book
2. View all books
3. Search for a book
4. Mark book as borrowed/available
5. Remove a book
6. Save and exit
