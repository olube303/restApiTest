package restassuredapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstGetTest {

  @Test
  public void firstTest() {

      Response response = RestAssured.get("http://bpdts-test-app-v2.herokuapp.com/swagger.json");

      int statusCode = response.getStatusCode();
      Assert.assertEquals(statusCode, 200);


  }
}
