package com.example.belgorodtravelguide.Model.Shop;

public class ShopDataModel {
    int image;
    String  body;
    int prise;

    public ShopDataModel(int image, int prise, String body) {
        this.image = image;
        this.prise = prise;
        this.body = body;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
