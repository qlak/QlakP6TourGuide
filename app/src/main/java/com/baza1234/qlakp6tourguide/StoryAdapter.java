package com.baza1234.qlakp6tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Fills the list of the Story Objects.
 */
public class StoryAdapter extends ArrayAdapter<String> {

    public StoryAdapter(Context context, ArrayList<String> places){
        super (context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_history_item, parent, false);
        }

        String currentString = getItem(position);

        TextView story = (TextView) listItemView.findViewById(R.id.story);
        story.setText(currentString);

        return listItemView;
    }




}
