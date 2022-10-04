package Tests;

import Pages.PageFactory;

public class LoginTest extends Baseclass{

    public static void main(String[] args) throws InterruptedException
    {
        setupDriver();
        pageFactory.GetLoginPage().loginpageuser();
    }
}