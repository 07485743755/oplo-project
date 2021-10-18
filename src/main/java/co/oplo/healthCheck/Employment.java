package co.oplo.healthCheck;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employment {


    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("county")
    @Expose
    private String county;
    @SerializedName("employer")
    @Expose
    private String employer;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("payType")
    @Expose
    private String payType;
    @SerializedName("payDay")
    @Expose
    private String payDay;
    @SerializedName("netMonthlyIncome")
    @Expose
    private Integer netMonthlyIncome;
    @SerializedName("industry")
    @Expose
    private String industry;
    @SerializedName("startedAtDate")
    @Expose
    private String startedAtDate;
    @SerializedName("finishedAtDate")
    @Expose
    private Object finishedAtDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayDay() {
        return payDay;
    }

    public void setPayDay(String payDay) {
        this.payDay = payDay;
    }

    public Integer getNetMonthlyIncome() {
        return netMonthlyIncome;
    }

    public void setNetMonthlyIncome(Integer netMonthlyIncome) {
        this.netMonthlyIncome = netMonthlyIncome;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getStartedAtDate() {
        return startedAtDate;
    }

    public void setStartedAtDate(String startedAtDate) {
        this.startedAtDate = startedAtDate;
    }

    public Object getFinishedAtDate() {
        return finishedAtDate;
    }

    public void setFinishedAtDate(Object finishedAtDate) {
        this.finishedAtDate = finishedAtDate;
    }
}
