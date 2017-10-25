package com.baza1234.qlakp6tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Fragment subclass.
 */
public class HistoryFragment extends Fragment {

    public HistoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_of_places, container, false);

        final ArrayList<String> history = new ArrayList<String>();
        history.add(new String(getString(R.string.story1)));
        history.add(new String(getString(R.string.story2)));
        history.add(new String(getString(R.string.story3)));
        history.add(new String(getString(R.string.story4)));
        history.add(new String(getString(R.string.story5)));
        history.add(new String(getString(R.string.story6)));
        history.add(new String(getString(R.string.story7)));
        history.add(new String(getString(R.string.story8)));
        history.add(new String(getString(R.string.story9)));
        history.add(new String(getString(R.string.story10)));

        StoryAdapter adapter = new StoryAdapter(getActivity(), history);
        ListView listView = (ListView) rootView.findViewById(R.id.list_of_places);

        listView.setAdapter(adapter);

        return rootView;
    }
}
