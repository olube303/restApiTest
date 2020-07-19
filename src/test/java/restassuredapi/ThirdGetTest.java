package restassuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class ThirdGetTest {

    @Test
    public void thirdTest(){

        given().
                header("Content-Type", "application/json" ).
                get("http://bpdts-test-app-v2.herokuapp.com/user/150").
                then()
                .statusCode(200).
                log().all();

    }
}
