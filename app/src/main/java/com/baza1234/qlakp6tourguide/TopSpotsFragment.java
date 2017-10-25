package com.baza1234.qlakp6tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Fragment subclass.
 */
public class TopSpotsFragment extends Fragment {

    public TopSpotsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_of_places, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.myslecinek), getString(R.string.myslecinek_address), getString(R.string.myslecinek_info), getString(R.string.link_myslecinek), R.drawable.star_five, R.drawable.myslecinek));
        places.add(new Place(getString(R.string.peppermint), getString(R.string.peppermint_address), getString(R.string.peppermint_info), getString(R.string.link_peppermint), R.drawable.star_five, R.drawable.peppermint));
        places.add(new Place(getString(R.string.break_the_brain), getString(R.string.break_the_brain_address), getString(R.string.break_the_brain_info), getString(R.string.link_break_the_brain), R.drawable.star_five, R.drawable.btb));
        places.add(new Place(getString(R.string.rubaru), getString(R.string.rubaru_address), getString(R.string.rubaru_info), getString(R.string.link_rubaru), R.drawable.star_five, R.drawable.rubaru));
        places.add(new Place(getString(R.string.family_park), getString(R.string.family_park_address), getString(R.string.family_park_info), getString(R.string.link_family_park), R.drawable.star_four, R.drawable.familypark));
        places.add(new Place(getString(R.string.chinska_patelnia), getString(R.string.chinska_patelnia_address), getString(R.string.chinska_patelnia_info), getString(R.string.link_chinska_patelnia), R.drawable.star_four, R.drawable.chp));
        places.add(new Place(getString(R.string.parkbdg), getString(R.string.parkbdg_address), getString(R.string.parkbdg_info), getString(R.string.link_parkbdg), R.drawable.star_three, R.drawable.parkbdg));
        places.add(new Place(getString(R.string.sphinx), getString(R.string.sphinx_address), getString(R.string.sphinx_info), getString(R.string.link_sphinx), R.drawable.star_two, R.drawable.sphinx));
        places.add(new Place(getString(R.string.multikino), getString(R.string.multikino_address), getString(R.string.multikino_info), getString(R.string.link_multikino), R.drawable.star_one, R.drawable.multikino));

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
