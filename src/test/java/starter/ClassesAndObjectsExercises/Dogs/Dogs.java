package starter.ClassesAndObjectsExercises.Dogs;

public class Dogs {
    private String DogName;
    private int DogAge;
    private String DogColor;
    private double DogWeight;
    private char DogGender;



    public Dogs(String name, int age, String color, double weight, char gender) {
        DogName = name;
        DogAge = age;
        DogColor = color;
        DogWeight = weight;
        DogGender = gender;
    }

    public Dogs(String dogName, String dogColor, char dogGender) {
        DogName = dogName;
        DogColor = dogColor;
        DogGender = dogGender;
    }

    public void lexPrintName() {
        System.out.println("This Dog's name is: " + DogName + ", has the age of: " + DogAge + ", color: " + DogColor + ", weight: " + DogWeight + ", and its gender is: " + DogGender);
    }

    public void strainPrintName() {
        System.out.println("This Dog's name is: " + DogName + ", color" + DogColor + ", and its gender is: " + DogGender);
    }
}
