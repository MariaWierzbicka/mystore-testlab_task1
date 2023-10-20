package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddAddressFormPage extends BasePage{
    public AddAddressFormPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="field-alias")
    private WebElement aliasInputField;
    @FindBy(id="field-address1")
    private WebElement addressInputField;
    @FindBy(id="field-city")
    private WebElement cityInputField;
    @FindBy(id="field-postcode")
    private WebElement zipCodeInputField;
    @FindBy(id="field-id_country")
    private WebElement countrySelectField;
    @FindBy(id="field-phone")
    private WebElement phoneInputField;
    @FindBy(className = "form-control-submit")
    private WebElement saveButton;
    public WebElement getAliasInputField() {
        return getVisibleElement(aliasInputField);
    }

    public WebElement getAddressInputField() {
        return getVisibleElement(addressInputField);
    }

    public WebElement getCityInputField() {
        return getVisibleElement(cityInputField);
    }

    public WebElement getZipCodeInputField() {
        return getVisibleElement(zipCodeInputField);
    }

    public WebElement getCountrySelectField() {
        return getVisibleElement(countrySelectField);
    }

    public WebElement getPhoneInputField() {
        return getVisibleElement(phoneInputField);
    }
    public WebElement getSaveButton(){
        return getVisibleElement(saveButton);
    }
    public void fillAddressForm(String alias, String address, String city, String zipcode, String country, String phone){
        getAliasInputField().sendKeys(alias);
        getAddressInputField().sendKeys(address);
        getCityInputField().sendKeys(city);
        getZipCodeInputField().sendKeys(zipcode);

        Select select = new Select(getCountrySelectField());
        select.selectByVisibleText(country);

        getPhoneInputField().sendKeys(phone);
    }
    public void submitAddressForm(){
        getSaveButton().click();
    }
}
