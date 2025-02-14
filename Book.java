public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String isbn, int publishedYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.isAvailable = true;  // By default, a book is available
    }

    // Getters and setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPublishedYear() { return publishedYear; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) { this.isAvailable = available; }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn +
               ", Year: " + publishedYear + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}
