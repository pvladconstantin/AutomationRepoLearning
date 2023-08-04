package starter.InheritanceChallenge1;

public class Worker {

    private String name;
    private String birthDay;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDay.substring(6));

        return (currentYear-birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
