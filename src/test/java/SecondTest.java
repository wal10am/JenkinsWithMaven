import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class SecondTest {
    @Before
    public void startBrowser(){
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void demo2(){
        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        driver.get("https://www.yahoo.com/");
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
        System.out.println("After Assertion " + expectedTitle + actualTitle + " Title matched ");
    }
}


