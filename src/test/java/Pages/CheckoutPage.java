package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CheckoutPage {
    WebDriver driver;
public static Properties prop;
    By firstname= By.xpath("//input[contains(@name,'firstName')]");
    By Lastname=By.xpath("//input[@name=\"lastName\"]");
    By Zipcode=By.xpath(" //input[@name=\"postalCode\"]");
    By Continue=By.xpath("//input[contains(@class,'submit-button')]");
    By Finish=By.xpath("//button[contains(@class,'btn_action btn_medium cart_button')]");
    public CheckoutPage(WebDriver driver)
    {
    this.driver=driver;
    }
    public void checkoutMethod()
    {
        try {
            prop = new Properties();
            FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//TestData//Resource.Properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver.findElement(firstname).sendKeys(prop.getProperty("Fname"));
        driver.findElement(Lastname).sendKeys(prop.getProperty("Lname"));
        driver.findElement(Zipcode).sendKeys(prop.getProperty("Zip"));
        driver.findElement(Continue).click();
        driver.findElement(Finish).click();
    }
}
