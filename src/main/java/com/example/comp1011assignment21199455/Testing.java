package com.example.comp1011assignment21199455;

import com.example.comp1011assignment21199455.api.APIUtility;
import com.example.comp1011assignment21199455.model.Inflation;

import java.io.IOException;

public class Testing {

    public static void main(String[] args) throws IOException, InterruptedException {
        Inflation[] inflations = APIUtility.callAPI("Canada");

        for (Inflation inflation: inflations) {
            System.out.println(inflation);
        }
    }
}