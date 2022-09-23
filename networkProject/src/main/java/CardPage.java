import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends BasePage {
    By oldPrice = By.cssSelector(".-labelPrice.-old.cartItem__price");
    By newPrice = By.cssSelector(".-sale.cartItem__price");
    By continueButton = By.cssSelector(".summary > .-primary.block.continueButton.large.n-button.text-center");


    public CardPage(WebDriver driver) {
        super(driver);
    }

    public void checksizeandprice() {
    }

    public void controldiscount() {
    }

    public void clickcontinuebutton() {
        clicks(continueButton);
    }
}
