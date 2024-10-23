import static javax.swing.JOptionPane.*;
import java.util.*;

public class HelloAge {
    public static void main(String[] args){
        GregorianCalendar now = new GregorianCalendar();
        int thisYear = now.get(Calendar.YEAR);
        String name;
        int age;
        int yearOfBirth;
        name = showInputDialog("Enter your name");
        age = Integer.parseInt(showInputDialog("Enter your Age"));
        yearOfBirth = thisYear - age;
        showMessageDialog(null,name+" you were born in "+yearOfBirth);
    }
}
