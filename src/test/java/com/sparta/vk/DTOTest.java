package com.sparta.vk;

import com.sparta.vk.CryptoManager.CryptoDTO;
import com.sparta.vk.CryptoManager.CryptoDeserialiser;
import com.sparta.vk.HistoricalCryptoRates.HistoricalCryptoService;
import com.sparta.vk.LiveCryptoRates.LiveCryptoService;
import org.junit.Assert;
import org.junit.Test;

public class DTOTest {

    private LiveCryptoService liveCryptoService = new LiveCryptoService();
    private HistoricalCryptoService historicalCryptoService = new HistoricalCryptoService();

    @Test
    public void testLiveSuccess(){
        liveCryptoService.CryptoService();
        boolean isSuccess = liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.isSuccess();
        Assert.assertTrue(isSuccess);
    }

    @Test
    public void testLiveTerms(){
        liveCryptoService.CryptoService();
        String getTerms = liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getTerms();
        Assert.assertEquals(getTerms, "https://coinlayer.com/terms");
    }

    @Test
    public void testLivePrivacy(){
        liveCryptoService.CryptoService();
        String getPrivacy = liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getPrivacy();
        Assert.assertEquals(getPrivacy, "https://coinlayer.com/privacy");
    }

    @Test
    public void testLiveTimestamp(){
        liveCryptoService.CryptoService();
        long getTimestamp = liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getTimestamp();
        Assert.assertEquals(getTimestamp, 1556527209);
    }

    @Test
    public void testLiveTarget(){
        liveCryptoService.CryptoService();
        String getTarget = liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getTarget();
        Assert.assertEquals(getTarget, "USD");
    }

    @Test
    public void testLiveRates(){
        liveCryptoService.CryptoService();
        double getRates = liveCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getRate("BTC");
        Assert.assertEquals(getRates, 5288.569165, 0);
    }

    //Historical Rates Test

    @Test
    public void testHistoricalSuccess(){
        historicalCryptoService.HistoricRatesService("2018-04-30");
        boolean isSuccess = historicalCryptoService.getCryptoDeserialiser().cryptoMappedDTO.isSuccess();
        Assert.assertTrue(isSuccess);
    }

    @Test
    public void testHistoricalTerms(){
        historicalCryptoService.HistoricRatesService("2018-04-30");
        String getTerms = historicalCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getTerms();
        Assert.assertEquals(getTerms, "https://coinlayer.com/terms");
    }

    @Test
    public void testHistoricalPrivacy(){
        historicalCryptoService.HistoricRatesService("2018-04-30");
        String getPrivacy = historicalCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getPrivacy();
        Assert.assertEquals(getPrivacy, "https://coinlayer.com/privacy");
    }

    @Test
    public void testHistoricalTimestamp(){
        historicalCryptoService.HistoricRatesService("2018-04-30");
        long getTimestamp = historicalCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getTimestamp();
        Assert.assertEquals(getTimestamp, 1525132744);
    }

    @Test
    public void testHistoricalTarget(){
        historicalCryptoService.HistoricRatesService("2018-04-30");
        String getTarget = historicalCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getTarget();
        Assert.assertEquals(getTarget, "USD");
    }

    @Test
    public void testHistoricalRates(){
        historicalCryptoService.HistoricRatesService("2018-04-30");
        double getRates = historicalCryptoService.getCryptoDeserialiser().cryptoMappedDTO.getRate("BTC");
        Assert.assertEquals(getRates, 9245.982724, 0);
    }

}
