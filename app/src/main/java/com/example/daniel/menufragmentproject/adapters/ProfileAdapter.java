package com.example.daniel.menufragmentproject.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daniel.menufragmentproject.R;
import com.example.daniel.menufragmentproject.pojo.Pet;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{
    private ArrayList<Pet> petsList;
    private Activity petProfileActivity;

    public ProfileAdapter(ArrayList<Pet> petsList, Activity petProfileActivity) {
        this.petsList = petsList;
        this.petProfileActivity = petProfileActivity;
    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_profile, parent, false);

        return new ProfileAdapter.ProfileViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ProfileAdapter.ProfileViewHolder ProfileViewHolder, int position) {
        final Pet pet = petsList.get(position);
        ProfileViewHolder.cardview_avatar.setImageResource(pet.getAvatar());
        ProfileViewHolder.cardview_rate_text.setText(String.valueOf(pet.getRate()));
    }

    @Override
    public int getItemCount() {
        return petsList.size();
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder{
        private ImageView cardview_avatar;
        private TextView cardview_rate_text;

        public ProfileViewHolder(View itemView) {
            super(itemView);

            cardview_avatar = (ImageView) itemView.findViewById(R.id.cardview_profile_imageView_avatar);
            cardview_rate_text = (TextView) itemView.findViewById(R.id.cardview_profile_textView_rate);
        }
    }
}
