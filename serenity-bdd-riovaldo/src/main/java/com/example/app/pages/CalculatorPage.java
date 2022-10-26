package com.example.app.pages;

import com.example.app.base.BasePageOb;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.DriverInit.driver;

public class CalculatorPage extends BasePageOb {

    public boolean calculatorHeaderText () {
      return isDisplayed(MobileBy.id("et_1"));}
    public String firstFieldText () {
        return getText(MobileBy.id("et_1"));}

    public String secondFieldText (){
        return getText(MobileBy.id("et_2"));}

    public boolean arrowButton (){
        return isDisplayed(MobileBy.id("spinner_1"));}

    public String equalButton (){
        return getText(MobileBy.id("acb_calculate"));}
    public String resultDesc (){
        return getText(MobileBy.id("tv_result"));}

    public void tapThreeStripesButton () {
        click(MobileBy.AccessibilityId("Open navigation drawer"));}
    public void menuBanner () {
        find(MobileBy.className("android.widget.LinearLayout"));}
    public void calculatorAndList () {
        find(MobileBy.id("nav_calculator"));
        find(MobileBy.id("nav_list"));}

    public void tapListMenu () {
        click(MobileBy.id("nav_list"));}

    public void listResult () {
        find(MobileBy.className("android.widget.TextView"));}

    public void listScroll () {
        find(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"List ke-100\"))"));}

    public void typeFirtsField (String data){
        By locator = MobileBy.id ("et_1");
        AndroidElement Inputdata = driver.findElement(locator);
        Inputdata.clear();
        Inputdata.sendKeys(data);}

    public void typeSecondField (String data2){
            By locator = MobileBy.id ("et_2");
            AndroidElement Inputdata2 = driver.findElement(locator);
            Inputdata2.clear();
            Inputdata2.sendKeys(data2);}

    public void tapArrow (){

        By locator = MobileBy.id("spinner_1");
        AndroidElement signInButton = driver.findElement(locator);
        signInButton.click();}
    public void tapEqualButton () {
        click(MobileBy.id("acb_calculate"));}



    public void mathMethodSubtraction () {
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
        AndroidElement subtraction = driver.findElement(locator);
        subtraction.click();}

    public void mathMethodDivision () {
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
        AndroidElement division = driver.findElement(locator);
        division.click();}

    public void mathMethodMultiplication () {
        By locator = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
        AndroidElement multiplication = driver.findElement(locator);
        multiplication.click();}

    public String resultPreview (){
       return getText(MobileBy.id("tv_result"));}

}














