package com.demotest.myhooks;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class VnExpressHooks {

    @Before(order = 1)
    public void setup2(Scenario sc) {
        System.out.println("Before nha 2" + sc.getName());
    }

    @Before(order = 2)
    public void setup1() {
        System.out.println("Before nha 1");
    }

    @After(order = 2)
    public void tearDown2() {
        System.out.println("Tear down 2");
    }

    @After(order = 1)
    public void tearDown1() {
        System.out.println("Tear down 1 ");
    }

    @After(order = 3)
    public void tearDown3(Scenario sc) {
        System.out.println("Tear down 3" + sc.getName());
    }



}
