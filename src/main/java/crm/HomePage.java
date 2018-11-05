package crm;

import base.BaseCommon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.UtilCommon;

public class HomePage extends BaseCommon{

    UtilCommon utilCommon= new UtilCommon();

    @FindBy(xpath="//td[@class='headertext' and @align='left']")
    WebElement homePageName;

    @FindBy(xpath="//td[@class='logo_text']")
    WebElement homePageLogo;

    public  HomePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean validateHomePageLogo(){
        utilCommon.switchToFrameMainPanel();
        return homePageLogo.isDisplayed();
    }
}
