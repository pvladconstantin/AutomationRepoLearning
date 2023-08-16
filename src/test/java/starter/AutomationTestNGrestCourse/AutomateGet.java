package starter.AutomationTestNGrestCourse;

import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutomateGet {

    @Test (priority = 1)
    public void validate_get_status_code() {
        given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/status").
                then().
                assertThat().
                statusCode(200).
                log().all();
    }

    @Test (priority = 2)
    public void validate_response_body() {
        given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/books").
                then().
                assertThat().
                statusCode(200).
                log().all().
                body("name", hasItems("The Russian", "Just as I Am", "The Vanishing Half", "The Midnight Library", "Untamed", "Viscount Who Loved Me"),
                        "type", hasItems("fiction", "non-fiction"),
                        "available", hasItems(true, false));

    }

    @Test (priority = 3)
    public void validate_response_body_typeFiction() {
        given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/books?type=fiction").
                then().
                assertThat().
                statusCode(200).
                log().all().
                body("name", hasItems("The Russian", "The Vanishing Half", "The Midnight Library", "Viscount Who Loved Me"),
                        "type", hasItems("fiction"));
    }

    @Test (priority = 4)
    public void validate_response_body_typeNonFiction() {
        given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/books?type=non-fiction").
                then().
                assertThat().
                statusCode(200).
                log().all().
                body("name", hasItems("Just as I Am", "Untamed"),
                        "type", hasItems("non-fiction"));
        System.out.println("'Just as I am' and 'Untamed' are books from non-fiction");
    }

    @Test (priority = 5)
    public void extract_response() {
        Response fullRes = given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/books").
                then().
                assertThat().
                statusCode(200).
                extract().response();
        System.out.println("Full response extract, as a String: " + fullRes.asString());

    }

    @Test (priority = 6)
    public void extract_single_value_from_response() {
        Response singleValueOfRes = given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/books").
                then().
                assertThat().
                statusCode(200).
                extract().response();
        System.out.println("Book names, as a String: " + singleValueOfRes.path("name").toString());

    }

    @Test(priority = 7)
    public void assert_on_extracted_response() {
        // Send a GET request to the API
        String response = given()
                .baseUri("https://simple-books-api.glitch.me")
                .when()
                .get("/books")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .asString(); // Extract the response as a string

        // Check if the entire response body contains the "name": "Untamed"
        boolean containsUntamed = response.contains("\"name\":\"Untamed\"");
        if (containsUntamed) {
            System.out.println("The 'Untamed' book is present in the response.");
        } else {
            Assert.fail("Response does not contain book with name 'Untamed'");
        }
    }

    @Test (priority = 8)
    public void hamcrest_validate_response_body_onSingle_element() {
        given().
                baseUri("https://simple-books-api.glitch.me").
                when().
                get("/books").
                then().
                assertThat().
                statusCode(200).
                log().all().
                body("name", hasItems("Untamed", "Just as I Am"));
        System.out.println("Hamcrest validation result: Untamed and Just as I AM titles could be found within the response body 'nanme'");

    }



}