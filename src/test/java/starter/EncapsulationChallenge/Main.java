package starter.EncapsulationChallenge;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true); // duplex true = print on both sides of the paper; false - print only one side per paper
        System.out.println("initial page count = " +printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(1);
        System.out.printf("Current Job Pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

    }
}
