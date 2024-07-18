package com.demoblaze.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoblazeHomePage {
    public static final Target FIRST_PRODUCT = Target.the("first product")
            .located(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
    public static final Target SECOND_PRODUCT = Target.the("second product")
            .located(By.xpath("//a[contains(text(),'Nokia lumia 1520')]"));
    public static final Target ADD_TO_CART_BUTTON = Target.the("add to cart button")
            .located(By.xpath("//a[contains(text(),'Add to cart')]"));
    public static final Target CART_BUTTON = Target.the("cart button")
            .located(By.id("cartur"));
    public static final Target HOME_LINK = Target.the("Home link")
            .locatedBy("//a[text()='Home ']");
    public static final Target SUCCESS_MESSAGE = Target.the("Success message")
            .locatedBy("//h2[text()='Thank you for your purchase!']");
}
