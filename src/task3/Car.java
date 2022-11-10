package task3;

public class Car extends Vehicle{
    String name;
    String collor;

    Car (int price, int speed, int year, String name, String collor){
        super(price, speed, year);
        this.name = name;
        this.collor = collor;
    }
}
