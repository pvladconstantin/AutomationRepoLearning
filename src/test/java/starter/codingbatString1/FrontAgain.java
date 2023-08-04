package starter.codingbatString1;

public class FrontAgain {
    String str = "edited"; //if first two letters could be found within the last two letters, return true

    public boolean frontAgainMethod() { // Corrected method declaration
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);
            return firstTwo.equals(lastTwo);
        }
        return false;
    }

    public static void main(String[] args) {
        FrontAgain execute = new FrontAgain();
        System.out.println(execute.frontAgainMethod()); // Corrected method invocation
    }
}
