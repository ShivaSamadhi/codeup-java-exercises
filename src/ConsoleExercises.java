import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: --> \"" + userInput + "\" <--");

//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner2.next();
//        String userInput2 = scanner2.next();
//        String userInput3 = scanner2.next();
//        System.out.printf("%s!%n%s!%n%s!%n", userInput1, userInput2, userInput3);
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner3.nextLine();
//        System.out.printf("Your sentence is: \"%s\"%n", sentence);

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter the width of your room (in feet): ");
        String width = scanner4.nextLine();
        System.out.print("Enter the length of your room (in feet): ");
        String length = scanner4.nextLine();

        int perimeter = (Integer.parseInt(width)*2) + (Integer.parseInt(length)*2);
        int area = Integer.parseInt(width) * Integer.parseInt(length);
        System.out.printf("The area of this room is %s square feet.%nThe perimeter of this room is %s feet.", area, perimeter);
    }
}
