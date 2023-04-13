import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginStepdefs {

private WebDriver driver=Maclass.driver;
// Pour
   // @FindBy(css = "input.form_input")
   // private WebElement id_sapce;
    /// pour  initaliser la page  PageFactory.initElements(driver,this);
    By id_space = By.cssSelector("input.form_input");

    By ExpectedMssg=By.cssSelector("div.error-message-container");

    @Given("je ouvre la page de accueil {string}")
    public void jeOuvrelapageDeAccueil(String arg) {
        driver.get(arg);
    }

    @When("je rentre le identifiant {string} dans le champ identifiant")
    public void jeRentreleIdentifiantDanslechamp(String arg1) {
        driver.findElements(id_space).get(0).sendKeys(arg1);
    }

    @And("je rentre le mot de passe {string}")
    public void jeRentreleMotDepasse(String arg2) {
        driver.findElements(id_space).get(1).sendKeys(arg2);
    }

    @And("je clique  sur le bouton Login")
    public void jeCliqueSurLeBoutonLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("je verifie le  message de erreur {string}")
    public void jeVerifieLeMessageDeErreur( String arg3) {
        String ErrMsg=driver.findElement(ExpectedMssg).getText();
        Assert.assertEquals(ErrMsg,arg3);
    }
}
