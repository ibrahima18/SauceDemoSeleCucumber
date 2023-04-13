import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductStepDefs {


    private WebDriver driver=Maclass.driver;
String ExpectedTitle="Products";

By titre = By.cssSelector("div.header_secondary_container > span");

   //header_secondary_container
    @Then("je suis connecte à la page \"Products\"")
    public void jeSuisConnecteALaoageProducts() {
        String prodUCTitle=driver.findElement(titre).getText();
        Assert.assertEquals(prodUCTitle,ExpectedTitle);
    }
}
