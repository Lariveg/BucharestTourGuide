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
        places.add(new Place(getString(R.string.arcul_de_triumf), getString(R.string.arcul_de_triumf_address), R.drawable.arcul_de_triumf));
        places.add(new Place(getString(R.string.biserica_stavropoleos), getString(R.string.biserica_stavropoleos_address), R.drawable.biserica_stravrapoleos));
        places.add(new Place(getString(R.string.patriarchal_cathedral), getString(R.string.patriarchal_cathedral_address), R.drawable.catedrala_patriarhala));
        places.add(new Place(getString(R.string.radu_voda),getString(R.string.radu_voda_address), R.drawable.manastirea_radu_voda));
        places.add(new Place(getString(R.string.ateneul_roman), getString(R.string.ateneul_roman_address), R.drawable.ateneul_roman));
        places.add(new Place(getString(R.string.opera_nationala), getString(R.string.opera_nationala_address), R.drawable.opera));
        places.add(new Place(getString(R.string.curtea_veche), getString(R.string.curtea_veche_address), R.drawable.curtea_veche));
        places.add(new Place(getString(R.string.cercul_militar_national), getString(R.string.cercul_militar_national_address), R.drawable.cercul_militar_national));
        places.add(new Place(getString(R.string.casa_de_economii), getString(R.string.casa_de_economii_address), R.drawable.casa_de_economii));
        places.add(new Place(getString(R.string.palatul_parlamentului), getString(R.string.palatul_parlamentului_address), R.drawable.palatul_parlamentului));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.diverse_background);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
