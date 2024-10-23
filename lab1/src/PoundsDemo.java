import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;

public class PoundsDemo {
    public static void main(String[] args){
        DecimalFormat pounds = new DecimalFormat("###,###.00");
        double amount = 1452457.548687565;
        showMessageDialog(null,"The amount is " +pounds.format(amount));

    }
}
