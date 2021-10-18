package co.oplo.healthCheck;

import com.google.gson.annotations.Expose;
import gherkin.deps.com.google.gson.annotations.SerializedName;

public class Asset {


    @SerializedName("registration")
    @Expose
    private String registration;
    @SerializedName("mileage")
    @Expose
    private Integer mileage;
    @SerializedName("purchasePrice")
    @Expose
    private Integer purchasePrice;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

}
