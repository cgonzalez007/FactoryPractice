package factorypractice;

/**
 *
 * @author jlombardo
 */
public class AppNoFactory {
    public static void main(String[] args) {
        /*
            No factory is being used in this example. As a result, we
            expose everything, violating encapsulation and making our
            program very rigid.
        */
        Animal pet = new Cat("Frisky");
        Person person = new Person("Jim", pet);
        person.setPet(pet);
        person.getPet().speak();
        System.out.println("My name is: " + person.getPet().getName());
    }
}
