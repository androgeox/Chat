package com.tassta.test.chat;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Georgiy on 24.05.2016.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    List<Person> mPersons;

     public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView userStatus;
        ImageView avatar;
        TextView userName;
        TextView notification;
        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            userStatus = (TextView)itemView.findViewById(R.id.user_status);
            avatar = (ImageView)itemView.findViewById(R.id.avatar);
            userName = (TextView)itemView.findViewById(R.id.user_name);
            notification = (TextView) itemView.findViewById(R.id.notification);
        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int position) {
        personViewHolder.userName.setText(mPersons.get(position).getName());
        personViewHolder.userStatus.setText(mPersons.get(position).isOnline());
        personViewHolder.notification.setText(mPersons.get(position).);
        personViewHolder.avatar.setImageResource(mPersons.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return mPersons.size();
    }

    RVAdapter(List<Person> persons){
        this.mPersons = persons;
    }
}

