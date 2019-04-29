package com.sparta.vk.CryptoManager;

import java.util.Map;

public class CryptoDTO {
    private boolean success;
    private String terms;
    private String privacy;
    private long timestamp;
    private String target;
    private boolean historical;
    private String date;
    private Map<String, Double> rates;


    public String getDate(){
        return date;
    }

    public  boolean isHistorical(){
        return historical;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getTerms() {
        return terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getTarget() {
        return target;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public double getRate(String rateKey) {
        return rates.get(rateKey);
    }
}
