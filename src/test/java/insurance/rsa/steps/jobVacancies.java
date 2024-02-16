package insurance.rsa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insurance.rsa.pages.HomePage;
import insurance.rsa.pages.VacanciesPage;
import org.testng.Assert;

public class jobVacancies {
    @Given("^I am on homepage of RSA$")
    public void iAmOnHomepageOfRSA() {
    }

    @When("^I click on search vacancies$")
    public void iClickOnSearchVacancies() {
        new HomePage().acceptCookies();
        new HomePage().clickOnSearchVacancies();
    }

    @And("^I enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void iEnter(String keyword, String town, String businessLine, String hireType) {
        new VacanciesPage().enterKeywords(keyword);
        new VacanciesPage().enterTown(town);
        new VacanciesPage().selectBusinessLine(businessLine);
        new VacanciesPage().selectHireType(hireType);
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new VacanciesPage().clickOnSearchButton();
    }

    @Then("^I should able to see the \"([^\"]*)\"$")
    public void iShouldAbleToSeeThe(String jobVacancy) {
        Assert.assertEquals(new VacanciesPage().verifyTheResults(), jobVacancy, "search result");

    }

}
