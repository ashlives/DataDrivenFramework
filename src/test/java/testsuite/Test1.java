package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Ashish on 10-07-2017.
 */
public class Test1 extends TestBase{

    @Test(dataProvider = "userData")
    public void fillUserForm(String userName, String passWord)
    {
        driver.findElement(By.id("login-email")).sendKeys(userName);
        driver.findElement(By.id("login-password")).sendKeys(passWord);
    }

}
