package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "weṭeṭṭi", "@mipmap/ic_launcher"));
        words.add(new Word("mustard yellow", "chiwiiṭә", "@mipmap/ic_launcher"));
        words.add(new Word("dusty yellow", "ṭopiisә", "@mipmap/ic_launcher"));
        words.add(new Word("green", "chokokki", "@mipmap/ic_launcher"));
        words.add(new Word("brown", "ṭakaakki", "@mipmap/ic_launcher"));
        words.add(new Word("gray", "ṭopoppi", "@mipmap/ic_launcher"));
        words.add(new Word("black", "kululli", "@mipmap/ic_launcher"));
        words.add(new Word("white", "kelelli", "@mipmap/ic_launcher"));

        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

    }
}
