package com.example.belgorodtravelguide.ViewModel.UserProfile;

import com.example.belgorodtravelguide.Model.UserProfile.UserName;
import com.example.belgorodtravelguide.View.UserProfile.InterfaceUser;
import com.example.belgorodtravelguide.View.UserProfile.UserProfileFragment;

public class ViewModelUser implements InterfaceUser.ViewModelUser {

    private UserProfileFragment view;
    private UserName userName = new UserName();
    public ViewModelUser(UserProfileFragment view) {
        this.view = view;
    }

    @Override
    public String getName() {
        return userName.getName();
    }

    @Override
    public String getInfo() {
        return userName.getInfo();
    }

    @Override
    public String getBirthday() {
        return userName.getbirthday();
    }

    @Override
    public String getCity() {
        return userName.getcity();
    }

    @Override
    public String getStatus() {
        return userName.getStatus();
    }

    @Override
    public String getPhone() {
        return userName.getPhone();
    }

    @Override
    public String getInst() {
        return userName.getInst();
    }

    @Override
    public String getVk() {
        return userName.getVk();
    }

    @Override
    public int getImage() {
        return userName.getImage();
    }
}
