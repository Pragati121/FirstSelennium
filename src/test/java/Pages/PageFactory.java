package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
    private CheckoutPage Check;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage GetLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public CheckoutPage GetCheckoutPage() {
        if (Check == null) {
            Check = new CheckoutPage(driver);
        }
        return Check;
    }
}