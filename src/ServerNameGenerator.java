import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjArr = {
            "incorrigible", "petty", "smart", "egotistical", "lazy", "unprofessional", "unqualified", "outdated", "disorganized", "unreasonable"
    };
    public static String[] nounsArr = {
            "desk", "pen", "laptop", "cup", "phone", "duck", "marker", "chair", "board", "tv"
    };

    public static void main(String[] args) {
        System.out.println("Your server is:%n");
        System.out.printf("%s %s", getWord(adjArr), getWord(nounsArr));
    }
    public static String getWord(String[] words){
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}
