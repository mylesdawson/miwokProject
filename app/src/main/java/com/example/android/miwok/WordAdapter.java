package com.example.android.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
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

        TextView miwokView = (TextView)convertView.findViewById(R.id.text_view_1);
        TextView defaultView = (TextView)convertView.findViewById(R.id.text_view_2);

        miwokView.setText(word.getmMiwokTranslation());
        defaultView.setText(word.getDefaultTranslation());

        // Return the completed view to render on screen
        return convertView;
    }
}
