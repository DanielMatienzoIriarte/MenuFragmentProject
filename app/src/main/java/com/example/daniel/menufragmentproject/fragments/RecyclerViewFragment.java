package com.example.daniel.menufragmentproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.daniel.menufragmentproject.R;
import com.example.daniel.menufragmentproject.adapters.PetAdapter;
import com.example.daniel.menufragmentproject.pojo.Pet;

import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {
    ArrayList<Pet> petsList;
    private RecyclerView petsListRecyclerView;

    public RecyclerViewFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        FloatingActionButton uploadButton = (FloatingActionButton) v.findViewById(R.id.main_floatingButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Upload Photo", Toast.LENGTH_SHORT).show();
            }
        });

        petsListRecyclerView = (RecyclerView) v.findViewById(R.id.main_recyclerView_pets);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        petsListRecyclerView.setLayoutManager(llm);
        initializePetsList();
        initializeAdapter();

        return v;
    }

    private void initializePetsList(){
        petsList = new ArrayList<Pet>();
        petsList.add(new Pet("Mortis", R.drawable.dog_bark_icon, 3));
        petsList.add(new Pet("Vato Loco", R.drawable.dog_chihuahua_bone_icon, 5));
        petsList.add(new Pet("Gordo", R.drawable.dog_dalmatian_king_icon, 3));
        petsList.add(new Pet("Perro", R.drawable.dog_einstein_icon, 1));
        petsList.add(new Pet("Laika", R.drawable.dog_haski_icon, 4));
        petsList.add(new Pet("Dogo", R.drawable.dog_einstein_icon, 2));
        petsList.add(new Pet("Linda", R.drawable.dog_haski_icon, 3));
    }

    private void initializeAdapter(){
        PetAdapter petAdapter = new PetAdapter(petsList, getActivity());
        petsListRecyclerView.setAdapter(petAdapter);
    }
}
