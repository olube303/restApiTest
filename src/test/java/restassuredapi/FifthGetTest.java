package restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class FifthGetTest {

    @Test
    public void fifthTest(){

        given().
                header("Content-Type", "application/json" ).
                get("http://bpdts-test-app-v2.herokuapp.com/user/2000").
                then()
                .statusCode(404).
                log().all();

    }
}
