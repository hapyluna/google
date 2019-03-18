import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;


public class FirstTest {
    private WebDriver driver;

    @Before
    public void Setup(){

        String pathToGeckoDriver = "/home/antonio/source/Tests/src/test/resources/geckodriver";
        String pathToChromeDriver="";

        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        System.setProperty("webdriver.gecko.driver",pathToGeckoDriver);

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void Test1(){

        driver.navigate().to("http://www.google.es");

        String title = driver.findElement(By.id("hplogo")).getAttribute("alt");

        Assert.assertEquals(title,"Google");
    }

    @After
    public void teardown(){
        driver.close();
    }

}
