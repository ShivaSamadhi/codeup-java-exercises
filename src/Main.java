import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//PRIMITIVE TYPES
        byte age = 30;
        //byte can store numbers up from -128 to 127
        int viewsCount = 123_456_789;
        //int can store numbers up to 2Billion
        long viewCount2 = 3_123_456_789L;
        //the java compiler recognizes the number as an int, so adding L to the end helps the compiler recognize the number as a long int
        float price = 10.99F;
        //by default the java compiler recognizes this decimal as a 'double', so the suffix F helps it recognize the decimal as a float
        char letter = 'A';
        //'char' accepts a single letter while 'string' accepts a series of letters
        boolean isEligible = false;

//REFERENCE TYPES
        Date now = new Date();
        //for primitive types, memory is automatically allocated and released by JRE, but for reference types the keyword 'new' is used to allocate memory for the reference type
        //based on the syntax, the variable 'now' is a new instance of the Date class. Each instance of a class is its own object

//        now.getTime();
        //these objects have members that can be accessed using dot notation (as seen above). Primitive types do not have members!
        System.out.println(now);

        String message = "Hello World";
        //strings are a reference type in Java, but notice that we dont have to use the new String() syntax to initialized it, instead we use a string literal. We can also concatenate strings using + similarly to how its done in javascript
        //because String is a class, it has members that can be used on it to perform specific tasks, such as .indexOf, .startsWith, .length, .replace, etc
        //strings are IMMUTABLE! Any method called on a string with the intent of modifying it will return an entirely new string leaving the original string unchanged.

        int[] numArr = new int[5];
        //in order to create an array of numbers, we place square brackets directly after our int keyword. Because arrays are a reference, we follow the proper syntax for initializing => new int[5]. In this example, 5 represents the length of the array aka the amount of items we want to store within the array
        //storing values within the array is similar to JS (as we will see below) which is done by referencing the index of the array and giving it a value
        numArr[0] = 1;
        numArr[1] = 2;
        numArr[2] = 3;
        numArr[3] = 4;
        numArr[4] = 5;
        //if we try to print the array to the console as it is now, we will only get back a reference to the memory space it is stored in. The proper way to print an array is as follows
        System.out.println(Arrays.toString(numArr));
        //first we call the Arrays class and use the .toString method to print a string that contains our array. in the case of the .toString method, each primitive type has its own version of this Arrays method. This is called 'method overloading'
        int[] numbers = {1,2,3,4,5};
        //because the original initialization syntax is a bit long, this more modern array syntax was created
        //this syntax can also be used to create multidimensional arrays by simply adding another square bracket in the front (int[][]) and nesting curly braces to match ({ {...},{...} })
        //Arrays have a fixed length, once created additional items cannot be added or removed from the array

//PRIMITIVE VS REFERENCE MEMORY
        byte x = 1;
        byte y = x;
        x = 2;
        //for primitive data, memory locations are independent of one another and are used to actually store data so if we reassign x after its initialization it will not change the value of y, again those locations are independent.
        //PRIMITIVE TYPES ARE COPIED BY THEIR INDEPENDENT VALUES
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        //in the case of reference types this behavior is not the same because the memory location of the point1 is actually a 'reference' to the memory location of the Point obj. this means that both point1 and point2 are referring to the exact same Point obj in memory. This means that any change to one var will be visible to the other as long as they are referring to the same thing
        point1.x = 2;
        System.out.println(point2);
        //by using dot notation we can mutate x which is a member of the Point class. If we print the value of point2 to the console we can see that the change to x that was made thru point1 is visible as part of point2 => .Point[x=2, y=1]
        //REFERENCE TYPES ARE COPIED BY THEIR REFERENCES

//CONSTANTS
        final float PI = 3.14F;
        //the keyword final allows us to create constants aka variables that are immutable. final variables should be named in all caps

//ARITHMETIC EXPRESSIONS
        //java has all the standard arithmetic expressions that we could find in JS, including the % modulus operator. The only one that is a bit more nuanced is the division operator because of the nature of how different numbers are treated within the primitive types

        int expression = 10/3;
        //Although we would normally expect this expression to be returned as a decimal, that is not the case. Because this expression is categorized as an int, the return value of 10/3 would be an integer of 3. if we wanted to get a decimal value for this expression, we would need to change up the syntax to account for that

        double expression2 = (double)10/(double)3;

//CASTING
        //Casting is the processes by which values of different types are converted in order to produce a consistent result.
        // If a value is being converted into a data type that has more available memory space then this conversion happens automatically under the hood as IMPLICIT CASTING. Example as follows

        short xShort = 1;
        //short = 2 bytes of memory
        int yInt = xShort + 2;
        //int = 4 bytes of memory

        //because the memory space of a short can be easily stored within the lerger memory space of an int, IMPLICIT CASTING converts the types easily. Under this logic the automatic conversion chain looks like this:
        // byte -> short -> int -> long -> float -> double
        //Implicit casting happens when there is no loss of data between conversions. EXPLICIT CASTING is the opposite, meaning that some data will be lost during the conversion

        double xDouble = 1.1;
        int yInt2 = (int)xDouble + 2;
        //w/o the int prefix, the return value the expression would cause an error because data would be lost if we converted a double to an integer. So we have to explicitly state that we want to convert our double value into an int value, thus giving us a return of 3 instead of the 3.1 that we might normally expect

        //casting only happens between compatible types. The conversion chain we created above only works because all of those types essentially refer to some form of a number. Under this logic, a string cannot be converted to a number unless we use the appropriate wrapper class for the conversion

        String xString = "1";
        int yInt3 = Integer.parseInt(xString) + 2;
        //there are other wrapper classes such as Short.parseShort() Float.parseFloat() and so on with a similar syntax structure

//METHODS
        //Methods are similar to functions in JS where a series of statements are used to accomplish a specific task. The basic syntax for most methods is as follows:

        //public static returnType methodName([param1[, param2[, ...]]) {
        //// the statements of the method
        //// a return statement, if a return type is declared
        //}

//        public static String sayHello(String xString) {
//            return String.format("Hello, %s!", xString);
//        }

        //Public: This defines whether or not other classes can see this method. For now, just put public here.
        //Static: the presence of this keyword defines that the method belongs to the class, as opposed to instances of it. For now, we will define all of our methods as static. We'll explore this concept in more detail in the next lesson.

        //String: this is the return type of the method. In Java, all methods must define the type of the value they will return. If a method does not return anything, the special keyword void is used here.
        // If a method defines a return type, it must have a return statement. It is a compile time error for a method that defines a return type to not return anything, or to return a value of a type other than the one that is specified.
        // If a method's return type is void, it is a compile time error to return anything inside of the method; however, methods with a void return type can still use the return keyword to exit the method early.

        //sayHello: the name of the method. Method names follow the same rules as variable names.
        //(String ...): the parameter the method accepts. A method can be defined with no parameters, one parameter (like in our example), or multiple parameters (separated by commas). A type must be specified for each parameter.

//        public static void sayHello(String greeting, String name) {
//            System.out.printf("%s, %s!\n", greeting, name);
//        }
//
//        public static int returnThree() {
//            return 3;
//        }
//
//        public static String shout(String s) {
//            return s.toUpperCase() + "!!!";
//        }

//METHOD OVERLOADING
        //Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters. Overloaded methods can call other versions of themselves, and are commonly used to provide default values for arguments.

        // version 1
//        public static void sayHello(int times) {
//            for (int i = 0; i < times; i += 1) {
//                sayHello();
//            }
//        }
//        // version 2
//        public static void sayHello() {
//            sayHello("Hello", "World");
//        }
//        // version 3
//        public static void sayHello(String name) {
//            sayHello("Hello", name);
//        }
//        // version 4
//        public static void sayHello(String greeting, String name) {
//            System.out.println(greeting + ", " name "!");
//        }

        //Version 2 will run because we are calling the method with no arguments, and version two is defined with no parameters. The method defined in version 2 will call sayHello again, but with two arguments, which will invoke version 4
        //Notice that versions 2 and 3 are calling version 4. This is an example of using method overloading to provide default values for methods. The most generic version (version 4) of our method needs to be passed a greeting and a name, but we can use method overloading to provide default values of "Hello" and "World" if only one, or no arguments are passed.
        //We could call version 3 by passing a single String argument, Which will again invoke version 4
        //Even though both version 1 and 3 are defined with a single parameter, the parameter's type is different for both of them. Because we are now passing a value of type int, version 1 will be invoked

//PASSING PARAMETERS
        //In Java, parameters are passed by value. This means that a copy of the value passed is created inside of a method, and that reassigning a value inside of a method will not change it outside of the method.

//        public static void changeString(String s) {
//            s = "Wub a lub a dub dub";
//        }
//
//        public static void main(String[] args) {
//            String changeMe = "hello codeup!";
//
//            changeString(changeMe);
//
//            System.out.println(changeMe);
//        }
        //First we define a method named changeString that takes in a String and re-assigns it. When we call changeString inside of our main method, we pass it the changeMe variable. Even though the String variable inside of changeString is re-assigned, the changeMe variable will still have the same value after the method call.

//RECURSION
        //One problem solving technique in programming is called recursion. Recursion is a concept that aims to solve a problem by dividing it into smaller chunks. The core idea of recursion is creating a method that calls itself, but with different parameters than were originally passed.
        //Whenever you are writing a recursive method, you must make sure to have a base case or stop condition so that the method does not call itself over and over again indefinitely.
        //While you might be able to quickly imagine how to output the numbers from 5 to 1 using a loop, let's do this with recursion to illustrate the concept.

//        public static void count(int n) {
//            if (n <= 0) {
//                System.out.println("All done!");
//                return;
//            }
//            System.out.println(n);
//            count(n - 1);
//        }
//
//        public static void main(String[] args) {
//            count(5);
//        }

        //The method count is recursive because it calls itself, and will continue to call itself with an argument of 1 less that the value that was originally passed. The if statement and the condition n <= 0 is our condition for stopping the recursion. Without the if to check if we are done counting, we would have the recursive equivalent of an infinite loop, a stack overflow error1.

//NUMBER FORMATTING
        //The number format class in java is an abstract class meaning that it cannot be instantiated using the 'new' keyword, instead we use the getCurrencyInstance or getPercentageInstance methods. additionally this class is used to change the formatting of number into things like currency or percentages.

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);

        String percent = NumberFormat.getPercentInstance().format(.03);

//READING INPUT
//        Scanner scanner = new Scanner(System.in); //The scanner class allows us to take in user input from various locations, in this example takes input from the terminal
//        System.out.print("Age: "); //This line prints a label within the terminal for the input field so the user knows what to input
//        byte age3 = scanner.nextByte(); //Here the scanner takes in the information that was input into the terminal. In this case it is expecting the input to be a byte. from here the data can be used to run functions
//        System.out.printf("Your are %s", age3); //using print format, we can display this information back to the user

//Mortgage Calculator Exercise
        final byte MONTHS_IN_YEAR = 12; //creates a constant for the number of months in a year
        final byte PERCENT = 100; //creates a constant for the percentages
        //Declaring these values in a const makes the overall code more readable because it makes it clear what each value represents and why it is n=being used in the equations

        Scanner scan = new Scanner(System.in); //new scanner for user input from terminal

        System.out.print("Principal: "); //Label for principal value
        int principal = scan.nextInt(); //Initializing int var to store the value of the principal, which will most likely be an int

        System.out.print("Annual Interest Rate: "); //Label for annual interest rate value
        float annualInterest = scan.nextFloat(); //Initializing float var to store the value of the interest rate, which will most likely be a float
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; //this formula allows us to convert the annual interest rate into a monthly interest rate. The annualInterest (a float decimal representing a percentage) will be divided by 100 to convert it to pure decimal form, then this decimal is divided by 12 to show the interest rate on a monthly scale

        System.out.print("Period (Years): "); //Label for the period of the mortgage in years
        byte years = scan.nextByte(); //Initializing a byte var for the input value for years. Since most mortgages only last 30 years, we store this value as a byte.
        int numberOfPayments = years * MONTHS_IN_YEAR; //This formula converts the given number of years into its equivalent value in months by multiplying by 12. This int represents the total number of payments due over the life of the mortgage

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1); //This is the formula used to calculate monthly mortgage payments

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);//Here the number format of the mortgage variable (currently a double) is converted to a currency format and stored within a string
        System.out.printf("Mortgage: %s/month", mortgageFormatted);//The monthly payment is displayed in the terminal with proper formatting

        //the issue with this calculator is that is does not have any way to validate that the input it receives are valid inputs. this will be fixed with conditional statements and control flow

//CONTROL FLOW
        //Conditionals and logical operators help control the flow of data thru a java program. These are very similar to what has already been learned in JS

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);

        String className = income > 100_000 ? "First" : "Economy";

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("Youre an admin");
                break;
            case "moderator":
                System.out.println("Youre a moderator");
                break;
            default:
                System.out.println("Youre a guest");
        }

        //FizzBuzz Exercise
        //One important note about the nature of if statements: it is best practice to place the most specific of conditions at the top of the statement and the most general at the bottom of the statement.
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner3.nextInt();

        if (number % 5 == 0 && number % 3 == 0) //If we were to place this condition at the bottom of the statement, this block of code would never be executed because the conditions above it would be resolved first thus giving the computer no reason to evaluate it. In this case any number that is divisible by 5 & 3 would only print Fizz or Buzz instead of FizzBuzz
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

        //For Loop
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World");

        //While Loop
        Scanner scanner4 = new Scanner(System.in); //create scanner outside the while loop so a new scanner is not created on each iteration of the loop
        String input = "";
        while (!input.equals("quit")) { //logical operators cannot be used on reference types. Each reference type has its own methods that can be used to make comparisons. In this case if the string called input does not have a value that equals "quit", our loop will keep running
            //because of that fact that as soon as the user types quit, the loop will end, we can also set the condition of this while loop to true. Make sure the loop has a break if this syntax is used
            System.out.print("Input: ");
            input = scanner4.next().toLowerCase(); //because out input is a string, we want to make sure that our code can recognize the string "quit" regardless of its casing format, so we can chain the toLowerCase method to the scanner call
            if (input.equals("pass"))
                continue; //unlike break which immediately ends a loop, continue essentially restarts the loop from the beginning. Here if the user inputs pass, the loop starts over and prompts them for an input
            if (input.equals("quit"))
                break;//this if statement allows us to only print the input into the terminal if it is not equal to quit. If it is equal to quit, we immediately break out of the loop making sure that "quit" is not printed back into the console.
            System.out.println((input));
        }
        //the best use case for while loops is when we are unsure how many times we need a loop to run before some particular condition is met. This is different from a for loop where we set the number of loops ourselves

        //Do-While
        do{
            System.out.print("Input: ");
            input = scanner4.next().toLowerCase();
            System.out.println((input));
        } while(!input.equals("quit"));
        //do-while loops are identical to while loops but with the condition that the code has to execute at least once. this is because the code is ran before the condition is checked. In most cases a regular while loop is preferred

        //For-Each Loop
        String[] fruits = {"apple", "mango", "orange"};
        for (String fruit : fruits)
            System.out.println(fruit);
        //For-Each loops make it easier to iterate across arrays but it has a some limitations in comparison to a for loop.
        //First, for-each is forward only... Meaning that we cannot start the loop at the end of the array and move backwards which would be easy to do in a regular for loop
        //Second, we dont have access to the individual indexes of the array like we would with a for loop
    }
}


