package com.example.android.bucharesttourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lariveg on 15/05/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter (Activity context, ArrayList<Place> places, int colorResourceId){
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    static class ViewHolder {
        private TextView nameTextView;
        private TextView addressTextView;
        private ImageView placeImageView;
        private View textContainer;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        ViewHolder holder;

        // Check if the existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            // cache view fields into the holder
            holder = new ViewHolder();
            holder.nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
            holder.addressTextView = (TextView) listItemView.findViewById(R.id.place_address);
            holder.placeImageView = (ImageView) listItemView.findViewById(R.id.image);
            holder.textContainer = listItemView.findViewById(R.id.text_container);
            listItemView.setTag(holder);
        }
        // view already exists, get the holder instance from the view
        else {
            holder = (ViewHolder) listItemView.getTag();
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        holder.nameTextView.setText(currentPlace.getPlaceName());
        holder.addressTextView.setText(currentPlace.getPlaceAddress());
        holder.placeImageView.setImageResource(currentPlace.getImageId());

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        holder.textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
