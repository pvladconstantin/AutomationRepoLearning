package starter.codingbatLogic1;

public class ShareDigit {
    int a=12;
    int b=43;
    int aLeftDigit = a / 10; // Extract the left digit of 'a'
    int aRightDigit = a % 10; // Extract the right digit of 'a'
    int bLeftDigit = b / 10; // Extract the left digit of 'b'
    int bRightDigit = b % 10; // Extract the right digit of 'b'

    public boolean Method() {
        return (aLeftDigit == bLeftDigit || aLeftDigit == bRightDigit || aRightDigit == bLeftDigit || aRightDigit == bRightDigit);
    }

    public static void main(String[] args) {
        ShareDigit execute = new ShareDigit();
        System.out.println(execute.Method());
    }
}
