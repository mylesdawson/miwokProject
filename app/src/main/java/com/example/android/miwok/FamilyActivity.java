package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father", "әpә", "@mipmap/ic_launcher"));
        words.add(new Word("mother", "әṭa", "@mipmap/ic_launcher"));
        words.add(new Word("son", "angsi", "@mipmap/ic_launcher"));
        words.add(new Word("daughter", "tune", "@mipmap/ic_launcher"));
        words.add(new Word("older brother", "taachi", "@mipmap/ic_launcher"));
        words.add(new Word("younger brother", "chalitti", "@mipmap/ic_launcher"));
        words.add(new Word("older sister", "teṭe", "@mipmap/ic_launcher"));
        words.add(new Word("younger sister", "kolliti", "@mipmap/ic_launcher"));
        words.add(new Word("grandmother ", "ama", "@mipmap/ic_launcher"));
        words.add(new Word("grandfather", "paapa", "@mipmap/ic_launcher"));

        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
