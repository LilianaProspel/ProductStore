package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoblaze.ui.DemoblazeHomePage.CART_BUTTON;

public class ViewCart {
    public static Task view() {
        return Task.where("{0} views the cart",
                Click.on(CART_BUTTON)
        );
    }
}
