package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestButtonsVersion1 {

    private WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
    }

    @Test(priority = -1)
    public void testDoubleClick(){
        WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions action = new Actions(driver);
        action.doubleClick(btnDoubleClick).perform();
        WebElement lblYouHaveDoneClickMessage = driver.findElement(By.id("doubleClickMessage"));
        Assertion assertText = new Assertion();
        assertText.assertEquals(lblYouHaveDoneClickMessage.getText().equalsIgnoreCase("You have done a double click"), true);
    }

    @Test(priority = 1)
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
