package library;

import java.util.Scanner;

public class Utility {

    private static final Scanner IN = new Scanner(System.in);
    
    public static synchronized String readln() {
        return IN.nextLine();
    }
    
    public static synchronized String promptln(String question) {
        System.out.println(question);
        return IN.nextLine();
    }
}
