package com.example.hooks;



import com.example.app.drivers.DriverInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AndroidHook {

    @Before( value = "@android")
    public void befScenario() {
        DriverInit.initialize();}



}
