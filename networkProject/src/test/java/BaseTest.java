import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(testlogger.TestResultLogger.class)
public class BaseTest {
     WebDriver driver;

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.network.com.tr/");
        driver.manage().window().maximize();


    }
    @AfterAll
    public static void tearDown(){
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
