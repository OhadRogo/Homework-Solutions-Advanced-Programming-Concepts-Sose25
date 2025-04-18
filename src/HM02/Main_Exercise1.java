package HM02;

public class Main_Exercise1 {
    public static void main(String[] args) {
        Publication publication1 = new Publication("Data Structures", 2022);
        System.out.println(publication1.getInfo());

        Book book = new Book("Data Structures", 2020, "Jane Doe");
        System.out.println(book.getInfo());

        Textbook tb = new Textbook("Data Structures", 2020, "Jane Doe", "Computer Science");
        System.out.println(tb.getInfo());


    }
}
