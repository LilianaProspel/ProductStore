package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.demoblaze.ui.DemoblazeHomePage.*;

public class AddToCart {

    public static Task theFirstProduct() {
        return Task.where("{0} adds the first product to the cart",
                Click.on(FIRST_PRODUCT),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(HOME_LINK)
        );
    }

    public static Task theSecondProduct() {
        return Task.where("{0} adds the second product to the cart",
                Click.on(SECOND_PRODUCT),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(HOME_LINK)
        );
    }
}
