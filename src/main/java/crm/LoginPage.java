package crm;

import base.BaseCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseCommon {

    //Page factory @Findby - OR (Object repositories)

    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath="//img[@class='img-responsive' and @alt='free crm logo']")
    WebElement crmLogo;

    //Initialize Page Factory/Object repositories

    public  LoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Action classes

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean checkCrmLogo(){
        return crmLogo.isDisplayed();
    }

    public HomePage loginUser(String usern, String pwd){
        username.sendKeys(usern);
        password.sendKeys(pwd);
        loginButton.click();
        return new HomePage();
    }



}
