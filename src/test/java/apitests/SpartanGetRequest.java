package apitests;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpartanGetRequest {

    String spartanurl = "http://3.81.99.109:8000";

    @Test
    public void test1(){

        Response response = given().accept(ContentType.JSON).and()
                .auth().basic("admin","admin")
                .when().get(spartanurl + "/api/spartans");

        System.out.println(response.statusCode());

        response.prettyPrint();

    }

       /*
        When users sends a get request to /api/spartans/3
        Then status code should be 200
        And content type should be application/json;charset=UFT-8
        and json body should contain Fidole
     */
}
