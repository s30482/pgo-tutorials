import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("podaj liczbe");
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        if (x > 0)
            System.out.println("liczba poztywna");
        if (x < 0)
            System.out.println("liczba niegatywna");
        if (x == 0)
            System.out.println("= 0");
    }
}