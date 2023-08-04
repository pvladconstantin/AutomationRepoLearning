package starter.ClassesAndObjectsExercises.POJO;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S20414" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("S923004", "Ann",
                "05/11/1984", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S292402", "Bill",
                "02/12/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
        //recordStudent.setClassList(recordStudent.classList()+ ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName()+ " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name()+ " is taking " +
                recordStudent.classList());
    }
}



