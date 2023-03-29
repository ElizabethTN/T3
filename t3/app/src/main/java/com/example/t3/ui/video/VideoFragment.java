package com.example.t3.ui.video;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.t3.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_video, container,false);

        VideoView vd;

        vd = rootView.findViewById(R.id.videoView);

        vd.setMediaController(new MediaController(getContext()));

        String loc = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.video;
        vd.setVideoURI(Uri.parse(loc));
        vd.start();

        return rootView;
    }
}