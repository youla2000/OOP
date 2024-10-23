import javax.swing.*;
public class Tank {
    public static void main(String[] args){
        double volumeStr;
        double length = Double.parseDouble(JOptionPane.showInputDialog("Size of the length in (ml)"));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Size of the length in (ml)"));
        double depth = Double.parseDouble(JOptionPane.showInputDialog("Size of the length in (ml)"));

        volumeStr = (length*width*depth)/1000;

        JOptionPane.showMessageDialog(null,"The volume of the tank is "+volumeStr+" liter");

    }
}
