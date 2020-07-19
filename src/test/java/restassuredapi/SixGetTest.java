package restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SixGetTest {

    @Test
    public void sixTest(){

        given().
                header("Content-Type", "application/json" ).
                get("http://bpdts-test-app-v2.herokuapp.com/users").
                then()
                .statusCode(200).
                log().all();


    }
}
