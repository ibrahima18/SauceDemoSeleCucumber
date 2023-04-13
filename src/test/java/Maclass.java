
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class Maclass {
    public static WebDriver driver;

    @Before
    public void OpenBrowser() throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        // actualise la version de mon driver//
        ChromeOptions options = new ChromeOptions();
        // L'options  permet d'activer le driver  chrome//
        options.addArguments("--remote-allow-origins=*");
      // pour selenium grid au lieu de de new ChromeDriver //
        driver= new RemoteWebDriver(new URL(" http://172.16.15.84:4444/wd/hub"),options);
        //driver=new ChromeDriver(options);
        driver.manage().window().maximize();

    }
    @After
    public void embedScreenshot(Scenario scenario) {

        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        driver.quit();
    }

   // public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
     //   ImportResultToXray importResultToXray = new ImportResultToXray();
      // }
   public static void main(String[] args) throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, KeyManagementException, InterruptedException {
       ImportResultToXray importResultToXray = new ImportResultToXray();
       importResultToXray.ImportToXray();
   }
}

