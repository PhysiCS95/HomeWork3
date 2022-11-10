package task4;

import java.util.Scanner;
//Номер ключа для Pro: 1111a
//Номер ключа для Expert: 2222b

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер ключа");
        String key = input.next();

        if (key.equals("1111a")){
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            System.out.println("У Вас есть доступ к Pro версии");
        } else if (key.equals("2222b")) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("У Вас есть доступ к Expert версии");
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println("Вы ввели не верный ключ. У Вас базовая версия");
        }
    }
}
