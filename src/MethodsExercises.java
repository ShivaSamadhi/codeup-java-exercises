public class MethodsExercises {
    public static long addition(int num1, int num2){
        return num1 + num2;
    }
    public static long subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static long multiplication(int num1, int num2){
        int base = 0;
        for (int i = 0; i < num2; i++){
            base += num1;
        }
        return base;
        //return (long) num1 * num2;
    }
    public static float division(float num1, float num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println(addition(2, 3));
        System.out.println(subtraction(2, 3)); ;
        System.out.println(multiplication(2, 3));
        System.out.println(division(2, 3));
    }
}
