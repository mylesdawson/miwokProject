package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus", "@mipmap/ic_launcher"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", "@mipmap/ic_launcher"));
        words.add(new Word("My name is...", "oyaaset...", "@mipmap/ic_launcher"));
        words.add(new Word("How are you feeling?", "michәksәs?", "@mipmap/ic_launcher"));
        words.add(new Word("I’m feeling good.", "kuchi achit", "@mipmap/ic_launcher"));
        words.add(new Word("Are you coming?", "әәnәs'aa?", "@mipmap/ic_launcher"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", "@mipmap/ic_launcher"));
        words.add(new Word("I’m coming.", "әәnәm", "@mipmap/ic_launcher"));
        words.add(new Word("Let’s go.", "yoowutis", "@mipmap/ic_launcher"));
        words.add(new Word("Come here.", "әnni'nem", "@mipmap/ic_launcher"));

        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(wordAdapter);
    }
}
