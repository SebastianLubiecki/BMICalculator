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
        bmiCalculator.setHeight(1);
        bmiCalculator.setWeight(-5);
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
        bmiCalculator.setHeight(2.0);
        bmiCalculator.setWeight(50);
        assertEquals(bmiCalculator.interpret(), "Underweight");
    }

    @Test
    public void BMIInterpretWithNormalWeightTest() {
        bmiCalculator.setHeight(1.80);
        bmiCalculator.setWeight(70);
        assertEquals(bmiCalculator.interpret(), "NormalWeight");
    }

    @Test
    public void BMIInterpretWithOverWeightTest() {
        bmiCalculator.setHeight(1.5);
        bmiCalculator.setWeight(200);
        assertEquals(bmiCalculator.interpret(), "OverWeight");
    }
}
