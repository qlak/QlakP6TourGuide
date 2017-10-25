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
 * Fills the list of the Place Objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places){
        super (context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        placeName.setText(currentPlace.getPlaceName());

        TextView placeAdress = (TextView) listItemView.findViewById(R.id.place_address);
        placeAdress.setText(currentPlace.getAdress());

        TextView placeInfo = (TextView) listItemView.findViewById(R.id.place_info);
        placeInfo.setText(currentPlace.getInformation());

        ImageView placeImage = (ImageView) listItemView.findViewById(R.id.place_image);
        placeImage.setImageResource(currentPlace.getImageRes());

        ImageView placeRating = (ImageView) listItemView.findViewById(R.id.rating);
        placeRating.setImageResource(currentPlace.getRatingRes());

        return listItemView;
    }

}
