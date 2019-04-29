package com.sparta.vk.Starter;

import com.sparta.vk.CryptoManager.PrintRates;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        PrintRates printRates = new PrintRates();
        printRates.printAllLiveRates();
        printRates.printLiveRate("ETH");

        printRates.printHistoricalRate("2018-04-30", "ETH");
        printRates.printAllHistoricalRates("2018-04-30");
    }
}
