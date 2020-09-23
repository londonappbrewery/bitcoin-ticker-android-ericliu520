package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModule {
    private String mCurrency;
    private double mPrice;

    public static BitcoinDataModule fromJSON(JSONObject jsonObject)
    {
        try {
            BitcoinDataModule myBitcoinDataModule = new BitcoinDataModule();
            myBitcoinDataModule.mPrice = jsonObject.getJSONObject("data").getDouble("amount");
            return  myBitcoinDataModule;
        }
        catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

}
