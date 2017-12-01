package library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyStorage implements Storage {

    private final Map<String, Map<String, String>> storage = new HashMap<>();

    {
        storage.put("0-044-40723-8", mkBook("0-044-40723-8", "Farmer Giles of Ham", "J.R.R. Tolkien", "Fantasy", "1949"));
        storage.put("0-618-00221-9", mkBook("0-618-00221-9", "The Hobbit or There and Back Again", "J.R.R. Tolkien", "Fantasy", "1937"));
        storage.put("0-618-00222-7", mkBook("0-618-00222-7", "The Fellowship of the Ring", "J.R.R. Tolkien", "Fantasy", "1954"));
        storage.put("0-618-00223-5", mkBook("0-618-00223-5", "The Two Towers", "J.R.R. Tolkien", "Fantasy", "1954"));
        storage.put("0-618-00224-3", mkBook("0-618-00224-3", "The Return of the King", "J.R.R. Tolkien", "Fantasy", "1955"));
        
        storage.put("0-441-56956-0", mkBook("0-441-56956-0", "Neuromancer", "William Gibson", "Sci-fi", "1984"));
        storage.put("0-575-03696-6", mkBook("0-575-03696-6", "Count Zero", "William Gibson", "Sci-fi", "1986"));
        storage.put("0-553-05250-0", mkBook("0-553-05250-0", "Mona Lisa Overdrive", "William Gibson", "Sci-fi", "1988"));
        storage.put("0-553-26585-7", mkBook("0-553-26585-7", "Mindplayers", "Pat Cadigan", "Sci-fi", "1987"));
        
    }

    private static Map<String, String> mkBook(String isbn, String title, String author,
            String genre, String year) {
        final Map<String, String> book = new HashMap<>();
        book.put("isbn", isbn);
        book.put("title", title);
        book.put("author", author);
        book.put("genre", genre);
        book.put("year", year);

        return book;
    }

    @Override
    public boolean save(Map<String, String> book) {
        String isbn = book.get("isbn");
        if (isbn == null || isbn.trim().isEmpty()) {
            return false;
        }
        storage.put(isbn, book);
        return true;
    }

    @Override
    public boolean delete(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            return false;
        }
        if (!storage.containsKey(isbn)) {
            return false;
        }
        storage.remove(isbn);
        return true;
    }

    @Override
    public List<Map<String, String>> read() {
        final Collection<Map<String, String>> books = storage.values();
        return new ArrayList<>(books);
    }

}
