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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.antipa), getString(R.string.antipa_address), R.drawable.muzeul_antipa));
        places.add(new Place(getString(R.string.national_art_museum), getString(R.string.national_art_museum_address), R.drawable.national_art_museum));
        places.add(new Place(getString(R.string.museum_of_romanian_peasant), getString(R.string.museum_of_romanian_peasant_address), R.drawable.museum_of_romanian_peasant));
        places.add(new Place(getString(R.string.theodor_aman), getString(R.string.theodor_aman_address), R.drawable.theodor_aman_museum));
        places.add(new Place(getString(R.string.national_village_museum), getString(R.string.national_village_museum_address), R.drawable.national_village_museum));
        places.add(new Place(getString(R.string.national_history_museum), getString(R.string.national_history_museum_address), R.drawable.national_history_museum));
        places.add(new Place(getString(R.string.contemporary_art_museum), getString(R.string.contemporary_art_museum_address), R.drawable.national_museum_of_contemporary_art));
        places.add(new Place(getString(R.string.jewish_museum), getString(R.string.jewish_museum_address), R.drawable.jewish_history_museum));
        places.add(new Place(getString(R.string.george_enescu), getString(R.string.george_enescu_address), R.drawable.george_enescu));
        places.add(new Place(getString(R.string.theodor_pallady), getString(R.string.theodor_pallady_address), R.drawable.theodor_pallady));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.museums_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
