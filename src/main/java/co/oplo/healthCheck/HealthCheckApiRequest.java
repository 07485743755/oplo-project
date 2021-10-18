package co.oplo.healthCheck;

import com.google.gson.annotations.Expose;
import gherkin.deps.com.google.gson.annotations.SerializedName;

import java.util.List;

public class HealthCheckApiRequest {


    @SerializedName("callbackUrl")
    @Expose
    private String callbackUrl;
    @SerializedName("product")
    @Expose
    private String product;
    @SerializedName("advance")
    @Expose
    private Integer advance;
    @SerializedName("term")
    @Expose
    private Integer term;
    @SerializedName("deposit")
    @Expose
    private Integer deposit;
    @SerializedName("partExchange")
    @Expose
    private Integer partExchange;
    @SerializedName("customers")
    @Expose
    private List<Customer> customers = null;
    @SerializedName("asset")
    @Expose
    private Asset asset;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getAdvance() {
        return advance;
    }

    public void setAdvance(Integer advance) {
        this.advance = advance;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getPartExchange() {
        return partExchange;
    }

    public void setPartExchange(Integer partExchange) {
        this.partExchange = partExchange;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

}
