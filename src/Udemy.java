public class Udemy {
    public static void displayHighScorePosition(String playerName, int scorePosition){
        System.out.printf("%s managed to get into position %s on the high score table", playerName, scorePosition);
    }
    public static int calculateHighScorePosition(int calculatedScore){
        int position = 4;
            if (calculatedScore >= 1000)
                position = 1;
            else if (calculatedScore >= 500)
                position = 2;
            else if (calculatedScore >= 100)
                position = 3;

        return position;
    }
//a few bugs were fixed from the original method syntax.
// We changed the comparison operators to >= in order to avoid scores like 1000 from returning the wrong position number.
// With the use of >= we no longer need the && operators which were testing if a score fit within a certain range.
//we can reduce the number of return statements in our if statement by setting a variable called position to 4 (last place) then reassigning the value based on the conditions and returning position

    public static int calculatedScore(boolean gameOver, int score, int levelsCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelsCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    //Method Overloading
    //method overloading is a means by which we create multiple versions of a method that take in different types and amounts of parameters
    public static int calculateScore( String playerName, int score) {
        System.out.printf("%s scored %s points", playerName, score);
        return score * 1000;
    }

    public static int calculateScore( int score) {
        System.out.printf("Unnamed Player scored %s points", score);
        return score * 1000;
    }

     public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double inchConversion = 12.0;
        double centimeterConversion = 2.54;

        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            double totalInches = (feet * inchConversion) + inches;
            double totalCentimeters = totalInches * centimeterConversion;
            System.out.printf("%s feet = %s inches = %s centimeters", feet, totalInches, totalCentimeters);
        }
        return -1;
     }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double inchConversion = 12.0;
        if (inches >= 0){
           double totalFeet = inches / inchConversion;
           return totalFeet;
        }
        return -1;
    }

    public static void main(String[] args) {

        int calculatedScore = calculatedScore(true, 5000, 1, 200);

        int scorePosition = calculateHighScorePosition(calculatedScore);

        //displayHighScorePosition("Shiva Samadhi", scorePosition);

        //int newScore = calculateScore("Shiva", 500);
        //System.out.printf("New score is %s", newScore);

        //calculateScore(75);

       double inchesToFeet = calcFeetAndInchesToCentimeters(151);
       calcFeetAndInchesToCentimeters(inchesToFeet, 0);
    }
}
