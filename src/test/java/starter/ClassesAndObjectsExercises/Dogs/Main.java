package starter.ClassesAndObjectsExercises.Dogs;

public class Main {
    public static void main(String[] args) {
        Dogs lex = new Dogs("Lex", 11, "red-brown", 17.5, 'm');
        Dogs strain = new Dogs("Strain", "black", 'f');

        lex.lexPrintName();
        strain.strainPrintName();


    }

}
