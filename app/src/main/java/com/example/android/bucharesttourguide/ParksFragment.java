package com.example.android.bucharesttourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    } 

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.cismigiu), getString(R.string.cismigiu_address), R.drawable.cismigiu));
        places.add(new Place(getString(R.string.herastrau), getString(R.string.herastrau_address), R.drawable.herastrau));
        places.add(new Place(getString(R.string.kiseleff), getString(R.string.kiseleff_address), R.drawable.parcul_kiseleff));
        places.add(new Place(getString(R.string.tineretului), getString(R.string.tineretului_address), R.drawable.tineretului));
        places.add(new Place(getString(R.string.carol), getString(R.string.carol_address), R.drawable.parcul_carol));
        places.add(new Place(getString(R.string.moghioros), getString(R.string.moghioros_address), R.drawable.moghioros));
        places.add(new Place(getString(R.string.circului), getString(R.string.circului_address), R.drawable.circului));
        places.add(new Place(getString(R.string.ior), getString(R.string.ior_address), R.drawable.ior));
        places.add(new Place(getString(R.string.parcul_national), getString(R.string.parcul_national_address), R.drawable.parcul_national));
        places.add(new Place(getString(R.string.eroilor), getString(R.string.eroilor_address), R.drawable.eroilor));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.parks_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
