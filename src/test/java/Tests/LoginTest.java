package Tests;

import Pages.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends Baseclass{

    @Test
    public void setup() throws IOException {
        pageFactory.GetLoginPage().MethodExcel();
        pageFactory.GetLoginPage().loginpageuser();
    }
}