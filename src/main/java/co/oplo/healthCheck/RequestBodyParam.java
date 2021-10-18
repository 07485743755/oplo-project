package co.oplo.healthCheck;

import java.util.List;

public class RequestBodyParam {

    public static HealthCheckApiRequest getRequestBody(String callbackUrl, String product, int advance,
                                                       int term, int deposit, int partExchange,
                                                       List<Customer> customerList, Asset asset) {


        HealthCheckApiRequest healthCheckApiRequest = new HealthCheckApiRequest();

        healthCheckApiRequest.setCallbackUrl(callbackUrl);
        healthCheckApiRequest.setProduct(product);
        healthCheckApiRequest.setAdvance(advance);
        healthCheckApiRequest.setTerm(term);
        healthCheckApiRequest.setDeposit(deposit);
        healthCheckApiRequest.setPartExchange(partExchange);
        healthCheckApiRequest.setCustomers(customerList);
        healthCheckApiRequest.setAsset(asset);

        return healthCheckApiRequest;

    }

    public static Asset getAsset(String registration, int mileage, int purchasePrice) {

        Asset asset = new Asset();
        asset.setRegistration(registration);
        asset.setMileage(mileage);
        asset.setPurchasePrice(purchasePrice);
        return asset;
    }

    public static Address getAddress(String type, String line1){

        Address address=new Address();
        return address;
    }

    public static Employment getEmployment(){

        Employment employment=new Employment();
        return employment;
    }

    public static Customer getCustomer(){

        Customer customer=new Customer();
        return customer;
    }

}
