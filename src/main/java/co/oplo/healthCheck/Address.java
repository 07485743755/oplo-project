package co.oplo.healthCheck;

import com.google.gson.annotations.SerializedName;
import gherkin.deps.com.google.gson.annotations.Expose;

public class Address {


    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("line1")
    @Expose
    private String line1;
    @SerializedName("line2")
    @Expose
    private String line2;
    @SerializedName("line3")
    @Expose
    private String line3;
    @SerializedName("town")
    @Expose
    private String town;
    @SerializedName("county")
    @Expose
    private String county;
    @SerializedName("postcode")
    @Expose
    private String postcode;
    @SerializedName("movedIn")
    @Expose
    private String movedIn;
    @SerializedName("movedOut")
    @Expose
    private String movedOut;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getMovedIn() {
        return movedIn;
    }

    public void setMovedIn(String movedIn) {
        this.movedIn = movedIn;
    }

    public String getMovedOut() {
        return movedOut;
    }

    public void setMovedOut(String movedOut) {
        this.movedOut = movedOut;
    }

}
