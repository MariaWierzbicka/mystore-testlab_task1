import Pages.HeaderPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewAddress {

    WebDriver driver;
    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("user has an account on https:\\/\\/mystore-testlab.coderslab.pl\\/ and is not logged in")
    public void userHasAnAccountOnHttpsMystoreTestlabCoderslabPlAndIsNotLoggedIn() {
        driver.get("https://mystore-testlab.coderslab.pl/");
    }

    @When("sign in button is clicked")
    public void signInButtonIsClicked() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickSignInButton();
    }

    @And("valid <email> and <password> are entered and sign in button is clicked")
    public void validEmailAndPasswordAreEnteredAndSignInButtonIsClicked() {
    }

    @And("Logged users name is clicked")
    public void loggedUsersNameIsClicked() {
    }

    @And("Addresses or Add First Address is clicked")
    public void addressesOrAddFirstAddressIsClicked() {
    }

    @And("Create New Address is clicked")
    public void createNewAddressIsClicked() {
    }

    @And("form is filled with <alias> <address> <city> <zipcode> <country> <phone>")
    public void formIsFilledWithAliasAddressCityZipcodeCountryPhone() {
    }

    @And("Save button is clicked")
    public void saveButtonIsClicked() {
    }

    @Then("success alert is displayed")
    public void successAlertIsDisplayed() {
    }

    @And("added address is displayed")
    public void addedAddressIsDisplayed() {
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
