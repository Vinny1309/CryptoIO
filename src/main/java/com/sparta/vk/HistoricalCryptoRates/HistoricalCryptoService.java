package com.sparta.vk.HistoricalCryptoRates;

import com.sparta.vk.CryptoManager.CryptoDeserialiser;
import com.sparta.vk.CryptoManager.HTTPManager;

public class HistoricalCryptoService {
    private CryptoDeserialiser cryptoDeserialiser;

    public void HistoricRatesService(String date){
        HTTPManager historicalRatesHTTPManager = new HTTPManager();
        historicalRatesHTTPManager.makeAllHistoricalRatesCall(date);
        cryptoDeserialiser = new CryptoDeserialiser(historicalRatesHTTPManager.getResponseBody());
    }

    public CryptoDeserialiser getCryptoDeserialiser(){
        return cryptoDeserialiser;
    }

}
