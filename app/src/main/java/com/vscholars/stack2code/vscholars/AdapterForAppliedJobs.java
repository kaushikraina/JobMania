package com.vscholars.stack2code.vscholars;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by vineet_jain on 24/3/17.
 */

public class AdapterForAppliedJobs extends BaseAdapter{
    int count;
    Context context;
    applied_job_list_object ajlo[];
    AdapterForAppliedJobs(Context context,applied_job_list_object ajlo[],int count){
        this.context=context;
        this.count=count;
        for(int i=0;i<count;++i){
            this.ajlo[i]=new applied_job_list_object();
            this.ajlo[i]=ajlo[i];
        }
    }
    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=((Activity)context).getLayoutInflater();
        convertView=layoutInflater.inflate(R.layout.applied_jobs_item_layout,null);
        TextView companyName=(TextView)convertView.findViewById(R.id.job_type_apply);
        TextView date=(TextView)convertView.findViewById(R.id.date);
        TextView status=(TextView)convertView.findViewById(R.id.status);
        companyName.setText(ajlo[position].cname);
        date.setText(ajlo[position].date);
        status.setText(ajlo[position].status);
        return convertView;
    }
}
