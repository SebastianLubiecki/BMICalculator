
import junitparams.Parameters;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(JUnit4ClassRunner.class)
public class BMICalculatorParameterTest {

    @Test(expected = IllegalArgumentException.class)
    @Parameters({" -1, 170",
            "  1,  -1",
            "  0, 120",
            " 50,  -1"})
    public void constructTest(int weight, int height){
        new BMICalculator(weight, height);
    }

    @Test
    @Parameters({"40, 120, 27.8",
            "50, 120, 34.7"})
    public void calculateTest(int weight, int height, String exp){
        BMICalculator calc = new BMICalculator(weight, height);
        assertEquals(exp, calc.calculate());
    }

    @Test
    @Parameters({"10,underweight",
            "15.5, severely underweight",
            "17, underweight"})
    public void interpretTest(String bmi, String label){
        BMICalculator calc = new BMICalculator();
        assertEquals(label, calc.interpret());

    }
}
