package com.example.belgorodtravelguide.Model.Entertainments.ShopingCenter;

public class ShopingCenterDataModel {
    int image;
    String header;

    public ShopingCenterDataModel(int image, String header) {
        this.image = image;
        this.header = header;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }


}
