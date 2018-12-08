import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BMICalculator implements Calculate {

    private double weight;
    private double height;

    public BMICalculator(double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }

    public BMICalculator() {
    }

    @Override
    public String calculate() {

        double calculatedBMI = ((getWeight()) / Math.pow(getHeight(), 2));
        String parseCalculatedBMIToString = String.valueOf(calculatedBMI);

        return parseCalculatedBMIToString;
    }

    @Override
    public String interpret() {
        double BMIValue = Double.valueOf(calculate());
 double [] arrayOfRangeForBMI = {0, 18.5, 25};
     int indexOfValueInRangeBMIArray =   Arrays.binarySearch(arrayOfRangeForBMI, BMIValue);
        List<String> arrayOfAnswerToUser = new ArrayList<>();
        arrayOfAnswerToUser.add("Underweight");
        arrayOfAnswerToUser.add("NormalWeight");
        arrayOfAnswerToUser.add("OverWeight");

        return arrayOfAnswerToUser.get(indexOfValueInRangeBMIArray);
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
