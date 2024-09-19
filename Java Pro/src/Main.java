import java.util.Scanner;

public class Main {
    public void add(int a, int b, String y) {
        Scanner i = new Scanner(System.in);
        String st = i.nextLine();
        System.out.println("Welcome " + st);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        Main abc = new Main(); // Fixed the class name here
        abc.add(6, 5, "Hello");
    }
}