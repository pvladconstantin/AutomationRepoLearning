package starter.ClassesAndObjectsExercises;

public class Main {

    public static void main(String[] args) {


        //Car exercise
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " +car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();


        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();

        System.out.println("======THERE ENDS THE CAR EXERCISE=======");



        //Bank account exercise

        //BankAccount bobAccount = new BankAccount("12345", 500.00, "Bob Brown", "myemail@bob.com", "(087) 123 4567");

        BankAccount bobAccount = new BankAccount();

        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());


//        bobAccount.setNumber("12345");
//        bobAccount.setBalance(1000.0);
//        bobAccount.setCustomerName("Bob Brown");
//        bobAccount.setCustomerEmail("myemail@bob.com");
//        bobAccount.setPhone("(087) 123 4567");

        bobAccount.depositFunds(120.0);
        bobAccount.withdrawFunds(100.0);
        bobAccount.withdrawFunds(12.25);
        bobAccount.withdrawFunds(100.5);


        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");

        System.out.println("AccountNo: " + timsAccount.getNumber() + "; name " + timsAccount.getCustomerName());

        System.out.println("======THERE ENDS THE BankAccount exercise DESCRIPTION=======");


        Customer customer = new Customer("Ionut", 1250.0, "ionut@myemail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        System.out.println("======THERE ENDS THE CUSTOMER ACCOUNT DESCRIPTION=======");


        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        System.out.println("======THERE ENDS THE CUSTOMER ACCOUNT DESCRIPTION=======");


        Customer thirdCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());


        System.out.println("======THERE ENDS THE CUSTOMER ACCOUNT DESCRIPTION=======");


    }
}
