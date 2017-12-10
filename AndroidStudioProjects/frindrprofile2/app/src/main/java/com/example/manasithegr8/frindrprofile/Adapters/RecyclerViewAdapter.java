package com.example.manasithegr8.frindrprofile.Adapters;

/**
 * Created by Manasithegr8 on 09-12-2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.manasithegr8.frindrprofile.R;
import com.example.manasithegr8.frindrprofile.UserProfile;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecycleViewHolders> {

    private List<UserProfile> user;

    protected Context context;

    public RecyclerViewAdapter(Context context, List<UserProfile> user) {
        this.user = user;
        this.context = context;
    }

    @Override
    public RecycleViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        RecycleViewHolders viewHolder = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_list, parent, false);
        viewHolder = new RecycleViewHolders(layoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolders holder, int position) {
        holder.profileHeader.setText(user.get(position).getHeader());
        holder.profileContent.setText(user.get(position).getProfileContent());
    }

    @Override
    public int getItemCount() {
        return this.user.size();
    }

}
