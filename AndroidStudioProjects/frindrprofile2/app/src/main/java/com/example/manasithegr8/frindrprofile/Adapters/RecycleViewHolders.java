package com.example.manasithegr8.frindrprofile.Adapters;

/**
 * Created by Manasithegr8 on 09-12-2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.manasithegr8.frindrprofile.R;

public class RecycleViewHolders extends RecyclerView.ViewHolder{

    private static final String TAG = RecycleViewHolders.class.getSimpleName();

    public TextView profileHeader;

    public TextView profileContent;

    public RecycleViewHolders(final View itemView) {
        super(itemView);
        profileHeader = (TextView)itemView.findViewById(R.id.heading);
        profileContent = (TextView) itemView.findViewById(R.id.profile_content);
    }
}