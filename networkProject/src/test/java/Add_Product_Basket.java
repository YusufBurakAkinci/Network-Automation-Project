
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public  class Add_Product_Basket extends BaseTest{
        HomePage homePage;
        ProductsPage productsPage;
        CardPage cardPage;
        LoginPage loginPage;
        RemoveCardPopUp removeCardPopUp;
        ShoppingBag shoppingBag;

        stickyHeader stickyHeader;

       @Test
            public  void check_homepage_url(){
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           homePage = new HomePage(driver);
           homePage.checkHomePageUrl();
       }

        @Test
        public void search_product(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            stickyHeader = new stickyHeader(driver);
            stickyHeader.searchBox();
        }
        @Test
        public void scroll_product_list_page(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            productsPage = new ProductsPage(driver);
            productsPage.scrollElement();
            productsPage.clickShowMoreButton();
            productsPage.checkSecondPageUrl();

        }
        @Test
        public void product_add_basket(){
            productsPage.hoverAndSelectSize();
            shoppingBag.clickGoToBasketButton();
            cardPage.checksizeandprice();
        }
        @Test
        public void check_product_detail(){
            cardPage.controldiscount();
            cardPage.clickcontinuebutton();


        }
        @Test
        public void login_fill_form(){
            loginPage.fillform();
            loginPage.checkloginbutton();

        }
        @Test
        public void check_basket(){
            stickyHeader.clickHeaderCheckoutLogo();
            stickyHeader.clickShoppingBag();
            shoppingBag.clickRemoveIcon();
            removeCardPopUp.removeCardModelButton();
            stickyHeader.clickShoppingBag();
            shoppingBag.checkEmptyBasketText();

        }



}
