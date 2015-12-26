package com.example.zahid.metalhead.CustomArrayAdapter;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zahid.metalhead.HelperClass.RowItem;
import com.example.zahid.metalhead.R;

/**
 * Created by ZAHID on 11/13/2015.
 */
public class CustomArrayAdapter extends BaseAdapter {
    Context context;
    List<RowItem> rowItem;

    public CustomArrayAdapter(Context context, List<RowItem> rowItem) {
        this.context = context;
        this.rowItem = rowItem;

    }

    @Override
    public int getCount() {

        return rowItem.size();
    }

    @Override
    public Object getItem(int position) {

        return rowItem.get(position);
    }

    @Override
    public long getItemId(int position) {

        return rowItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.row_item,null);
            holder = new ViewHolder();
            holder.imgIcon = (ImageView) convertView.findViewById(R.id.imageView2);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.textViewName);
           convertView.setTag(holder);
        }
        else {

            holder = (ViewHolder) convertView.getTag();
        }
        RowItem row_pos = rowItem.get(position);
        holder.imgIcon.setImageResource(row_pos.getIcon());
        holder.txtTitle.setText(row_pos.getBandName());
        return convertView;

    }
    static class ViewHolder{
        TextView txtTitle;
        ImageView imgIcon;
    }
}