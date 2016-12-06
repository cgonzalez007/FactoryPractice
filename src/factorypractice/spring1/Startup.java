package factorypractice.spring1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

    public static void main(String[] args) {
        /* 
         * Retrieve a Spring application context from the classpath. All beans
         * are configured in the XML file. You could
         * use a different Spring class for an external file path. 
         * This causes Spring to instantiate all beans. You only need to do 
         * this once, but if you do it again, it returns a copy.
         */
        final AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Now ask Spring to give you a fully configured TipService object. Note
        // that the TipCalculator has already been injected by Spring.
        TipService service = (TipService)ctx.getBean("tipService");
        double tip = service.getTip();
        System.out.println("The tip is calculated to be: " + tip);
        
    }

}
