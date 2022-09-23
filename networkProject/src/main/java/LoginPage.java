import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage{
    By emailInput = By.cssSelector("input#n-input-email");
    By passwordInput = By.cssSelector("input#n-input-password");
    By loginButton = By.cssSelector("form#login > .-primary.block.large.n-button.text-center");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void fillform() {
    }
    public void checkloginbutton() {
    }


}
