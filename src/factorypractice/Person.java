package factorypractice;

/**
 *
 * @author jlombardo
 */
public class Person {
    private String name;
    private Animal pet;

    public Person(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name, String petName, PetSpecification spec) {
        this.name = name;
        pet = AnimalFactory.createAnimal(spec, petName);
        pet.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
    
    
}
