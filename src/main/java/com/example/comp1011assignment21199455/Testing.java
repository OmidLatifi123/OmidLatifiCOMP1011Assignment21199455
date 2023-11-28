package com.example.comp1011assignment21199455;

import java.io.IOException;

public class Testing {

    public static void main(String[] args) throws IOException, InterruptedException {
        Inflation[] inflations = APIUtility.callAPI("Canada");

        for (Inflation inflation: inflations) {
            System.out.println(inflation);
        }
    }
}