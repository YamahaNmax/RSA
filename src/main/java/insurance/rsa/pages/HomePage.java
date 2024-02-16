package insurance.rsa.pages;


import insurance.rsa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='sc-138w2lj-0 kpPeQG sc-1ksyyhq-0 sc-b6ui4x-17']/div[3]/a[2]/span")
    WebElement searchVacancies;

    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement cookies;

    public void clickOnSearchVacancies() {
        clickOnElement(searchVacancies);
        log.info("Click on Search vacancies" + searchVacancies.toString());
    }

    public void acceptCookies() {
        clickOnElement(cookies);
        log.info("Accept all cookies" + cookies.toString());
    }

}
