package Modul8.Praktikum.book;

public class BookExample {
    public static void main(String[] args) {
        Book book1 = new CourseBook(true);
        book1.issueBook(100);

        Book book2 = new CourseBook(false);
        book2.issueBook(100);

        Book book3 = new Book();
        book3.issueBook(100);
    }
}
