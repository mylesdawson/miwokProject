package com.example.android.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mResourceID;

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceID) {
        super(context, 0, words);
        mResourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // get object located at this position in the list
        Word word = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        View textContainer = convertView.findViewById(R.id.text_container);
        View playSoundButton = convertView.findViewById(R.id.play_button);
        int color = ContextCompat.getColor(getContext(), mResourceID);
        textContainer.setBackgroundColor(color);
        playSoundButton.setBackgroundColor(color);

        TextView miwokView = (TextView) convertView.findViewById(R.id.text_view_1);
        TextView defaultView = (TextView) convertView.findViewById(R.id.text_view_2);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);

        miwokView.setText(word.getMiwokTranslation());
        defaultView.setText(word.getDefaultTranslation());

        if (word.hasImage()) {
            imageView.setImageResource(word.getmMiwokImage());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Return the completed view to render on screen
        return convertView;
    }
}
