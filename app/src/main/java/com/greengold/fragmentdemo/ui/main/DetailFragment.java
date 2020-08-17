package com.greengold.fragmentdemo.ui.main;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greengold.fragmentdemo.R;

public class DetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rssitem_detail,
                container, false);
        return view;
    }

    public void setText(String text) {
        TextView view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(text);
    }
}
