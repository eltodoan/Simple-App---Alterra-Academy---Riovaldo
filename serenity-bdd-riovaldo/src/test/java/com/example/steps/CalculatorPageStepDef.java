package com.example.steps;

import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageStepDef {

 private CalculatorPage calculatorPage = new CalculatorPage();

 @Then("First number field appear")
 public void firstNumberFieldAppear(){
  String Text = calculatorPage.firstFieldText();
  Assertions.assertEquals("Angka 1", Text);}

 @And("Arrow button appear")
 public void arrowButtonAppear(){
  boolean isDisplayed = calculatorPage.arrowButton();
  Assertions.assertTrue(isDisplayed);}

 @And("Second number field appear")
 public void secondNumberFieldAppear(){
  String Text = calculatorPage.secondFieldText();
  Assertions.assertEquals("Angka 2", Text);}

 @And("Equal button appear")
 public void equalButttonAppear(){
  String Text = calculatorPage.equalButton();
  Assertions.assertEquals("=", Text);}

 @And("Default result description appear")
 public void defaultResultDescriptionAppear(){
  String Text = calculatorPage.resultDesc();
  Assertions.assertEquals("Hasil : 0", Text);}


 @Given("User at calculator main page")
 public void userAtCalculatorMainPage(){
  calculatorPage.calculatorHeaderText();}

 @When("User input data {} on first field")
 public void userInputDataOnFirstField (String number){
  calculatorPage.typeFirtsField (number);}

 @And("User input data {} on second field")
 public void userInputDataOnSecondField(String number){
  calculatorPage.typeSecondField(number);}

 @And("User tap arrow button")
 public void userTapArrowButton(){
  calculatorPage.tapArrow();}

 @And("User Tap equal button")
 public void userTapEqualButton(){
  calculatorPage.tapEqualButton();}

 @Then("Accurate result appear")
 public void accurateResultAppear(){
 String Text = calculatorPage.resultPreview();
  Assertions.assertEquals("Hasil : 20",Text);}


 @And("User set method \\(-)")
 public void userSetMethod(){
  calculatorPage.mathMethodSubtraction();}

 @Then("Accurate subtraction result appear")
 public void accurateSubstractionResultAppear(){
  calculatorPage.resultPreview();
  String Text = calculatorPage.resultPreview();
  Assertions.assertEquals("Hasil : 0",Text);}

 @And("User set method division \\(:)")
 public void userSetMethodDivision(){
  calculatorPage.mathMethodDivision();}

 @Then("Accurate division result appear")
 public void accurateDivisionResultAppear(){
  calculatorPage.resultPreview();
  String Text = calculatorPage.resultPreview();
  Assertions.assertEquals("Hasil : 1",Text);}

 @And("User set method multiplication \\(x)")
 public void userSetMethodMultiplicationX(){
  calculatorPage.mathMethodMultiplication();}

 @Then("Accurate multiplication result appear")
 public void accurateMultiplicationResultAppear(){
  calculatorPage.resultPreview();
  String Text = calculatorPage.resultPreview();
  Assertions.assertEquals("Hasil : 10000",Text);}



}

