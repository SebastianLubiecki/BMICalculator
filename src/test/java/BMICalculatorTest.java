
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BMICalculatorTest {


    private BMICalculator bmiCalculator;



    @Test
    public void BMICalculateTestWithParametersZeroTest() {

        try {
           BMICalculator bmiCalculator = new BMICalculator(0,0);
            bmiCalculator.calculate();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Wrong parameters", e.getMessage());
        }
    }

    @Test
    public void BMICalculateTestWithParameterHeightLowerThenZeroTest() {
        try {
           BMICalculator bmiCalculator1 = new BMICalculator(0,-3);
            bmiCalculator1.calculate();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Wrong parameters", e.getMessage());
        }
    }

    @Test
    public void BMICalculateTestWithParameterWeightLowerThenZeroTest() {
        try {
            BMICalculator bmiCalculator2 = new BMICalculator(-5,1);
            bmiCalculator2.calculate();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Wrong parameters", e.getMessage());
        }
    }

    @Test
    public void BMIInterpretWithUnderweightTest() {

        BMICalculator bmiCalculator3 = new BMICalculator(50,2.0);
        assertEquals(bmiCalculator3.interpret(), "Underweight");
    }

    @Test
    public void BMIInterpretWithNormalWeightTest() {

        BMICalculator bmiCalculator4 = new BMICalculator(70,1.80);
        assertEquals(bmiCalculator4.interpret(), "NormalWeight");
    }

    @Test
    public void BMIInterpretWithOverWeightTest() {

        BMICalculator bmiCalculator5 = new BMICalculator(200,1.50);
        assertEquals(bmiCalculator5.interpret(), "OverWeight");
    }
}
