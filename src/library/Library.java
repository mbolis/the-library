package library;

public class Library {

    public static void main(String[] args) {
        Storage storage = new DummyStorage();
        // your test code here...
        MainMenu.menu(storage);
    }
    
}
