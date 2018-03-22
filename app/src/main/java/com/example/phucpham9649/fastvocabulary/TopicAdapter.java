package com.example.phucpham9649.fastvocabulary;

import android.content.Context;
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

public class TopicAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Topic> listTopic;


    public TopicAdapter(Context context, int layout, List<Topic> listTopic) {
        this.context = context;
        this.layout = layout;
        this.listTopic = listTopic;
    }

    public TopicAdapter() {
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

    public List<Topic> getListTopic() {
        return listTopic;
    }

    public void setListTopic(List<Topic> listTopic) {
        this.listTopic = listTopic;
    }

    @Override
    public int getCount() {
       return listTopic.size();
    }

    @Override
    public Object getItem(int i) {
        return listTopic.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listTopic.get(i).getIdTopic();
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
            view.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) view.getTag();
        }
        Topic topic = listTopic.get(i);
        holder.txtTopic.setText(topic.getNameTopic());
        holder.imgTopic.setImageResource(topic.getPicture());
        holder.pgTopic.setProgress(topic.getLevel());
        holder.pgTopic.setMax(topic.getNumLesson());

        return view;
    }
}
