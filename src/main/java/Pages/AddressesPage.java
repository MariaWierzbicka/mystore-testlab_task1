package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BasePage{
    public AddressesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class=\"addresses-footer\"]/a")
    private WebElement createNewAddressButton;
    @FindBy(className="alert-success")
    private WebElement alertSuccess;
    @FindBy(xpath = "(//*[@class=\"address-body\"])[last()]/h4")
    private WebElement addedAddressAlias;
    @FindBy(xpath = "(//*[@class=\"address-body\"])[last()]/address")
    private WebElement addedAddressDetails;

    public WebElement getCreateNewAddressButton() {
        return getVisibleElement(createNewAddressButton);
    }
    public void clickCreateNewAddressButton() {
        getCreateNewAddressButton().click();
    }
    public String getAlertSuccessText(){
        return getVisibleElement(alertSuccess).getText();
    }

    public WebElement getAddedAddressAlias() {
        return getVisibleElement(addedAddressAlias);
    }
    public WebElement getAddedAddressDetails(){
        return getVisibleElement(addedAddressDetails);
    }
}
