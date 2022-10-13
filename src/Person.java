import java.util.ArrayList;

public class Person {
private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, %s", name);
    }

    public static void main(String[] args) {
        Person person = new Person("Ramaj");
        System.out.printf("%s%n", person.getName());
        person.sayHello();

    }
}
