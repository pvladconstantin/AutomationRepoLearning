package starter.PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("_____________");

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        System.out.println("____________");

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);
        System.out.println("__________");

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8 ,8);
        runRace(ferrariHybrid);
        System.out.println("__________");
    }


    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
