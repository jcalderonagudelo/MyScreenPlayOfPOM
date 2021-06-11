package com.guru99.demo.tasks;

import com.guru99.demo.userinterface.Guru99DemoHomeNewToursPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Guru99DemoHomeNewToursPage.REGISTER));
    }
    public static GoToRegister register(){
        return instrumented(GoToRegister.class);
    }
}
