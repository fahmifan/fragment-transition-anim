package com.example.asuspc.fragmentapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BEFragment extends android.app.Fragment {

    String[] listBE={
        "BE 1","BE 2", "BE 3",
        "BE 1","BE 2", "BE 3",
        "BE 1","BE 2", "BE 3",
        "BE 1","BE 2", "BE 3",
        "BE 1","BE 2", "BE 3"
    };

    public BEFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_be, container, false);
        ListView lv = (ListView) view.findViewById(R.id.list_be);
        lv.setAdapter(new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, listBE));

        return view;
    }

}
