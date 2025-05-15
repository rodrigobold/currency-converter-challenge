package com.alura.currencyconverter.service;

import com.alura.currencyconverter.config.ConfigLoader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {

    private final String apiKey;
    private final HttpClient client = HttpClient.newHttpClient();

    public ExchangeRateService() {
        ConfigLoader configLoader = new ConfigLoader();
        this.apiKey = configLoader.getApiKey();
    }

    public String getRate(String baseCurrency, String targetCurrency) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + baseCurrency + "/" + targetCurrency;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
