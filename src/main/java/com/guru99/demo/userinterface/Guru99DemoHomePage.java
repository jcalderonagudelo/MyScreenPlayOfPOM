package com.guru99.demo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.guru99.com/")
public class Guru99DemoHomePage extends PageObject {
    public static final Target NEW_TOURS = Target.the("New Tours link").located(By.xpath("//li[@class='dropdown'][10]"));
}
