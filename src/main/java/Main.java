public class Main {


    public static void main(String[] args) {

        BMICalculator bmiCalculator = new BMICalculator(180, 1.5);
        System.out.println(bmiCalculator.calculate());
        System.out.println(bmiCalculator.interpret());
    }


}
