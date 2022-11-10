package task2;

import java.util.Scanner;

public class ClassRoom extends Pupil{

    public ClassRoom(String Pavel, String Alina, String Natasha, String Anton){

    }

    public static void main(String[] args) {

        System.out.println("В классе 4 ученика. Pavel, Alina, Natasha, Anton");
        System.out.print("Введите имя ученика: ");

        Scanner input = new Scanner(System.in);

        Pupil pupil = new Pupil();
        Pupil good = new GoodPupil();
        Pupil excelen = new ExcelentPupil();
        Pupil bad = new BadPupil();



        for (int i = 0; i < 4; i++) {
            String name = input.next();
            if (name.equals("Pavel")){
                good.read();
                good.study();
                excelen.write();
                bad.relax();
                System.out.print("Введите имя следующего ученика: ");
            } else if (name.equals("Alina")) {
                bad.read();
                good.study();
                good.write();
                excelen.relax();
                System.out.print("Введите имя следующего ученика: ");
            } else if (name.equals("Natasha")) {
                excelen.read();
                bad.study();
                bad.write();
                good.relax();
                System.out.print("Введите имя следующего ученика: ");
            } else if (name.equals("Anton")) {
                excelen.read();
                excelen.study();
                excelen.write();
                bad.relax();
            } else System.out.println("Такого ученика нет");
            System.out.print("Введите имя следующего ученика: ");
        }
    }

} //НЕ УВЕРЕН ПРАВИЛЬНО ЛИ Я ПОНЯЛ ЗАДАЧУ. ИЗВИНИТЕ =(
