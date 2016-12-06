package factorypractice.tip.external;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This ExternalSpecFactory decouples the specifications for building
 * Reader and Writer objects from the Factory class. Instead, the specs are
 * read from an external text file that has key=value pairs providing the
 * specifications. Once read in, the factory class can build objects using
 * Java Reflection techniques.
 * 
 * IMPORTANT: to run this program you must place the config.properties file
 * in the appropriate directory and then modify the file path below to
 * use that directory.
 *
 * @author jlombardo
 */
public abstract class ExternalSpecFactory {

    public static TipCalculator getTipCalculatorInstance() {
        TipCalculator calc = null;

        // First read config setting in properties file
//        File file = new File("/temp/config.properties");
        File file = new File("src/config.properties");
        Properties props = new Properties();
        FileInputStream inFile;
        try {
            inFile = new FileInputStream(file);
            props.load(inFile);
            inFile.close();
        
            // Next use Java reflection to create instance
            String servQuality = props.getProperty("service.quality");
            String bagCount = props.getProperty("bag.count");
            String billAmt = props.getProperty("bill.amount");
            String className = props.getProperty("calculator");
            
            Constructor<?> cons = null;
            Class clazz = Class.forName(className);
            
            if(className.endsWith("BaggageServiceTipCalculator")) {
                cons = clazz.getConstructor(ServiceQuality.class, Integer.class);
                calc = (TipCalculator)cons.newInstance(ServiceQuality.valueOf(servQuality),new Integer(bagCount));
            
            } else if(className.endsWith("FoodServiceTipCalculator")) {
                cons = clazz.getConstructor(ServiceQuality.class, Double.class);
                calc = (TipCalculator)cons.newInstance(ServiceQuality.valueOf(servQuality),new Double(billAmt));
            }   
            
        } catch (Exception ex) {
            System.out.println("ERROR: you must place a copy of the\n "
                    + "config.properties file in the 'src' directory of "
                    + "your project.");
        }
        
        return calc;
    }

    
}
