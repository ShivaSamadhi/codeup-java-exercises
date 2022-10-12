package Grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApp {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student ramaj = new Student("Ramaj");
        ramaj.addGrade(99);
        ramaj.addGrade(90);
        ramaj.addGrade(92);
        ramaj.addGrade(97);
        ramaj.addGrade(89);

        Student jamar = new Student("Jamar");
        jamar.addGrade(93);
        jamar.addGrade(85);
        jamar.addGrade(90);
        jamar.addGrade(93);
        jamar.addGrade(92);

        Student anthony = new Student("Anthony");
        anthony.addGrade(93);
        anthony.addGrade(85);
        anthony.addGrade(90);
        anthony.addGrade(93);
        anthony.addGrade(92);

        students.put("ShivaSamadhi", ramaj);
        students.put("JamJar", jamar);
        students.put("AtomAnt", anthony);

        String seeStudents = "y";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Welcome To The Grading Portal.%nBelow Is A List Of GitHub Usernames For Available Students: %n");
            System.out.printf("%s%n", students.keySet());
            System.out.printf("Enter The Username Of The Student You Want More Information On: %n");
            String username = scanner.nextLine();

            if (students.get(username) == null) {
                System.out.printf("%s Does Not Match Any Of Our Records", username);
            } else {
                System.out.printf("%s Git Username: %s", students.get(username), username);
            }

            System.out.printf("%nContinue To New Student? y/n %n");
            seeStudents = scanner.nextLine();
        }
        while(seeStudents.equalsIgnoreCase("y"));

        if (seeStudents.equalsIgnoreCase("n")){
            System.out.printf("Thank You For Using The Grading Portal");
        }
    }
}
