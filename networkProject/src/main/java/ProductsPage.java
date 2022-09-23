import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProductsPage extends BasePage {
    By showMore = By.cssSelector(".-secondary.-sm.button.relative");
    By firstDiscountProduct = By.cssSelector("div#products > .row > div:nth-of-type(1)");
    By productSize = By.xpath("//div[@id='products']/div[@class='row']/div[1]/div//div[@class='product__sizeItem']/div[12]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void scrollElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", showMore);
    }
    public void checkSecondPageUrl() {
        checkUrl("https://www.network.com.tr/search?searchKey=ceket&page=2");
    }
    public void clickShowMoreButton(){
        clicks(showMore);
    }

    public void isOnSecondProductPage() {
    }
    public void hoverAndSelectSize() {
        hoverOver(firstDiscountProduct);
        clicks(productSize);
    }




}
