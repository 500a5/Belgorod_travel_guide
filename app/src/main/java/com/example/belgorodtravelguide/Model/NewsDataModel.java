package com.example.belgorodtravelguide.Model;

public class NewsDataModel {
    int image;
    String header, body;

    public NewsDataModel(int image, String header, String body) {
        this.image = image;
        this.header = header;
        this.body = body;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
