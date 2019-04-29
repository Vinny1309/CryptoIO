package com.sparta.vk.LiveCryptoRates;

import com.sparta.vk.CryptoManager.CryptoDeserialiser;
import com.sparta.vk.CryptoManager.HTTPManager;

public class LiveCryptoService {

    private CryptoDeserialiser cryptoDeserialiser;

    public void CryptoService(){
        HTTPManager liveCryptoHTTPManager = new HTTPManager();
        liveCryptoHTTPManager.makeAllCryptoCall();
        cryptoDeserialiser = new CryptoDeserialiser(liveCryptoHTTPManager.getResponseBody());
    }

    public CryptoDeserialiser getCryptoDeserialiser(){
        return cryptoDeserialiser;
    }
}
