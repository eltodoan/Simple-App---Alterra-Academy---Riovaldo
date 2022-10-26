package com.example.app.pages;
import com.example.app.base.BasePageOb;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import static com.example.app.drivers.DriverInit.driver;
public class LoginPage extends BasePageOb {

    public String headerTitle () {
       return getText(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
               "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));}

    public void typeUsername (String username){
        By locator = MobileBy.id ("username");
        AndroidElement InputUsername = driver.findElement(locator);
        InputUsername.clear();
        InputUsername.sendKeys(username);}

    public void typePassword(String password) {
        By locator = MobileBy.id ("password");
        AndroidElement InputPassword = driver.findElement(locator);
        InputPassword.clear();
        InputPassword.sendKeys(password);}

    public void tapSignInButton (){
        By locator = MobileBy.id("login");
        AndroidElement signInButton = driver.findElement(locator);
        signInButton.click();}


}
