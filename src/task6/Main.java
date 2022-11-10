package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите одно слово");
        String word = input.next();

        Printer standard = new Printer();
        Printer red = new Red();
        Printer yellow = new Yellow();

        standard.print(word);
        red.print(word);
        yellow.print(word);
    }
}
