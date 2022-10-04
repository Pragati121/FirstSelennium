package Tests;

import Pages.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass{

    @Test
    public void setup()
    {
        pageFactory.GetLoginPage().loginpageuser();
    }
}