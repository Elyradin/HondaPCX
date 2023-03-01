package com.example.hondapcx;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.Contract;

public class FragmentKelebihan extends Fragment {

    public FragmentKelebihan() {
        // Required empty public constructor
    }

    @NonNull
    @Contract(" -> new")
    public static FragmentKelebihan newInstance() {
        return new FragmentKelebihan();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kelebihan, container, false);
    }
}