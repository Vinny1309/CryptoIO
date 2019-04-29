package com.sparta.vk.CryptoManager;

import com.sparta.vk.HistoricalCryptoRates.HistoricalCryptoService;
import com.sparta.vk.LiveCryptoRates.LiveCryptoService;

public class PrintRates {

    public void printAllLiveRates(){
        LiveCryptoService liveCryptoService = new LiveCryptoService();
        liveCryptoService.CryptoService();
        System.out.println(liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getRates());
    }

    public void printLiveRate(String cryptocurrency){
        LiveCryptoService liveCryptoService = new LiveCryptoService();
        liveCryptoService.CryptoService();
        System.out.println(liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getRate(cryptocurrency));
    }

    public void printHistoricalRate(String date, String cryptocurrency) {
        HistoricalCryptoService historicalRates = new HistoricalCryptoService();
        historicalRates.HistoricRatesService(date);
        System.out.println(historicalRates.getCryptoDeserialiser().cryptoMappedDTO.getRate(cryptocurrency));
    }

    public void printAllHistoricalRates(String date) {
        HistoricalCryptoService historicalRates = new HistoricalCryptoService();
        historicalRates.HistoricRatesService(date);
        System.out.println(historicalRates.getCryptoDeserialiser().cryptoMappedDTO.getRates());
    }
}
