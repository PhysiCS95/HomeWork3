package task3;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane(10000000, 2500, 2009, 3600, 2);
        System.out.println("Цена: " + plane.price + " Скорость: " + plane.speed + " Год выпуска: " + plane.year +
                " Высота: " + plane.height + " Количество пасажиров: " + plane.numberOfPass);
        Ship ship = new Ship(750000000, 60, 1982, 510, "Чорне море");
        System.out.println("Цена: " + ship.price + " Скорость: " + ship.speed + " Год выпуска: " + ship.year +
                " Количество пасажиров: " + ship.numberOfPass + " Порт приписки: " + ship.homePort);
        Car car = new Car(10000, 220, 2015, "Ford", "Red");
        System.out.println("Цена: " + car.price + " Скорость: " + car.speed + " Год выпуска: " + car.year +
                " Марка машины: " + car.name + " Цвет: " + car.collor);
    }
}
