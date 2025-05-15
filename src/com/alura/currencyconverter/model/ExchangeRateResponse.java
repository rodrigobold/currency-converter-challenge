package com.alura.currencyconverter.model;

// Classe que representa a resposta da API com a taxa de conversão
public class ExchangeRateResponse {
    private double conversion_rate;

    // Getter para obter a taxa de conversão
    public double getConversion_rate() {
        return conversion_rate;
    }

    // Setter (pode ser opcional, dependendo do uso)
    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }
}
