import javax.swing.*;
import java.util.Locale;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(BNT, AZ, MVC, Moderna)");
        vaccine = vaccine.toLowerCase();

        if (vaccine.equals("az") ){
            System.out.println("AZ");


        }
    }
}
