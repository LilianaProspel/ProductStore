package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target PLACE_ORDER_BUTTON = Target.the("place order button")
            .located(By.xpath("//button[contains(text(),'Place Order')]"));
}
