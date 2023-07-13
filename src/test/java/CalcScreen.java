import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CalcScreen {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout")
    WebElement btnMinimize;
    @FindBy(id = "com.miui.calculator:id/btn_plus_s")
    WebElement btnPlus;
    @FindBy(id = "com.miui.calculator:id/btn_minus_s")
    WebElement btnMinus;
    @FindBy(id = "com.miui.calculator:id/btn_equal_s")
    WebElement btnEqual;
    @FindBy(id ="com.miui.calculator:id/btn_div_s")
    WebElement btnDivision;
    @FindBy(id ="com.miui.calculator:id/btn_mul_s")
    WebElement btnMultiplication;
    @FindBy(id = "com.miui.calculator:id/result")
    WebElement txtResult;
    @FindBy(id = "com.miui.calculator:id/btn_c_s")
    WebElement btnClear;
    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public String doSeries_1(int a, int b, int c, int d) {
        btnMinimize.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + a + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnDivision.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + a + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnMultiplication.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + c + "_s")).click();
        btnMinus.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + a + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnPlus.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + d + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public String doSeries_2(int a, int b, int c, int d) {
        driver.findElement(By.id("com.miui.calculator:id/btn_" + a + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnPlus.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + c + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnMinus.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + d + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnMultiplication.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + d + "_s")).click();
        btnPlus.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + c + "_s")).click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + b + "_s")).click();
        btnDivision.click();
        driver.findElement(By.id("com.miui.calculator:id/btn_" + d + "_s")).click();
        btnEqual.click();
        return txtResult.getText();
    }

    public void clearScreen() {
        btnClear.click();
    }
}
