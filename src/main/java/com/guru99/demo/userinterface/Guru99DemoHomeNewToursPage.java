package com.guru99.demo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Guru99DemoHomeNewToursPage {
    public static final Target REGISTER = Target.the("Register Button")
            .located(By.xpath("//td/a[@href='register.php']"));

}
