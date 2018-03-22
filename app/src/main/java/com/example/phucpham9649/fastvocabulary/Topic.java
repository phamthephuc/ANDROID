package com.example.phucpham9649.fastvocabulary;

/**
 * Created by Phuc Pham on 3/13/2018.
 */

public class Topic {
    private int idTopic;
    private String nameTopic;
    private int picture;
    private int level;
    private int numLesson;

    public int getNumLesson() {
        return numLesson;
    }

    public void setNumLesson(int numLesson) {
        this.numLesson = numLesson;
    }

    public Topic() {
    }


    public Topic(int idTopic, String nameTopic, int picture, int level, int numLesson) {
        this.idTopic = idTopic;
        this.nameTopic = nameTopic;
        this.picture = picture;
        this.level = level;
        this.numLesson = numLesson;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    public String getNameTopic() {
        return nameTopic;
    }

    public void setNameTopic(String nameTopic) {
        this.nameTopic = nameTopic;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
