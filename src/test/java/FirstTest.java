import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class FirstTest {

    @Before
    public void startBrowser(){
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void demo(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
        System.out.println("After Assertion " + expectedTitle + actualTitle + " Title matched ");

    }


}
