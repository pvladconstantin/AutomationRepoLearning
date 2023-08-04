package starter;

public class TestClass {
    public Boolean tester(){
        return false;
    }
    public static void main(String[] args) throws Exception {
        TestClass tc = new TestClass();
        while(tc.tester()){
            System.out.println("running...");
        }
    }
}