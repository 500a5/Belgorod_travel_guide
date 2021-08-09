package com.example.belgorodtravelguide.View.UserProfile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.belgorodtravelguide.R;
import com.example.belgorodtravelguide.View.MainActivity;


public class UserProfileFragment extends Fragment {

    Context context;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();
        View view =  inflater.inflate(R.layout.fragment_user_proile, container, false);
        ImageButton buttonvk,buttoninst;
        TextView point = view.findViewById(R.id.point);
        point.setText(Integer.toString(MainActivity.getpoint()));
        buttonvk = (ImageButton) view.findViewById(R.id.vk);
        buttoninst = (ImageButton) view.findViewById(R.id.inst);
        buttonvk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address = Uri.parse("https://vk.com/ilya_500a5");
                Intent intent = new Intent(Intent.ACTION_VIEW, address);
                context.startActivity(intent);
            }
        });

        buttoninst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address = Uri.parse("https://www.instagram.com/500a5/");
                Intent intent = new Intent(Intent.ACTION_VIEW, address);
                context.startActivity(intent);
            }
        });

        return view;
    }


}