package starter.PracticeAPI;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.head;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class E2E_Flow_PracticeAPI {

    private static String authToken;
    private static String bookingId;
    private static String baseUrl = "https://restful-booker.herokuapp.com";

    //Creating HashMap method to simplify the headers implementation
    private HashMap<String, String> headers() {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        headers.put("Cookie", "token=" + authToken);
        return headers;

    }

    @Test(priority = 1)
    public void health_check_bookingEndpoint() {
        given().
                baseUri(baseUrl).
                when().
                get("/booking").
                then().
                assertThat().
                statusCode(200).
                log(); //use log().all(); to print the entire response body, but it is tooooo long.
        System.out.println("/booking endpoint has proper health: Status Code 200");
    }

    @Test(priority = 2)
    public void create_token() {

        String requestBody = "{\"username\": \"admin\", \"password\": \"password123\"}"; //requestBody for createtoken

        Response response = given() //save the request response into a string
                .baseUri(baseUrl)
                .headers(headers())
                .body(requestBody)
                .when()
                .post("/auth")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all().extract().response();

        response.then().assertThat().body("token", notNullValue());
        authToken = response.jsonPath().getString("token"); //creating the authToken from the response json
        System.out.println("Auth token is received: " + authToken);
    }

    @Test(priority = 3)
    public void create_booking() {

        String requestBody = "{" +
                "\"firstname\": \"Ionut\"," +
                "\"lastname\": \"Fanomeru\"," +
                "\"totalprice\": 125," +
                "\"depositpaid\": true," +
                "\"bookingdates\": {" +
                "\"checkin\": \"2018-01-01\"," +
                "\"checkout\": \"2019-01-01\"" +
                "}," +
                "\"additionalneeds\": \"Breakfast\"" +
                "}";

        Response response = given()
                .baseUri(baseUrl)
                .headers(headers())
                .body(requestBody)
                .when()
                .post("/booking")
                .then()
                .assertThat()
                .statusCode(200)
                .log().all()
                .extract().response();

        response.then().assertThat().body("bookingid", notNullValue());

        bookingId = response.jsonPath().getString("bookingid");
        System.out.println("The following bookingId was created: " + bookingId);
    }


    @Test(priority = 4)
    public void update_booking() {

        String requestBody = "{" +
                "\"firstname\": \"Vlad\"," +
                "\"lastname\": \"Test\"," +
                "\"totalprice\": 555," +
                "\"depositpaid\": true," +
                "\"bookingdates\": {" +
                "\"checkin\": \"2018-01-01\"," +
                "\"checkout\": \"2019-01-01\"" +
                "}," +
                "\"additionalneeds\": \"Breakfast\"" +
                "}";

        given()
                .baseUri(baseUrl)
                .headers(headers())
                .body(requestBody)
                .when()
                .put("/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all()
                .body("firstname", equalTo("Vlad"))
                .body("lastname", equalTo("Test"))
                .body("totalprice", equalTo(555))
                .body("depositpaid", equalTo(true))
                .body("bookingdates.checkin", equalTo("2018-01-01"))
                .body("bookingdates.checkout", equalTo("2019-01-01"))
                .body("additionalneeds", equalTo("Breakfast"));


        System.out.println("The following bookingId was updated: " + bookingId);
    }

    @Test(priority = 5)
    public void get_updatedBooking() {

        given()
                .baseUri(baseUrl)
                .when()
                .get("/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all();
        System.out.println("Above you can see the Updated Booking");


    }


    @Test(priority = 6)
    public void partialUpdate_booking() {

        String requestBody = "{" +
                "\"firstname\": \"VladUpdated\"," +
                "\"lastname\": \"TestUpdated\"" +
                "}";

        given()
                .baseUri(baseUrl)
                .headers(headers())
                .body(requestBody)
                .when()
                .patch("/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(200)
                .log().all()
                .body("firstname", equalTo("VladUpdated"))
                .body("lastname", equalTo("TestUpdated"))
                .body("totalprice", equalTo(555))
                .body("depositpaid", equalTo(true))
                .body("bookingdates.checkin", equalTo("2018-01-01"))
                .body("bookingdates.checkout", equalTo("2019-01-01"))
                .body("additionalneeds", equalTo("Breakfast"));
        System.out.println("Above you can see the partially updated bookingId: " + bookingId);
    }

    @Test(priority = 7)
    public void delete_bookingByCookie() {

        given()
                .baseUri(baseUrl)
                .headers(headers())
                .when()
                .delete("/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(201)
                .body(equalTo("Created")) // Hamcrest assertion for response body content
                .log().all();
        System.out.println("The following bookingId was DELETED: " + bookingId);

    }

    @Test(priority = 8)
    public void get_deletedBooking() {

        given()
                .baseUri(baseUrl)
                .when()
                .get("/booking/" + bookingId)
                .then()
                .assertThat()
                .statusCode(404)
                .body(equalTo("Not Found"))
                .log().all();
        System.out.println("Deleted bookingId can no longer be found");


    }

}
