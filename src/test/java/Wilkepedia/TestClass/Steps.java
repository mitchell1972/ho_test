package Wilkepedia.TestClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Wilkepedia.Utils.Utils.confirmUrl;
import static Wilkepedia.Utils.Utils.getUrl;
import static Wilkepedia.Utils.Utils.loopOption;
import static org.junit.Assert.assertEquals;

import Wilkepedia.Page.*;

public class Steps {

    WebDriver e = new ChromeDriver();
    String searchItem = "";
    String searchLanguage = "";
    String selectedLanguage = "";
    String displayedLanguage = "";

    @Given("^I have launched my browser$")
    public void i_have_launched_my_browser() {
        getUrl("https://www.wikipedia.org/", e);
    }

    @When("^I navigate to wikipedia$")
    public void i_navigate_to_wikipedia() {
        confirmUrl(e, "https://www.wikipedia.org/");
    }

    @When("^enter the text (.*)$")
    public void enter_the_text_XXXXXXXX(String args) {
        MainPage.searchField(e, "searchInput", args);
        searchItem = args;
    }

    @When("^Select (.*) as the search language$")
    public void select_English_as_the_search_language(String args) {
        selectedLanguage = args;
        MainPage.selectLanguage(e, "searchLanguage", args);
        searchLanguage = MainPage.getLanguage(e, "searchLanguage", args);

    }

    @When("^click on the search button$")
    public void click_on_the_search_button() {
        MainPage.searchButton(e, "pure-button").click();
    }

    @Then("^I am on the search result page$")
    public void i_am_on_the_search_result_page() {
        confirmUrl(e, "https://" + searchLanguage + ".wikipedia.org/wiki/" + searchItem);
    }

    @Then("^the first heading of the result matches the text (.*)$")
    public void the_first_heading_of_the_result_matches_the_text_XXXXXXX(String args) {
        MainPage.firstHeading(e, "firstHeading", args);
    }

    @Then("^the result page contains the text (.*) confirming that language displayed is (.*)$")
    public void the_result_page_contains_the_text_XXXXXX_confirming_that_language_displayed_is_XXXXXXXXX(String args1, String args2) {
        displayedLanguage = args2;
        ResultPage.getText(e, "siteSub", args1);

        assertEquals(selectedLanguage,displayedLanguage);
    }

}
