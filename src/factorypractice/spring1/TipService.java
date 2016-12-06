package factorypractice.spring1;

/**
 *
 * @author jlombardo
 */
public class TipService {
    private TipCalculator tipCalculator;

    public TipService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getTip() {
        return tipCalculator.getTip();
    }
}
