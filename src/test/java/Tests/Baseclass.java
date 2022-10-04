package Tests;

import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
    static WebDriver driver;
    public static PageFactory pageFactory;

    public static void setupDriver() {
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        pageFactory = new PageFactory(driver);
    }
}
