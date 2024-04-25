package tests;


import org.testng.annotations.Test;
import pages.Login;
import static utils.Constant.*;

public class LoginTest extends BaseTest {

    @Test
    public void LoggedinTest() throws Exception {
        page.getInstance(Login.class).getName().sendKeys(loginname);
        page.getInstance(Login.class).getPassowrd().sendKeys(loginpassword);
        page.getInstance(Login.class).getLogin_btn().click();
    }
}