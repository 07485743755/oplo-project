package co.oplo.healthCheck;

import co.oplo.constant.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class HealthCheckSteps {

    @Step("Create Access Token with apiRealm: {0}, clientId :{1}, clientSecret:{2}, grantType:{3}")
    public ValidatableResponse getAuthToken(String apiRealm,String clientId,String clientSecret,
                                            String grantType){

        return SerenityRest.rest()
                .given().log().all()
                .contentType("application/x-www-form-urlencoded")
                .pathParam("apiRealm",apiRealm)
                .formParam("client_id",clientId)
                .formParam("client_secret",clientSecret)
                .formParam("grant_type",grantType)
                .when()
                .post(EndPoints.AUTH)
                .then().log().all();


    }

    @Step("")
    public ValidatableResponse checkAuthStatus(String authToken){

        return SerenityRest.rest()
                .given().log().all()
                .contentType("application/json")
                .header("Authorization","Bearer "+authToken)
                .when()
                .get(EndPoints.AUTH_STATUS)
                .then().log().all();

    }

    @Step("")
    public ValidatableResponse dipRequest(String authToken,HealthCheckApiRequest healthCheckApiRequest){

        return SerenityRest.rest()
                .given().log().all()
                .contentType("application/json")
                .header("Authorization","Bearer "+authToken)
                .when()
                .body(healthCheckApiRequest)
                .post(EndPoints.DIP_CASE)
                .then().log().all();

    }
}
