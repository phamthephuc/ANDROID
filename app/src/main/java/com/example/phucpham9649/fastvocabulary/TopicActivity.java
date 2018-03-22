package com.example.phucpham9649.fastvocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class TopicActivity extends AppCompatActivity {

    private GridView gridTopic;
    private TopicAdapter topicAdapter;
    private ArrayList<Topic> listTopic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);
        anhXa();
        topicAdapter = new TopicAdapter(getApplicationContext(),R.layout.topic_layout,listTopic);
        gridTopic.setAdapter(topicAdapter);
        gridTopic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(TopicActivity.this,LessonActivity.class);
                intent.putExtra("key",i);
                startActivity(intent);
            }
        });
    }

    public void anhXa(){
        gridTopic = (GridView)findViewById(R.id.gridTopic);
        listTopic = new ArrayList<Topic>();
        listTopic.add(new Topic(5,"Life",R.drawable.topic1,1,10));
        listTopic.add(new Topic(1,"Activity",R.drawable.topic2,8,10));
        listTopic.add(new Topic(3,"School",R.drawable.topic3,10,10));
        listTopic.add(new Topic(1,"Home",R.drawable.topic4,5,10));
        listTopic.add(new Topic(2,"Computer",R.drawable.topic5,7,10));
        listTopic.add(new Topic(6,"Work",R.drawable.topic6,10,10));
    }
}
