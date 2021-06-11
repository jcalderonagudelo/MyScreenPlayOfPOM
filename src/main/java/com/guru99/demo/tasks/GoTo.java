package com.guru99.demo.tasks;

import com.guru99.demo.userinterface.Guru99DemoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    public static GoTo newTours() {
        return instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(Guru99DemoHomePage.NEW_TOURS));
    }
}
