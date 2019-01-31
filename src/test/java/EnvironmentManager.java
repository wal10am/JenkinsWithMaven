public class EnvironmentManager {
    public static void initWebDriver(){
        String exePath = "/Users/shannonmcnellis/learning/SeleniumWithMaven/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
    }
}
