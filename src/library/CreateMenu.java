package library;

import java.util.Map;

public class CreateMenu {

    public static void menu(final Storage storage) {
        String isbn, title, author, genre, year, risp;
        Map<String, String> book;
        risp = Utility.promptln("Would you like insert a new book? (yes/no)");

        while (risp.equals("yes")) {

            isbn = Utility.promptln("Insert isbn code");
            title = Utility.promptln("Insert the title");
            author = Utility.promptln("Insert the author");
            genre = Utility.promptln("Insert the genre");
            year = Utility.promptln("Insert the year");

            book = Storage.mkBook(isbn, title, author, genre, year);

            if (storage.save(book)) {
                System.out.println("Book entered");
            }

            System.out.println("Would you like insert a another book? (yes/no)");
            risp = Utility.readln();
        }

    }
}
