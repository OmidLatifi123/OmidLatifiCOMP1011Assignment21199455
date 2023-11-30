package com.example.comp1011assignment21199455.api;

import com.example.comp1011assignment21199455.model.Inflation;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class APIResponse {
    private String totalResults;

    @SerializedName("Response")  //The annotation "@SerializedName" allows us to reference what the field is called in the json file
    private String response;

    @SerializedName("Search")
    private ArrayList<Inflation> search;

    public String getTotalResults() {
        return totalResults;
    }

    public String getResponse() {
        return response;
    }

    public ArrayList<Inflation> getCountries() {
        return search;
    }
}
