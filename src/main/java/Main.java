import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Type your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Type your height: ");
        double height = scanner.nextDouble();
        BMICalculator bmiCalculator = new BMICalculator(weight, height);
        System.out.println("Your BMI is: " + bmiCalculator.calculate());
        System.out.println("and you are "+ bmiCalculator.interpret());
    }


}
