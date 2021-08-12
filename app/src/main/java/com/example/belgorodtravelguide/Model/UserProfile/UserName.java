package com.example.belgorodtravelguide.Model.UserProfile;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.UserProfile.InterfaceUser;

public class UserName implements InterfaceUser.UserName {
    static String name = "Воскобойников Илья";
    static String info = "Закончил 3 курс в БГТУ им. В. Г. Шухова по направлению Информатика и вычислительна техника";
    static String birthday = "26 августа 2000 (20 лет)";
    static String city = "Белгород, Россия";
    static String status = "Практикант, стажер";
    static String phone = "+79606277700";
    static String vk = "https://vk.com/ilya_500a5";
    static String inst = "https://www.instagram.com/500a5/";
    static int image = R.drawable.me;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public String getbirthday() {
        return birthday;
    }

    @Override
    public String getcity() {
        return city;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getInst() {
        return inst;
    }

    @Override
    public String getVk() {
        return vk;
    }

    @Override
    public int getImage() {
        return image;
    }
}
