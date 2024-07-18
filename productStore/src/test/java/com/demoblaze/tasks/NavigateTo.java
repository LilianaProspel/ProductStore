package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Task theDemoblazeHomePage() {
        return Task.where("{0} opens the demoblaze home page",
                Open.url("https://www.demoblaze.com/")
        );
    }
}
