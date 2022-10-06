package Tests;

import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Baseclass {
    static WebDriver driver;
    public static PageFactory pageFactory;
    @BeforeClass
    public void setupDriver() {
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        pageFactory = new PageFactory(driver);
    }
    @AfterClass
    public void close(){
        driver.quit();
    }
}
