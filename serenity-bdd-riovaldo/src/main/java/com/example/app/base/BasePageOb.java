package com.example.app.base;


import com.example.app.drivers.DriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class BasePageOb {

    public AndroidDriver<AndroidElement> getDriver(){
        return DriverInit.driver;
    }

    public AndroidElement find(By by ){
        return getDriver().findElement(by);}

    public void type(By by){
        AndroidElement element = find(by);
        element.clear();
        element.sendKeys();}

    public void click(By by){
        find(by).click();}



    public String getText(By by){
        return find(by).getText();}
    public String headerCalculatorTitle(By by) {
        return find(by).getText();}

    public boolean isDisplayed(By by){
        return find(by).isDisplayed();
    }









}
