package starter.AutomationTests;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

public class StepsDefinition {

    public RequestSpecification rq;

    @Given("^the url: (.*)$")
    public void setURL(String url) {
        rq = SerenityRest.given().baseUri(url).log().all();

    }

    @When("^I perform GET call to it$")
    public void performGet() {
        rq.get().prettyPrint();
    }

    @Then("^the response should be (.*)$")
    public void responseCode(Integer statusCode) {
        Integer actualStatusCode = SerenityRest.lastResponse().getStatusCode();
        Assert.assertEquals(statusCode, actualStatusCode);
    }

    @And("^the query param: (.*) = (.*)$")
    public void addQueryParam(String queryParamName, String queryParamValue) {
        rq.queryParam(queryParamName, queryParamValue);
    }

    @And("^the response contains: (.*)$")
    public void responseBody(String response) {
        String responseBody = SerenityRest.lastResponse().getBody().asString();
        Assert.assertTrue("Expected result does not match actual: " + response + " " + responseBody, responseBody.contains(response));
    }

    @And("^the response JSON Array has: (.*) = (.*)$")
    public void responseJsonArray(String key, String value) {

        String response = SerenityRest.lastResponse().getBody().asString();
        JsonArray jsa = Util.stringToJson(response);

        for (JsonElement je : jsa) {
            JsonObject jsonObject = je.getAsJsonObject();
            String actualValue = jsonObject.get(key).getAsString();
            Assert.assertTrue("Expected result does not match actual: " + value + " " + actualValue, value.equals(actualValue));
        }
    }

    @And("^the response JSON Object has: (.*) = (.*)$")
    public void responseJsonObject(String key, String value) {

        String response = SerenityRest.lastResponse().getBody().asString();
        JsonObject jsonObject = Util.stringToJsonObject(response);

        String actualValue = jsonObject.get(key).getAsString();
        Assert.assertTrue("Expected result does not match actual: " + value + " " + actualValue, value.equals(actualValue));
    }
}




