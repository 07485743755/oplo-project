package co.oplo.rough;

import co.oplo.healthCheck.HealthCheckMethod;
import co.oplo.testBase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class AuthTest extends TestBase {

    @Steps
    HealthCheckMethod healthCheckMethod;

    @Test
    public void getAccessToken(){

        ValidatableResponse response=healthCheckMethod.getAccessToken("api-sit","postman","38a9d0c1-46b3-4b14-9f06-86a7da7eebb6",
                "client_credentials");
        String accessToken = response.extract().path("access_token");
        ValidatableResponse response1 = healthCheckMethod.checkAuthStatus(accessToken);
        response1.statusCode(200).log().all();
    }
}
