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
        places.add(new Place("Grigore Antipa Natural History Museum", "Șoseaua Kiseleff Nr.1", R.drawable.muzeul_antipa));
        places.add(new Place("National Art Museum", "Calea Victoriei 49-53", R.drawable.national_art_museum));
        places.add(new Place("Museum of the Romanian Peasant", " Șoseaua Pavel Dimitrievici Kiseleff 3", R.drawable.museum_of_romanian_peasant));
        places.add(new Place("Theodor Aman Museum", "Strada C. A. Rosetti 8", R.drawable.theodor_aman_museum));
        places.add(new Place("National Village Museum", "Bulevardul Kiseleff 28-30", R.drawable.national_village_museum));
        places.add(new Place("National History Museum", "Calea Victoriei 12", R.drawable.national_history_museum));
        places.add(new Place("National Museum of Contemporary Art", "a wing of the Palace of the Parliament", R.drawable.national_museum_of_contemporary_art));
        places.add(new Place("Jewish History Museum", "Str Mămulari 3", R.drawable.jewish_history_museum));
        places.add(new Place("George Enescu Museum", "Calea Victoriei 141", R.drawable.george_enescu));
        places.add(new Place("Theodor Pallady Museum", " Str. Spătarului 22", R.drawable.theodor_pallady));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.museums_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
