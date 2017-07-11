package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.*;
import utilities.WriteDataToExcel;

/**
 * Created by Ashish on 10-07-2017.
 */
public class ExcelToDP extends TestBase{

    @Test(dataProvider = "userData")
    public void fillUserForm(String userName, String passWord, String result)
    {
        driver.findElement(By.id("login-email")).sendKeys(userName);
    }

}
