package factorypractice;

/**
 *
 * @author jlombardo
 */
public class Robin implements Animal {
    private String name;
    
    @Override
    public void speak() {
        System.out.println("Chirp");
    }

    public Robin(String name) {
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
