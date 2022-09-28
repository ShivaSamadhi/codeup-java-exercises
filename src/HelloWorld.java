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
        int three = (int) "three";
        //System.out.println(three);
        //this throws an error because a string cannot be cast to an int value with this particular syntax, even tho any value can be stored within an Object

        int x = 4;
        x += 5;

        int x1 = 3;
        int y1 = 4;
        y1 *= x1;

        int x2 = 10;
        int y2 = 2;
        x2 /= y2;
        y2 -= x2;

        short numShort = 10000;
    }
}
