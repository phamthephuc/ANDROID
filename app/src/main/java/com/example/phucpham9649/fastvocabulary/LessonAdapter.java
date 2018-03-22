package com.example.phucpham9649.fastvocabulary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Phuc Pham on 3/13/2018.
 */

public class LessonAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Lesson> listLesson;


    public LessonAdapter(Context context, int layout, List<Lesson> listTopic) {
        this.context = context;
        this.layout = layout;
        this.listLesson = listLesson;
    }

    public LessonAdapter() {
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<Lesson> getListTopic() {
        return listLesson;
    }

    public void setListTopic(List<Topic> listTopic) {
        this.listLesson = listLesson;
    }

    @Override
    public int getCount() {
       return listLesson.size();
    }

    @Override
    public Object getItem(int i) {
        return listLesson.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listLesson.get(i).getIdTopic();
    }

    private class ViewHolder{
        TextView txtTopic;
        ImageView imgTopic;
        ProgressBar pgTopic;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTopic = (TextView) view.findViewById(R.id.txtTopic);
            holder.imgTopic = (ImageView) view.findViewById(R.id.imgTopic);
            holder.pgTopic = (ProgressBar) view.findViewById(R.id.pgTopic);
            holder.pgTopic.setMax(18);
            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }
        Lesson lesson = listLesson.get(i);
        holder.txtTopic.setText("Lesson " + i);
        holder.imgTopic.setImageResource(lesson.getPicture());
        holder.pgTopic.setProgress(lesson.getNumStar());

        return view;
    }
}
