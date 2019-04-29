package com.sparta.vk.CryptoManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.vk.CryptoManager.CryptoDTO;

public class CryptoDeserialiser {

    public CryptoDTO cryptoMappedDTO;

    public CryptoDeserialiser(String filePath){
        ObjectMapper cryptoObject = new ObjectMapper();

        try{
            cryptoMappedDTO = cryptoObject.readValue(filePath, CryptoDTO.class);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
