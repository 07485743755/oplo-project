package co.oplo.cucumber.steps;

import co.oplo.healthCheck.HealthCheckMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

public class MyStepdefs {

    @Steps
    HealthCheckMethod healthCheckMethod;

    static ValidatableResponse response=null;
    static String accessToken=null;


    @Then("^User should get access token$")
    public void userShouldGetAccessToken() {
        response.statusCode(200).log().all();
    }

    @When("^User select env \"([^\"]*)\" and enter clientId \"([^\"]*)\" clientSecret \"([^\"]*)\" and grantType \"([^\"]*)\"$")
    public void userSelectEnvAndEnterClientIdClientSecretAndGrantType(String env, String clientId, String clientSecret, String grantType){

        response=healthCheckMethod.getAccessToken(env,clientId,clientSecret,grantType);
        accessToken=response.extract().path("access_token");
        System.out.println(accessToken);

    }

    @And("^Send request to broker with access token$")
    public void sendRequestToBrokerWithAccessToken() {

        response=healthCheckMethod.checkAuthStatus(accessToken);
    }

    @Then("^Token is validate$")
    public void tokenIsValidate() {

        response.statusCode(200).log().all();
    }
}
