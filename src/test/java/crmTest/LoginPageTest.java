package crmTest;

import base.BaseCommon;
import crm.HomePage;
import crm.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginPageTest extends BaseCommon{

    LoginPage loginPage;
    HomePage homePage;
    String crmPageTitle ="#1 Free CRM software in the cloud for sales and service";
    Logger log = Logger.getLogger(LoginPageTest.class);

    public LoginPageTest(){
        super();
    }

    @BeforeClass
    public void setup(){
        initialization();
        loginPage = new LoginPage();
        log.info("entering dkjhdsf ++++ ++++++++++++++++++");
    }

    @Test
    public void CrmPageTest(){
        log.info("entering dkjhdsf ++++ ++++++++++++++++++");

        Assert.assertEquals(loginPage.validateLoginPageTitle(),crmPageTitle);
        Assert.assertTrue(loginPage.checkCrmLogo());
    }

    @Test
    public void loginUserTest(){
        log.info("entering dkjhdsf ++++ ++++++++++++++++++");

        homePage = loginPage.loginUser(properties.getProperty("crmusername"),properties.getProperty("crmpassword"));
        Assert.assertTrue(homePage.validateHomePageLogo());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
