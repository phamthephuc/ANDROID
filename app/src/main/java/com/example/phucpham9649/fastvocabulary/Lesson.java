package com.example.phucpham9649.fastvocabulary;

/**
 * Created by Phuc Pham on 3/13/2018.
 */

public class Lesson {
    private int idLesson;
    private int picture;
    private int numStar;
    private int idTopic;


    public Lesson(int idLesson, int picture, int numStar, int idTopic) {
        this.idLesson = idLesson;
        this.picture = picture;
        this.numStar = numStar;
        this.idTopic = idTopic;
    }

    public Lesson() {
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public int getNumStar() {
        return numStar;
    }

    public void setNumStar(int numStar) {
        this.numStar = numStar;
    }

    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }
}
