import org.openqa.selenium.WebDriver;
public  class HomePage extends BasePage {


    public  HomePage(WebDriver driver) {
        super(driver);
    }



    String secondURl = driver.getCurrentUrl();

    public void checkHomePageUrl() {
        checkUrl("https://www.network.com.tr/");
    }


    }

