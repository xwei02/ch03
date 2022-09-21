import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice2 {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //BMI計算與判斷
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight(kg):");
        double weight = scanner.nextDouble();
        System.out.println("Input your height(cm):");
        double height = scanner.nextDouble()/100;
        //體重(公斤) 除以身高(公尺)的平方
        double bmi =Double.parseDouble(DF.format(weight/(height*height))) ;
        System.out.println("Your bmi is "+bmi+".");

        if(bmi <18.5){
            System.out.println("Underweight");
        }else if(18.5 <=bmi && bmi<25){
            System.out.println("Healthy weight");
        }else if(bmi>=25 && bmi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
        }

    }





