package com.example.comp1011assignment21199455.api;
import com.example.comp1011assignment21199455.model.Inflation;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class APIUtility {
    public static Inflation[] callAPI(String countryName) throws IOException, InterruptedException {
        countryName = countryName.replaceAll(" ","%20");

        //this is the search String that we used in the browser
        String uri = "https://api.api-ninjas.com/v1/inflation?country="+countryName;

        //configure the environment to make an HTTP request (this includes an update to
        //the module-info.java file
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri))
                .header("X-Api-Key", "/ouO7p3d2HTL6+QEO9HlnA==oppdykRBBhv04z1p")
                .build();

        //this will save to a file called movies.json
//        HttpResponse<Path> httpResponse = client.send(httpRequest, HttpResponse
//                                                    .BodyHandlers
//                                                    .ofFile(Paths.get("countries.json")));

        //this will save the json to a HttpResponse object
        HttpResponse<String> response = client.send(httpRequest, HttpResponse
                .BodyHandlers.ofString());
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Inflation[].class);
    }
}
