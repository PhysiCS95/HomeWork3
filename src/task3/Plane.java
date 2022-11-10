package task3;

public class Plane extends Vehicle{
    int height;
    int numberOfPass;

     Plane(int price, int speed, int year, int height, int numberOfPass){
        super(price, speed, year);
        this.height = height;
        this.numberOfPass = numberOfPass;
    }


}

