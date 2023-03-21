package textbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Formulario {
    private WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void llenarFormulario(){
        // --- Localizadores Formulario ---
        //userName
        //userEmail
        //currentAddress
        //permanentAddress
        //submit
        // --- Localizadores de caja con información después de dar click en botón submit ---
        //name
        //email
        //currentAddress
        //permanentAddress

        // Encontrar caja de texto userName y escribir texto
        WebElement textBoxUserName = driver.findElement(By.id("userName"));
        textBoxUserName.sendKeys("NombreUser");
        // Encontrar caja de texto useremail y escribir texto
        //...
        // Encontrar caja de texto currentAddress y escribir texto
        //...
        // Encontrar caja de texto de permanentAddress y escribir texto
        // Encontrar botón de submit y dar click en el boton
    }


    @AfterClass(alwaysRun = true)
    public void afterTest(){
        driver.close();
    }
}
