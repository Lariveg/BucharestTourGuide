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
        places.add(new Place("Hanu’ lui Manuc", "Strada Franceză 62-64", R.drawable.hanu_manuc));
        places.add(new Place("Caru’ Cu Bere", "Strada Stavropoleos 5", R.drawable.caru_cu_bere));
        places.add(new Place("Bistro Carusel", "Strada Lipscani 55", R.drawable.carusel));
        places.add(new Place("Lacrimi și Sfinți", "Strada Sepcari 16", R.drawable.lacrimi_si_sfinti));
        places.add(new Place("Zahana 33", "Splaiul Unirii 162 (Palatul Odeon)", R.drawable.zahana));
        places.add(new Place("Energiea", "Strada Brezoianu 4", R.drawable.energiea));
        places.add(new Place("The Artist", "Calea Victoriei 147", R.drawable.the_artist));
        places.add(new Place("Origo", "Strada Lipscani 9", R.drawable.origo));
        places.add(new Place("Cremeria Emilia", "Strada Franceză 38-42 (Centrul Vechi)", R.drawable.cremeria_emilia));
        places.add(new Place("Restaurant Cafe Shift", "Strada Eremia Grigorescu 17", R.drawable.shift));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.restaurants_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
