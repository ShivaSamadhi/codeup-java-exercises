import java.util.Arrays;

public class Review {
    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }
    public static int circumference(int radius){
        return (int) ((int)2 * Math.PI * radius);
    }
    public static double total(double bill, double tipPercentage){
        return bill + ((tipPercentage/100)*bill);
    }

    public static void evens(int[] numbers){
        for(int number : numbers){
            if (number % 2 == 0){
                System.out.println(number);
            }
        }
    }


}
