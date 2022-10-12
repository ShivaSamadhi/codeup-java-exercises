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
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome To The Grading Portal.%nBelow Is A List Of GitHub Usernames For Available Students: ");
        System.out.printf("%s", students.keySet());
        System.out.printf("Enter The Username Of The Student You Want More Information On: ");
        String username = scanner.nextLine();

        if(students.get(username) == null){
            System.out.printf("%s Does Not Match Any Of Our Records", username);
        }
        else {
            System.out.printf("%s Git Username: %s", students.get(username), username);
        }



    }
}
