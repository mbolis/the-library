package library;

import java.util.List;
import java.util.Map;

public interface Storage {
    boolean save(Map<String, String> book);
    boolean delete(String isbn);
    List<Map<String, String>> read();
}
