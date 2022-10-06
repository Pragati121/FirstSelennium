package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class LoginPage {
    WebDriver driver;
 int number;
    By User= By.xpath("//input[contains(@class,'input_error')]");
    By Pwd=By.xpath("//input[contains(@type,'password')]");
    By Submit=By.xpath("//input[contains(@class,'submit-button')]");
    By Add=By.xpath("//button[@name=\"add-to-cart-sauce-labs-backpack\"]");
    By ShopingCArt=By.xpath("//a[@class=\"shopping_cart_link\"]");
    By Checkout=By.xpath("//button[@name=\"checkout\"]");
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public void  loginpageuser()
    {
        driver.findElement(Submit).click();
        List<WebElement> objectDetails = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        number = objectDetails.size();
        Assert.assertEquals(number,6);
        driver.findElement(Add).click();
        driver.findElement(ShopingCArt).click();
        driver.findElement(Checkout).click();
    }
    public void MethodExcel() throws IOException {
        String path = System.getProperty("user.dir")+"//src//test//java//TestData//DataBddPractice.xlsx";
        FileInputStream prop1 = null;
        try{
            prop1 = new FileInputStream(path);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String Usern = sheet.getRow(1).getCell(0).getStringCellValue();
        String  Pass= sheet.getRow(1).getCell(1).getStringCellValue();
        //WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(150000));
        WebDriverWait waits =new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.findElement(User).sendKeys(Usern);
        driver.findElement(Pwd).sendKeys(Pass);
    }
    }

