package lesson04;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("Leonardo", 40);

        Person person2 = new Person("Michael", "B", "Jordan", 37);

        Person person3 = new Person("Ah Kow", "Tan", 20);

        System.out.println(person.getDetails());
        System.out.println(person2.getDetails());
        System.out.println(person3.getDetails());

    }
}
