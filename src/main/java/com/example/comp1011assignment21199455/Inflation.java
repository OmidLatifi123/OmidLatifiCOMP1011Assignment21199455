package com.example.comp1011assignment21199455;
import com.google.gson.annotations.SerializedName;

public class Inflation {
    @SerializedName("country")
private String country;
    @SerializedName("type")
private String type;
    @SerializedName("period")
private String period;
    @SerializedName("monthly_Rate_Pct")
private Double monthlyRatePct;
    @SerializedName("yearly_Rate_Pct")
private Double yearlyRatePct;

    public String getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }

    public String getPeriod() {
        return period;
    }

    public Double getMonthlyRatePct() {
        return monthlyRatePct;
    }

    public Double getYearlyRatePct() {
        return yearlyRatePct;
    }

    @Override
    public String toString()
    {
        return String.format("%s-%d",country,yearlyRatePct);
    }
}
