package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","lutti", "@mipmap/ic_launcher"));
        words.add(new Word("two", "otiiko", "@mipmap/ic_launcher"));
        words.add(new Word("three","tolookosu", "@mipmap/ic_launcher"));
        words.add(new Word("four", "oyyisa", "@mipmap/ic_launcher"));
        words.add(new Word("five", "massokka", "@mipmap/ic_launcher"));
        words.add(new Word("six", "temmokka", "@mipmap/ic_launcher"));
        words.add(new Word("seven", "kenekaku", "@mipmap/ic_launcher"));
        words.add(new Word("eight", "kawinta", "@mipmap/ic_launcher"));
        words.add(new Word("nine", "wo'e", "@mipmap/ic_launcher"));
        words.add(new Word("ten", "na'aacha", "@mipmap/ic_launcher"));

        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

    }
}
