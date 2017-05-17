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
        places.add(new Place("Cișmigiu Garden", "Bulevardul Schitu Măgureanu", R.drawable.cismigiu));
        places.add(new Place("Herăstrău Park", "Piaţa Charles De Gaulle", R.drawable.herastrau));
        places.add(new Place("Kiseleff", "Șoseaua Kiseleff", R.drawable.parcul_kiseleff));
        places.add(new Place("Tineretului", "bd. Dimitrie Cantemir (metrou Tineretului)", R.drawable.tineretului));
        places.add(new Place("Parcul Carol I", "Calea Şerban Vodă", R.drawable.parcul_carol));
        places.add(new Place("Moghioroș", "Drumul Taberei", R.drawable.moghioros));
        places.add(new Place("Parcul Circul de Stat", "Aleea Circului", R.drawable.circului));
        places.add(new Place("Ior", "Strada Liviu Rebreanu", R.drawable.ior));
        places.add(new Place("Parcul National", "Bulevardul Basarabia", R.drawable.parcul_national));
        places.add(new Place("Parcul Eroilor Sanitari", "Bulevardul Eroii Sanitari", R.drawable.eroilor));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.parks_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
