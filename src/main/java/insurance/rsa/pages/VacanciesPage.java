package insurance.rsa.pages;


import insurance.rsa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VacanciesPage extends Utility {

    private static final Logger log = LogManager.getLogger(VacanciesPage.class.getName());

    public VacanciesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(name = "keywords")
    WebElement keyword;

    @CacheLookup
    @FindBy(id = "LOV118")
    WebElement town;

    @CacheLookup
    @FindBy(id = "LOV22")
    WebElement businessLine;

    @CacheLookup
    @FindBy(id = "LOV20")
    WebElement hireType;

    @CacheLookup
    @FindBy(id = "ResultsperpageFieldLabelDescription-0")
    WebElement resultPerPage;

    @CacheLookup
    @FindBy(xpath = "//form[@id='talentSearchForm']/div[5]/div/button")
    WebElement searchButton;

    @CacheLookup
    @FindBy(id = "thr1")
    WebElement resultText;


    public void enterKeywords(String KeyWords) {
        log.info("Enter" + KeyWords + "to Keyword field " + keyword.toString());
        sendTextToElement(keyword, KeyWords);
    }

    public void enterTown(String Town) {
        log.info("Enter " + Town + "from Town field " + town.toString());
        selectByVisibleTextFromDropDown(town, Town);
    }

    public void selectBusinessLine(String BusinessLine) {
        log.info("Select " + BusinessLine + "from Business Line field " + businessLine.toString());
        selectByVisibleTextFromDropDown(businessLine, BusinessLine);
    }

    public void selectHireType(String HireType) {
        log.info("Select " + HireType + "from Hire type field " + hireType.toString());
        selectByVisibleTextFromDropDown(hireType, HireType);
    }

    public void selectResultPerPage(String ResultPerPage) {
        log.info("Select " + ResultPerPage + "from Results per page " + resultPerPage.toString());
        selectByVisibleTextFromDropDown(resultPerPage, ResultPerPage);
    }

    public void clickOnSearchButton() {
        log.info("Click on Search Button" + searchButton.toString());
        clickOnElement(searchButton);
    }

    public String verifyTheResults() {
        return getTextFromElement(resultText);
    }
}








