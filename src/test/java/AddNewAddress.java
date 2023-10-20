import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewAddress {

    WebDriver driver;
    AddAddressFormPage addAddressFormPage;
    AddressesPage addressesPage;
    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("user has an account on mystore-testlab.coderslab.pl and is not logged in")
    public void userHasAnAccountOnHttpsMystoreTestlabCoderslabPlAndIsNotLoggedIn() {
        driver.get("https://mystore-testlab.coderslab.pl/");
    }

    @When("sign in button is clicked")
    public void signInButtonIsClicked() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickSignInButton();
    }

    @And("valid {} and {} are entered and sign in button is clicked")
    public void validEmailAndPasswordAreEnteredAndSignInButtonIsClicked(String email, String password) {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.logIntoAnExistingAccount(email, password);
    }

    @And("Addresses button is clicked")
    public void addressesButtonIsClicked() {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickAddressButton();
    }

    @And("Create New Address is clicked")
    public void createNewAddressIsClicked() {
        addressesPage = new AddressesPage(driver);
        addressesPage.clickCreateNewAddressButton();
    }

    @And("^form is filled with data \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void formIsFilledWithData(String alias, String address, String city, String zipcode, String country, String phone) {
        addAddressFormPage = new AddAddressFormPage(driver);
        addAddressFormPage.fillAddressForm(alias, address, city, zipcode, country, phone);
    }

    @And("Save button is clicked")
    public void saveButtonIsClicked() {
        addAddressFormPage.submitAddressForm();
    }

    @Then("success alert is displayed")
    public void successAlertIsDisplayed() {
        String alertSuccessText = addressesPage.getAlertSuccessText();
        Assert.assertEquals("Address successfully added!", alertSuccessText);

    }
    @And("added address is displayed with proper data \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void addedAddressIsDisplayedWithProperData(String alias, String address, String city, String zipcode, String country, String phone) {
        String displayedAlias = addressesPage.getAddedAddressAlias().getText();
        Assert.assertEquals(alias, displayedAlias);
        String displayedAddressDetails = addressesPage.getAddedAddressDetails().getText();
        Assert.assertTrue(displayedAddressDetails.contains(address));
        Assert.assertTrue(displayedAddressDetails.contains(city));
        Assert.assertTrue(displayedAddressDetails.contains(zipcode));
        Assert.assertTrue(displayedAddressDetails.contains(country));
        Assert.assertTrue(displayedAddressDetails.contains(phone));
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
