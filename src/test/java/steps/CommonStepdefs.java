package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;

import java.util.List;

public class CommonStepdefs extends CommonPage {


    @Given("I go to url {string}")
    public static void iGoToUrl(String url) {
        getUrl(url);
    }
     @Given("I select the {string} link")
    public void i_select_the_link(String link) {
		// Write code here that turns the phrase above into concrete actions
    	selectLink("selectLink");
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be on the {string} page")
    public void i_should_be_on_the_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I click the Start now button")
    public void i_click_the_start_now_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I search for company {string} and view the company details")
    public void i_search_for_company_and_view_the_company_details(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("I validate that the details are displayed")
    public void iValidateThatTheDetailsAreDisplayed(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        String CompanyStatusExpected = data.get(1).get(1);
        String CompanyTypeExpected = data.get(1).get(1);
        String IncorporatedExpected = data.get(3).get(1);


        System.out.println("CompanyStatus " + CompanyStatusExpected);
        System.out.println("CompanyType " + CompanyTypeExpected);

        String CompanyStatusActual = driver.findElement(By.id("company-status")).getText();
        String CompanyTypeActual = driver.findElement(By.id("company-type")).getText();
        String IncorporatedActual = driver.findElement(By.id("company-creation-date")).getText();

        Assert.assertEquals(CompanyStatusExpected, CompanyStatusActual);
        Assert.assertEquals(CompanyTypeExpected, CompanyTypeActual);
        Assert.assertEquals(IncorporatedExpected, IncorporatedActual);
    }


}
