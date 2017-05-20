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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.manuc), getString(R.string.manuc_address), R.drawable.hanu_manuc));
        places.add(new Place(getString(R.string.caru_cu_bere), getString(R.string.caru_cu_bere_address), R.drawable.caru_cu_bere));
        places.add(new Place(getString(R.string.carusel), getString(R.string.carusel_address), R.drawable.carusel));
        places.add(new Place(getString(R.string.lacrimi_si_sfinti), getString(R.string.lacrimi_si_sfinti_address), R.drawable.lacrimi_si_sfinti));
        places.add(new Place(getString(R.string.zahana), getString(R.string.zahana_address), R.drawable.zahana));
        places.add(new Place(getString(R.string.energiea), getString(R.string.energiea_address), R.drawable.energiea));
        places.add(new Place(getString(R.string.the_artist), getString(R.string.the_artist_address), R.drawable.the_artist));
        places.add(new Place(getString(R.string.origo), getString(R.string.origo_address), R.drawable.origo));
        places.add(new Place(getString(R.string.cremeria_emilia), getString(R.string.cremeria_emilia_address), R.drawable.cremeria_emilia));
        places.add(new Place(getString(R.string.shift), getString(R.string.shift_address), R.drawable.shift));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.restaurants_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
