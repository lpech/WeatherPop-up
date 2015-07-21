package com.itic91.luispech.weatherpop_up;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by luis on 07/07/15.
 */
public class Adapter extends BaseAdapter{

    private ArrayList<List>list;
    LayoutInflater inflater;
    private Context context;

    public Adapter(ArrayList<List> lt, Context ct)
    {
        this.list=lt;
        inflater=LayoutInflater.from(ct);
        this.context=ct;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflater.inflate(R.layout.list, null);
        List lt=list.get(position);
        ImageView picture=(ImageView) convertView.findViewById(R.id.picture);
        TextView title=(TextView) convertView.findViewById(R.id.title);
        TextView subtitle=(TextView) convertView.findViewById(R.id.subtitle);

        picture.setImageDrawable(context.getResources().getDrawable(lt.getPicture()));
        title.setText(lt.getTitle());
        subtitle.setText(lt.getSubtitle());

        return convertView;
    }
}
