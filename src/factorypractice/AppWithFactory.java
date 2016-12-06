package factorypractice;

public class AppWithFactory {
    public static void main(String[] args) {
        /*
            Here is a simple example of Factory Pattern usage. We hide
            the way an animal is constructed by passing a specification to
            the factory, which then delivers an animal object which we can
            provide to the Person as a pet.
        
            THE GOOD: the actual type of animal is hidden, along with the
            mechanics of how it's created. This means we can change those
            things in the future with breaking this code. This is very
            flexible.
        
            THE BAD: this is poor encapsulation. Sure, we encapsulate the
            animal creation, but we expose the complexity of having to
            use the factory class. This also violates the Principle of
            Least Knowledge. Why do we need to know about the factory
            class at all here? We don't.
        */

        Animal pet = 
                AnimalFactory.createAnimal(PetSpecification.BIRD, "Robi");
        Person person = new Person("Jim", pet);
        
        System.out.println("My name is: " + person.getName() 
            + ". I have a pet named " + person.getPet().getName()
            + ", that speaks like this:");
        person.getPet().speak();

        /*
            Here an improved version, where we fully encapsulate the factory
            class inside the Person class. Notice we don't need to work
            with the factory class at all here. Now it's even more flexible
            because not only can we change the Animal classes that are used
            but we can also change the the way the animals are created 
            (the fatory class).
        */
        Person person2 = new Person("Bob", "MyRobin", PetSpecification.BIRD);
        
        System.out.println("My name is: " + person.getName() 
            + ". I have a pet named " + person.getPet().getName()
            + ", that speaks like this:");
        person.getPet().speak();
        
    }
}
