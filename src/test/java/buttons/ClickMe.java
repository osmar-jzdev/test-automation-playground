package buttons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class ClickMe {

    private WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
    }

    @Test
    public void testClIckMe(){
        WebElement btnClickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
        btnClickMe.click();
        WebElement lblYouHaveDoneClickMessage = driver.findElement(By.id("dynamicClickMessage"));
        Assertion assertText = new Assertion();
        assertText.assertEquals(lblYouHaveDoneClickMessage.getText().equalsIgnoreCase("You have done a dynamic click"), true);
    }

    @AfterClass(alwaysRun = true)
    public void afterTest(){
        driver.close();
    }
}
