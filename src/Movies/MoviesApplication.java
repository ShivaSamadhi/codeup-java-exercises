package Movies;

import util.Input;

public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    private static Movie[] movies;

    public static void main(String[] args) {
        movies = MoviesArray.findAll();
        Input input = new Input();

        int choice = INVALID_CHOICE;
        if(choice != EXIT_CHOICE){
            printMenu();
            choice = input.getInt(0,5);
            doChoice(choice);
        }

    }
    private static void printMenu(){
        System.out.println(
                "Choose One Of These Options\n" +
                        "0 - Exit\n" +
                        "1 - View All Movies\n" +
                        "2 - View All Animated Movies\n" +
                        "3 - View All Drama Movies\n" +
                        "4 - View All Horror Movies\n" +
                        "5 - View All Scifi Movies\n" +
                        "Enter Your Choice Here: "
        );
    }
    private static void doChoice(int choice){
        switch(choice) {
            case 1:
                printMoviesByCategory("all");
                break;
            case 2:
                printMoviesByCategory("animated");
                break;
            case 3:
                printMoviesByCategory("drama");
                break;
            case 4:
                printMoviesByCategory("horror");
                break;
            case 5:
                printMoviesByCategory("scifi");
                break;
        }
    }

    public static void printMoviesByCategory(String category){
        for (Movie movie : movies){
            if (movie.getCategory().equals(category) || category.equals("all")){
                System.out.println(movie);
            }
        }
    }
}
