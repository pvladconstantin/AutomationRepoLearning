package starter.AutomationTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;

public class StepsDefinition {

    public RequestSpecification rq;

@Given("^the url: (.*)$")
    public void setURL (String url) {
    rq = SerenityRest.given().baseUri(url).log().all();

}

@When("^I perform GET call to it$")
    public void performGet () {
    rq.get().prettyPrint();
}

}
