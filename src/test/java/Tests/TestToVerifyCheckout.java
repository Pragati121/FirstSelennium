package Tests;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestToVerifyCheckout extends Baseclass {
    @Test
    public void loginTest() throws IOException {
        pageFactory.GetLoginPage().MethodExcel();
        pageFactory.GetLoginPage().loginpageuser();
    }

    @Test (dependsOnMethods = "loginTest")
    public void CustomerButton()
    {
        pageFactory.GetCheckoutPage().checkoutMethod();
    }
}
