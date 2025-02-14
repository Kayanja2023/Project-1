import java.io.*;
import java.util.ArrayList;

public class LibraryFileHandler {
    private static final String FILE_PATH = "libraryData.txt";

    public static void saveBooksToFile(ArrayList<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    public static ArrayList<Book> loadBooksFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (ArrayList<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No saved library data found. Starting with an empty library.");
            return new ArrayList<>();
        }
    }
}
