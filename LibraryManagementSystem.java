import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();
        library.getBooks().addAll(LibraryFileHandler.loadBooksFromFile());

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. View all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Mark book as borrowed/available");
            System.out.println("5. Remove a book");
            System.out.println("6. Save and exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter published year: ");
                    int year = scanner.nextInt();
                    library.addBook(new Book(title, author, isbn, year));
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter book title or author to search: ");
                    String keyword = scanner.nextLine();
                    Book book = library.searchBook(keyword);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book ISBN to mark as borrowed/available: ");
                    isbn = scanner.nextLine();
                    book = library.searchBook(isbn);
                    if (book != null) {
                        book.setAvailable(!book.isAvailable());
                        System.out.println("Book status updated successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter book ISBN to remove: ");
                    isbn = scanner.nextLine();
                    if (library.removeBook(isbn)) {
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    LibraryFileHandler.saveBooksToFile(library.getBooks());
                    System.out.println("Library data saved. Exiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
