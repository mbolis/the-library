package library;

import java.util.Map;

public interface Storage {
    boolean save(Map<String, String> book);
    boolean delete(String isbn);
    Map<String, String>[] read();
}
