package android.example.com.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Fanharil Ardian on 18/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {
    String[] country_names, country_capitals;

    public RecyclerAdapter(String[] country_names, String[] country_capitals) {
        this.country_names = country_names;
        this.country_capitals = country_capitals;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
