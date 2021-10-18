package co.oplo.healthCheck;

import co.oplo.utils.PropertyReader;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.List;

import static co.oplo.healthCheck.RequestBodyParam.*;

public class HealthCheckMethod {

    @Steps
    HealthCheckSteps healthCheckSteps;

    @Step
    public ValidatableResponse getAccessToken(String apiRealm,String clientId,String clientSecret,
                                              String grantType){
        RestAssured.baseURI= PropertyReader.getInstance().getProperty("auth.Url");
        return healthCheckSteps.getAuthToken(apiRealm,clientId,clientSecret,grantType);
    }

    @Step
    public ValidatableResponse checkAuthStatus(String accessToken){

        RestAssured.baseURI=PropertyReader.getInstance().getProperty("broker.Url");
        return healthCheckSteps.checkAuthStatus(accessToken);
    }

    @Step
    public ValidatableResponse dipCaseCheck(String accessToken,){

        RestAssured.baseURI=PropertyReader.getInstance().getProperty("broker.Url");

        Asset asset=getAsset();
        Address currentAddress=getAddress();
        Address preAddress=getAddress();
        List<Address> addressList=new ArrayList<>();
        addressList.add(currentAddress);
        addressList.add(preAddress);
        Employment employment=getEmployment();
        List<Employment> employmentList=new ArrayList<>();
        employmentList.add(employment);
        Customer customer=getCustomer();

        List<Customer> customerList=new ArrayList<>();
        customerList.add(customer);

        HealthCheckApiRequest healthCheckApiRequest=getRequestBody(,customerList,asset);

        return healthCheckSteps.dipRequest(accessToken,healthCheckApiRequest);
    }
}
