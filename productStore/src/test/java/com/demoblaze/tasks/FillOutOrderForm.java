package com.demoblaze.tasks;

import java.util.Map;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class FillOutOrderForm {

    private static Target nameField = Target.the("Name field").locatedBy("#name");
    private static Target countryField = Target.the("Country field").locatedBy("#country");

    public static void withInformation(DataTable dataTable) {
        // Convert the DataTable to a Map, extract the information and fill the form
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        Actor.named("User").attemptsTo(
                Enter.theValue(data.get("Name")).into(nameField),
                Enter.theValue(data.get("Country")).into(countryField)
                // Add more fields as needed
        );
    }
}