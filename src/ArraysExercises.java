import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Ramaj");
        people[1] = new Person("Anthony");
        people[2] = new Person("Shiva");

        for (Person person : people){
            System.out.printf("%s", person.getName());
        }


    }
    public static Person[] addPerson(Person[] peopleArray, Person personToAdd){
        Person[] tempArr = Arrays.copyOf(peopleArray, peopleArray.length +1);
        tempArr[tempArr.length-1] = personToAdd;

        return tempArr;
    }
}
