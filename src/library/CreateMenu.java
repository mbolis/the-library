package library;

import java.util.Map;

public class CreateMenu {

    static String readln() {
        return new java.util.Scanner(System.in).nextLine();
    }
    
    public static void menu(final Storage storage) {   
        String isbn, title, author, genre, year, risp;
        Map<String, String> book;
        System.out.println("Would you like insert a new book? (yes/no)");
        risp = readln();

        while (risp.equals("yes")){    

        System.out.println("Insert isbn code");
        isbn = readln();
        System.out.println("Insert the title");
        title = readln();
        System.out.println("Insert the author");
        author = readln();
        System.out.println("Insert the genre");
        genre = readln();
        System.out.println("Insert the year");
        year = readln();

        book = DummyStorage.mkBook(isbn, title, author, genre, year);
        
        if (storage.save(book)){
            System.out.println("Book entered");
        }
        
        System.out.println("Would you like insert a another book? (yes/no)");
        risp = readln();
        }


        // write book information prompt
        // read user input
        // magic
        // save new book inside storage
    }
}
