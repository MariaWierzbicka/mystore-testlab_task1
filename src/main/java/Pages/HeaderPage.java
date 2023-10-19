package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{
    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class=\"user-info\"]/a")
    private WebElement signInButton;

    public WebElement getSignInButton(){
        return getVisibleElement(signInButton);
    }
    public void clickSignInButton(){
        getSignInButton().click();
    }
}
