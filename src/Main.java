import java.awt.*;
import java.util.Arrays;
import java.util.Date;

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


    }
}
