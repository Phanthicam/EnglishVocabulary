package com.example.hongv.englishvocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hongv.englishvocabulary.controller.TopicManager;
import com.example.hongv.englishvocabulary.model.Topic;
import com.example.hongv.englishvocabulary.model.Vocabulary;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopicManager topicManager = TopicManager.getsInstance();

        ArrayList<Topic> topics = topicManager.getTopics();
        for (Topic t : topics) {
            System.out.println(t.toString());
            ArrayList<Vocabulary> vocabularies = topicManager.getVocabulary(t);
            for (Vocabulary v : vocabularies) {
                System.out.println(v.toString());
            }
        }


    }
}
