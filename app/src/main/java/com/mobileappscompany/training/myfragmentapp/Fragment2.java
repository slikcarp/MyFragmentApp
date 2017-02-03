package com.mobileappscompany.training.myfragmentapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment implements Fragment2Interface {

    private TextView textView;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        textView = (TextView) view.findViewById(R.id.textViewF2);

        return view;
    }

    @Override
    public void setTheText(String text) {
        textView.setText(text);
    }
}
