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

        return null;
    }

    @Override
    public String interpret() {
        return null;
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
