import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BMICalculator implements Calculate {

    private double weight;
    private double height;

    public BMICalculator(double weight, double height) {
        String errorMessage = "Wrong parameters";
        if (weight > 0 && height > 0) {
            setWeight(weight);
            setHeight(height);
        } else
            throw new IllegalArgumentException(errorMessage);
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
//        double[] bmiValues = {0.0, 18.5, 25.0};
//        String[] bmiNames = {"Underweight", "NormalWeight", "OverWeight"};
//        return bmiNames[Math.abs(Arrays.binarySearch(bmiValues, BMIValue) + 1)];

        List<Double> arrayOfRangeForBMI = new ArrayList<>();
        arrayOfRangeForBMI.add(0.0);
        arrayOfRangeForBMI.add(18.5);
        arrayOfRangeForBMI.add(25.0);

        int iterator = 0;
        for (int i = 1; i < arrayOfRangeForBMI.size(); i++) {
            if (arrayOfRangeForBMI.get(i - 1) < BMIValue && BMIValue < arrayOfRangeForBMI.get(i)) {
                break;
            }
            iterator = i;
        }
        List<String> arrayOfAnswerToUser = new ArrayList<>();
        arrayOfAnswerToUser.add("Underweight");
        arrayOfAnswerToUser.add("NormalWeight");
        arrayOfAnswerToUser.add("OverWeight");

        return arrayOfAnswerToUser.get(iterator);
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
