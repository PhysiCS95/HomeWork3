package task3;

public class Ship extends Vehicle{
    int numberOfPass;
    String homePort;

     Ship (int price, int speed, int year, int numberOfPass, String homePort){
        super(price, speed, year);
        this.numberOfPass = numberOfPass;
        this.homePort = homePort;
    }
}
