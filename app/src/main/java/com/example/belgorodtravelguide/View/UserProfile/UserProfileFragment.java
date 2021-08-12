package com.example.belgorodtravelguide.View.UserProfile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.MainActivity;
import com.example.belgorodtravelguide.ViewModel.UserProfile.ViewModelUser;
import com.example.belgorodtravelguide.databinding.FragmentUserProileBinding;


public class UserProfileFragment extends Fragment {

    Context context;
    private ViewModelUser viewModelUser;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModelUser = new ViewModelUser(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();
        FragmentUserProileBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_user_proile, container, false);
        View view = binding.getRoot();

        ImageButton buttonvk,buttoninst;
        TextView point = binding.point;
        point.setText(Integer.toString(MainActivity.getpoint()));
        binding.setName(viewModelUser.getName());
        binding.setBirthday(viewModelUser.getBirthday());
        binding.setInfo(viewModelUser.getInfo());
        binding.setBirthday(viewModelUser.getBirthday());
        binding.setCity(viewModelUser.getCity());
        binding.setStatus(viewModelUser.getStatus());
        binding.setPhone(viewModelUser.getPhone());
        binding.setInst(viewModelUser.getInst());
        binding.setVk(viewModelUser.getVk());
        binding.setImage(viewModelUser.getImage());
        buttonvk = binding.vk;
        buttoninst = binding.inst;
        buttonvk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri address = Uri.parse(viewModelUser.getVk());
                Intent intent = new Intent(Intent.ACTION_VIEW, address);
                context.startActivity(intent);
            }
        });

        buttoninst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address = Uri.parse(viewModelUser.getInst());
                Intent intent = new Intent(Intent.ACTION_VIEW, address);
                context.startActivity(intent);
            }
        });

        return view;
    }


}