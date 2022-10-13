package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") ||
                input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("true");
    }

    public static int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s", min, max);
        int number = scanner.nextInt();
        if (number < min || number > max){
            getInt(min, max);
        }
        return number;
    }

    public static int getInt(){
        try {
            return Integer.parseInt(getString("Input A Number: "));
        }
        catch (Exception e){
            System.out.println("NaN");
            return getInt();
        }
        //return scanner.nextInt();
    }

    public static double getDouble(double min, double max){
        System.out.printf("Enter a number between %s and %s", min, max);
        double number = scanner.nextInt();
        if (number < min || number > max){
           number = getDouble(min, max);
        }
        return number;
    }

    public static double getDouble(){
        try {
            return Double.parseDouble(getString("Input A Number: "));
        }
        catch (Exception e){
            System.out.println("NaN");
            return getDouble();
        }
        //return scanner.nextDouble();
    }
}
