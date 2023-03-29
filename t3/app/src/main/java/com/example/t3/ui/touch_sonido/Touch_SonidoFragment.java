package com.example.t3.ui.touch_sonido;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.t3.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Touch_SonidoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Touch_SonidoFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_video, container,false);
        return rootView;
    }
}