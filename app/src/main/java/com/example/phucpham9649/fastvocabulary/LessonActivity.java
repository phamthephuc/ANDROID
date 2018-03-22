package com.example.phucpham9649.fastvocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class LessonActivity extends AppCompatActivity {

    private GridView gridLesson;
    private LessonAdapter lessonAdapter;
    private ArrayList<Lesson> listLesson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        anhXa();
        lessonAdapter = new LessonAdapter(getApplicationContext(),R.layout.topic_layout,listLesson);
        gridLesson.setAdapter(lessonAdapter);
    }

    public void anhXa(){
        gridLesson = findViewById(R.id.gridLesson);
        listLesson = new ArrayList<>();
        listLesson.add(new Lesson(1,R.drawable.mario,4,1));
        listLesson.add(new Lesson(1,R.drawable.topic7,4,1));
        listLesson.add(new Lesson(1,R.drawable.mario,4,1));
        listLesson.add(new Lesson(1,R.drawable.topic6,4,1));
        listLesson.add(new Lesson(1,R.drawable.topic7,4,1));

    }
}
