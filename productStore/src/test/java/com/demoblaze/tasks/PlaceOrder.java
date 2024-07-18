package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoblaze.ui.CartPage.PLACE_ORDER_BUTTON;

public class PlaceOrder {
    public static Task click() {
        return Task.where("{0} clicks on Place Order button",
                Click.on(PLACE_ORDER_BUTTON)
        );
    }
}
