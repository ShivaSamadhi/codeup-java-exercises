import java.text.DecimalFormat;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

//        for(int i = 100; i >= -10; i-= 5){
//            System.out.println(i);
//        };

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        };


//        for(int i = 1; i <= 100; i++){
//            if(((i % 3) == 0) && ((i % 5) == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        };

        DecimalFormat deci = new DecimalFormat("0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to: ");
        int number = Integer.parseInt(scanner.next());
        System.out.println("Number\tSquared\tCubed\t");
        for (int i=1;  i<= number; i++)
            System.out.println(deci.format(Math.pow(i,1)) + "    |\t"+deci.format(Math.pow(i,2)) + "    |\t"+deci.format(Math.pow(i,3)));

    }
}
