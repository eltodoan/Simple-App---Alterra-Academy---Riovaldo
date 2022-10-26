package com.example.steps;

import com.example.app.pages.CalculatorPage;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class LoginStepDef {

    private LoginPage loginPage = new LoginPage();
    private CalculatorPage calculatorPage = new CalculatorPage();

    @Given("User at login page")
    public void userAtLoginPage() {
        String headerText = loginPage.headerTitle();
        Assertions.assertEquals("Simple App", headerText);}

    @When("User input username with {}")
    public void userInputUsernameWith(String username) {
        loginPage.typeUsername(username);}

    @And("User input password with {}")
    public void userInputPasswordWith(String password) {
        loginPage.typePassword(password);}

    @And("User click sign in or register button")
    public void userClickSignInOrRegisterButton() {
        loginPage.tapSignInButton();}

    @Then("User login successfully")
    public void userLoginSuccessfully() {
        //calculatorMainPage.calculatorHeader();
        boolean isDisplayed = calculatorPage.calculatorHeaderText();
        Assertions.assertTrue(isDisplayed);}
//        Assertions.assertEquals("Calculator", Text);


    @Then("User unsuccessfully login")
    public void userUnsuccessfullyLogin() {
        String headerText = loginPage.headerTitle();
        Assertions.assertEquals("Simple App", headerText);}

    @And("Login invalid pop up message appear")
    public void loginInvalidPopUpMessageAppear() {
    }
}