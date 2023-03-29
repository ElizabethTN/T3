package com.example.t3.ui.dibujo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.t3.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DibujoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DibujoFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_video, container,false);
        return rootView;
    }
}