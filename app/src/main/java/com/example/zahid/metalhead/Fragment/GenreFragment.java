package com.example.zahid.metalhead.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zahid.metalhead.R;

/**
 * Created by ZAHID on 11/6/2015.
 */
public class GenreFragment extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.genre_layout,
                container, false);
        return myView;
    }
}
