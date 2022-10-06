package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    By User= By.xpath("//input[contains(@class,'input_error')]");
    By Pwd=By.xpath("//input[contains(@type,'password')]");
    By Submit=By.xpath("//input[contains(@class,'submit-button')]");
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public void  loginpageuser()
    {
        driver.findElement(Submit).click();

    }
    public void MethodExcel() throws IOException {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(9));
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
        driver.findElement(User).sendKeys(Usern);
        driver.findElement(Pwd).sendKeys(Pass);

    }
    }

