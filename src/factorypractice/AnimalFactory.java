package factorypractice;

/**
 *
 * @author jlombardo
 */
public class AnimalFactory {
    public static Animal createAnimal(PetSpecification spec, String name) {
        
        Animal animal = null;
        
        switch(spec) {
            case CANINE:
                animal = new Dog(name);
                break;
            case FELINE:
                animal = new Cat(name);
                break;
            case BIRD:
//                animal = new Duck(name);
                animal = new Robin("name");
                break;
        }
  
        return animal;
    }
}
