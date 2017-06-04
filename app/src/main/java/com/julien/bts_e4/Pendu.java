package com.julien.bts_e4;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pendu extends Fragment {
    Button jeuPendu;
    Button jeuPcc;

    View rootViews;

    public Pendu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootViews = inflater.inflate(R.layout.jeux, container, false);
        game();
        return rootViews;
    }


    public void game() {
        jeuPendu = (Button) rootViews.findViewById(R.id.btn_pendu);
        jeuPcc = (Button) rootViews.findViewById(R.id.btn_shifumi);
        jeuPendu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PenduActivity.class);
                startActivity(intent);
            }
        });
        jeuPcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PccActivity.class);
                startActivity(intent);
            }
        });


    }
}
