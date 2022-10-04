package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By Username= By.xpath("//input[contains(@class,'input_error')]");
    By Password=By.xpath("//input[contains(@type,'password')]");
    By Submit=By.xpath("//input[contains(@type,'submit')]");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public void  loginpageuser()
    {
        driver.findElement(Username).sendKeys("standard_user");
        driver.findElement(Password).sendKeys("secret_sauce");
        driver.findElement(Submit).click();
    }
}

