package Modul8.Praktikum;

public class Demo {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println("Nilai x \t: " + parent.x);
        parent.info();
    }
}
