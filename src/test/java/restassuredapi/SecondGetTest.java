package restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SecondGetTest {

    @Test
    public void secondTest(){

         given()
                 .get("http://bpdts-test-app-v2.herokuapp.com/city/London/users")
                 .then()
                 .statusCode(200).
                 log().all();



    }

}
