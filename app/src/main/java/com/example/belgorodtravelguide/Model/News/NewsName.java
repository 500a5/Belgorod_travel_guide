package com.example.belgorodtravelguide.Model.News;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.News.InterfaceNews;

public class NewsName implements InterfaceNews.NewsName {
    static String[] adress = new String[]{"https://www.google.ru/","https://www.google.ru/","https://www.google.ru/","https://www.google.ru/","https://www.google.ru/"};
    static String[] head = new String[]{"Елка","Награждение","Выборы мера","Засеание по плану развития грода",
    "9 мая"};
    static String[] body = new String[]{"В 2020 году построили ноувую елку","По итогам квартала были нграждены" +
            " лучшие работники",
    "В городе Белгороде, граждане выбрали нового мера","12 марта прошли заседания по плану развтьтя говрода были " +
            "обсуждены выпроы построительству новых школ, садо и дорог",
    " 9 мая администрация города возложила цветы к памятнику вечного огня"};
    static int[] idImage = new  int[]{R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5};

    public String getAdress(int pos){
        return adress[pos];
    }

    public String getHead(int pos){
        return head[pos];
    }

    public String getBody(int pos){
        return body[pos];
    }

    public int getImage(int pos){
        return idImage[pos];
    }
    public int getImageCount() {
        return idImage.length;
    }

    public int getAdressCount(){return  adress.length;}

    public int getHeadCount(){return  head.length;}

    public int getBodyCount(){return  body.length;}
}
