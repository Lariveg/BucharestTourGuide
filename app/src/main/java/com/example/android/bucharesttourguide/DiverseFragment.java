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
public class DiverseFragment extends Fragment {

    public DiverseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Triumph Arch", "intersection of Șoseaua Kiseleff with Constantin Prezan, Alexandru Averescu și Alexandru Constantinescu bulevards", R.drawable.arcul_de_triumf));
        places.add(new Place("Biserica Stavropoleos", "Strada Stavropoleos 4", R.drawable.biserica_stravrapoleos));
        places.add(new Place("Patriarchal Cathedral", "Aleea Dealul Mitropoliei 2", R.drawable.catedrala_patriarhala));
        places.add(new Place("Mănăstirea Radu Vodă", "Strada Radu Vodă 24", R.drawable.manastirea_radu_voda));
        places.add(new Place("Romanian Athenaeum", "Strada Benjamin Franklin 1", R.drawable.ateneul_roman));
        places.add(new Place("Opera Națională", "Bd. Mihail Kogălniceanu 70-72", R.drawable.opera));
        places.add(new Place("Curtea Veche", "Strada Franceză 25", R.drawable.curtea_veche));
        places.add(new Place("Cercul Militar National", "Strada Constantin Mile 1", R.drawable.cercul_militar_national));
        places.add(new Place("Casa de Economii si Consemnatiuni", "Calea Victoriei 13", R.drawable.casa_de_economii));
        places.add(new Place("Palatul Parlamentului", "Strada Izvor 2-4", R.drawable.palatul_parlamentului));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.diverse_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
