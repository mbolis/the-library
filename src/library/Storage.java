package library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Storage {

    public static Map<String, String> mkBook(String isbn, String title, String author,
            String genre, String year) {
        
        final Map<String, String> book = new HashMap<>();
        book.put("isbn", isbn);
        book.put("title", title);
        book.put("author", author);
        book.put("genre", genre);
        book.put("year", year);

        return book;
    }

    boolean save(Map<String, String> book);

    boolean delete(String isbn);

    List<Map<String, String>> read();
}
