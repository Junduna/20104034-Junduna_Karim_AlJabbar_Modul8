package Modul8.Praktikum.book;

public class CourseBook extends Book{
    boolean onlyForReference;

    CourseBook(boolean val) {
        onlyForReference = val;
    }

    @Override
    public void issueBook(int days) {
        if (onlyForReference)
            System.out.println("Reference Book");
        else {
            if (days < 14)
                super.issueBook(days);
            else
                System.out.println("days >= 14");
        }
    }
}
