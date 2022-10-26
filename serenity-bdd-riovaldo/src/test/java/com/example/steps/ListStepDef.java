package com.example.steps;
import com.example.app.pages.CalculatorPage;
import com.example.app.pages.ListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ListStepDef {
    private CalculatorPage calculatorPage = new CalculatorPage();
    private ListPage listPage =new ListPage();

    @When("User tap three stripes button")
    public void userTapThreeStripesButton (){
        calculatorPage.tapThreeStripesButton();}
    @Then("Menu banner showed up")
    public void menuBannerShowedUp(){
        calculatorPage.menuBanner();}
    @And("Menu calculator and list showed up")
    public void menuListShowedUp() {
        calculatorPage.calculatorAndList();}

    @When("User tap list menu")
    public void userTapListMenu(){
        calculatorPage.tapListMenu();}

    @Then("list results showing up")
    public void listResultsShowingUp(){
        calculatorPage.listResult();}


    @And("User can scroll down all list content")
    public void userCanScrollAllListContent() {
        calculatorPage.listScroll();}

    @Given("User at list menu page")
    public void userAtListMenuPage(){
        listPage.listMenu();}


    @When("User double tap a content")
    public void userDoubleTapAContent(){
        listPage.doubleTap();}

    @Then("User will stay at list page")
    public void userWillStayAtListPage() {
        String headerText = listPage.StaylistMenu();
        Assertions.assertEquals("List", headerText);}

    @When("Hold tap a content")
    public void holdTapAContent() {
        listPage.HoldTap();}


}
