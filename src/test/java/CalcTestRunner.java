import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup {
    CalcScreen calcScreen;


    @Test(priority = 1, description = "Output of the series-1")
    public void doSeries_1() {
        calcScreen = new CalcScreen(driver);
        String res = calcScreen.doSeries_1(1, 0, 5, 6);
        Assert.assertTrue(res.contains("100"));
    }

    @Test(priority = 2, description = "Output of the series-2")
    public void doSeries_2() {
        calcScreen = new CalcScreen(driver);
        String res = calcScreen.doSeries_2(5, 0, 1, 2);
        Assert.assertTrue(res.contains("25"));
    }

    @AfterMethod
    public void clearScreen() {
        calcScreen = new CalcScreen(driver);
        calcScreen.clearScreen();
    }
}
