package com.example.hongv.englishvocabulary.controller;

import com.example.hongv.englishvocabulary.model.Topic;
import com.example.hongv.englishvocabulary.model.Vocabulary;

import java.util.ArrayList;

/**
 * Created by hongv on 1/26/2018.
 */

public class TopicManager {
    private static TopicManager sInstance = null;

    private ArrayList<Topic> mTopicList;
    private ArrayList<Vocabulary> mVocabularyList;

    public TopicManager() {
        mTopicList = new ArrayList<>();
        mVocabularyList = new ArrayList<>();
    }

    public void  load() {
        mTopicList.clear();
        mVocabularyList.clear();

        mTopicList.add(new Topic(1, "T1"));
        mTopicList.add(new Topic(2, "T2"));

        mVocabularyList.add(new Vocabulary ("W11","P11", "M11", 1 ));
        mVocabularyList.add(new Vocabulary ("W21","P21", "M21", 1 ));
        mVocabularyList.add(new Vocabulary ("W31","P31", "M31", 1 ));
        mVocabularyList.add(new Vocabulary ("W41","P41", "M41", 1 ));

        mVocabularyList.add(new Vocabulary ("W12","P12", "M12", 2 ));
        mVocabularyList.add(new Vocabulary ("W22","P22", "M22", 2 ));
        mVocabularyList.add(new Vocabulary ("W32","P32", "M32", 2 ));
        mVocabularyList.add(new Vocabulary ("W42","P42", "M42", 2 ));
    }
    public ArrayList<Topic> getTopics () {
        if (mTopicList.isEmpty()) {
            load();
        }
        return mTopicList;
    }
    public  ArrayList<Vocabulary> getVocabulary (Topic topic) {
        ArrayList<Vocabulary> list = new ArrayList<>();
        for (Vocabulary v : list) {
            if (v.getTopicId()==topic.getId()){
                list.add(v);
            }
        }
        return list;
    }

    public static TopicManager getsInstance () {
        if(sInstance==null) {
            sInstance = new TopicManager();
        }
        return  sInstance;
    }
}
