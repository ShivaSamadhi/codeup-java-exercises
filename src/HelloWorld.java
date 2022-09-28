import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String myString = "Here is a string";
        System.out.println(myString);

        float myNumber = (float) 3.14;
        System.out.println(myNumber);
        //declaring a variable without initializing its value is fine but when we try to print that variable to the console it will throw us an error

        int x = 5;
        System.out.println(++x); // pre-increment = 6
        //System.out.println(x++); //post-increment = 5
        System.out.println(x); // regardless of pre or post incrementation, the second call of x will equal 6

        String theNumberThree = "three";
        Object o = theNumberThree;
        //int three = (int) o;
        //int three = (int) "three";
        //System.out.println(three);
        //this throws an error because a string cannot be cast to an int value with this particular syntax, even tho any value can be stored within an Object

        int x0 = 4;
        x0 += 5;

        int x1 = 3;
        int y1 = 4;
        y1 *= x1;

        int x2 = 10;
        int y2 = 2;
        x2 /= y2;
        y2 -= x2;

        short numShort = 10000;

        //We have already been using various properties of the System class to display information in the console, System.out.println and System.out.print.
        // Another method we can use is System.out.printf. This allows us to define a string with placeholders and then pass values for those placeholders.

        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        //In the example above, the %s will be replaced with the value of the name variable
        //Note that we do need to explicitly add a newline to the output, that's handled by our use of %n at the end which adds in a newline character after our output.

        String greeting = "Salutations";
        System.out.printf("%s, %s!%n", greeting, name);
        //In the example above: the %ss will be replaced with the additional passed arguments in the order that they were passed, thus printing "Salutations, codeup!" to the console.

        Scanner scanner = new Scanner(System.in);
        //First we declare a variable of type Scanner, and assign to it a new Scanner object. We also specify System.in for the source of the scanner. This refers to information a user types into the console, as opposed to, say, a text file.

        System.out.print("Enter something: ");
        String userInput = scanner.next();
        //String userInput = scanner.nextLine();
        //Next we prompt the user to type something, and use the expression scanner.next() to obtain the value the user entered as a String, and store it in the variable userInput

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //Lastly we'll print out the value the user entered.

        //EXAMPLE
        //Enter something: codeup rocks!
        //You entered: --> "codeup" <--
        //Every individual entry to the scanner is called a token, and, by default, tokens are separated by any whitespace (for example, the space character, or the newline character). When we called scanner.next(), we just got the next token, codeup, but if we called scanner.next() again, it would return the string rocks!, because these two parts are separated by whitespace.

        //If we want to get a whole line that was entered, we can use the nextLine method. It will return any remaining input on the current line as a String, and advance the scanner to the next line. In addition to nextLine, there are several other methods that will return the user input as a different type, for example, nextInt will return the user input as type int
        //Enter something: codeup rocks!
        //You entered: --> "codeup rocks!" <--
    }
}
