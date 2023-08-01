package starter.ClassAndMethods.TimAndBatCars;

public class Main {

    public static void main(String[] args) {

        Car timCar = new Car("Tim's car");
        Car batCar = new Car("The Batmobile");

        timCar.accelerate(5);
        timCar.accelerate(30);
        timCar.brake(4);

        //batCar.accelerate(0);
        batCar.accelerate(10);
        batCar.brake(5);
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName) {

        name = carName;
    }

    public void accelerate(int amount) {
        speed += amount;
        showSpeed();
    }

    public void brake(int speedReduction) {
        if (speed < speedReduction) {
            speed = 0;
            System.out.println("The speedReduction value was higher than the speed value. Speed set to 0");
        } else {
            speed -= speedReduction;
            showSpeed();
        }
    }

    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed);
    }
}
