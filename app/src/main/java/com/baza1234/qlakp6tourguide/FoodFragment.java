package com.baza1234.qlakp6tourguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Fragment subclass.
 */
public class FoodFragment extends Fragment {

String name;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_of_places, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.rubaru), getString(R.string.rubaru_address), getString(R.string.rubaru_info), getString(R.string.link_rubaru), R.drawable.star_five, R.drawable.rubaru));
        places.add(new Place(getString(R.string.chinska_patelnia), getString(R.string.chinska_patelnia_address), getString(R.string.chinska_patelnia_info), getString(R.string.link_chinska_patelnia), R.drawable.star_four, R.drawable.chp));
        places.add(new Place(getString(R.string.peppermint), getString(R.string.peppermint_address), getString(R.string.peppermint_info), getString(R.string.link_peppermint), R.drawable.star_five, R.drawable.peppermint));
        places.add(new Place(getString(R.string.sphinx), getString(R.string.sphinx_address), getString(R.string.sphinx_info), getString(R.string.link_sphinx), R.drawable.star_two, R.drawable.sphinx));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list_of_places);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Place place = places.get(position);

                Uri gmmIntentUri = Uri.parse(place.getLocation());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
        return rootView;
    }
}
