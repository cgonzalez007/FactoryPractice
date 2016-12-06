package factorypractice;

/**
 *
 * @author jlombardo
 */
public class Dog implements Animal {
    private String name;
    
    @Override
    public void speak() {
        System.out.println("Bark");
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
}
