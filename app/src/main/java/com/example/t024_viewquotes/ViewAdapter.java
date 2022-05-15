package com.example.t024_viewquotes;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ViewAdapter extends ArrayAdapter<Model> {

    Activity context ;
    List<Model> list ;

    public ViewAdapter(Activity context, List<Model> list) {
        super(context, R.layout.activity_view,list);
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.view_list_layout , null , true);

        TextView quote_cat = (TextView) convertView.findViewById(R.id.lst_quote_cat);
        TextView quote_cat_no = (TextView) convertView.findViewById(R.id.lst_quote_cat_no);
        TextView quote_no = (TextView) convertView.findViewById(R.id.lst_quote_no);
        TextView quote = (TextView) convertView.findViewById(R.id.lst_quote);

        Model model = list.get(position);

        quote_cat.setText(model.getQuote_cat());
        quote_cat_no.setText(model.quote_cat_no);
        quote_no.setText(model.quote_no);
        quote.setText(model.quote);

        return convertView ;
    }
}
