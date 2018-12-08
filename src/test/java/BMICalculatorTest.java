import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BMICalculatorTest {


    private BMICalculator bmiCalculator;

    @Before
    public void setBmiCalculator() {
        this.bmiCalculator = new BMICalculator();
    }

    @Test
    public void BMICalculateTestWithParametersZeroTest() {
        bmiCalculator.setHeight(0);
        bmiCalculator.setWeight(0);
        try {
            bmiCalculator.calculate();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Wrong parameters");
        }
    }

    @Test
    public void BMICalculateTestWithParameterHeightLowerThenZeroTest() {
        bmiCalculator.setHeight(-1);
        bmiCalculator.setWeight(5);
        try {
            bmiCalculator.calculate();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Wrong parameters");
        }
    }

    @Test
    public void BMICalculateTestWithParameterWeightLowerThenZeroTest() {
        bmiCalculator.setHeight(1);
        bmiCalculator.setWeight(-5);
        try {
            bmiCalculator.calculate();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Wrong parameters");
        }
    }

    @Test
    public void BMIInterpretWithUnderweightTest() {
        bmiCalculator.setHeight(200);
        bmiCalculator.setWeight(50);
        assertEquals(bmiCalculator.interpret(), "Underweight");
    }

    @Test
    public void BMIInterpretWithNormalWeightTest() {
        bmiCalculator.setHeight(180);
        bmiCalculator.setWeight(70);
        assertEquals(bmiCalculator.interpret(), "NormalWeight");
    }

    @Test
    public void BMIInterpretWithOverWeightTest() {
        bmiCalculator.setHeight(150);
        bmiCalculator.setWeight(200);
        assertEquals(bmiCalculator.interpret(), "OverWeight");
    }
}
