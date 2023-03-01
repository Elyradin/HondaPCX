package com.example.hondapcx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private Boolean isFragmentHondaDisplay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentHonda fragmentHonda = FragmentHonda.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, fragmentHonda).addToBackStack(null).commit();

        mButton = findViewById(R.id.info_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFragmentHondaDisplay) {
                    displayFragmentKelebihan();
                } else {
                    closeFragment();
                }
            }
        });
    }

    private void closeFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentKelebihan fragmentKelebihan = (FragmentKelebihan) fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragmentKelebihan != null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(fragmentKelebihan).commit();
        }
        FragmentHonda fragmentHonda = FragmentHonda.newInstance();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, fragmentHonda).addToBackStack(null).commit();
        mButton.setText("Lihat Kelebihan");
        isFragmentHondaDisplay = true;
    }

    private void displayFragmentKelebihan() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentHonda fragmentHonda = (FragmentHonda) fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragmentHonda != null){
            FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
            fragmentTransaction1.remove(fragmentHonda).commit();
        }
        FragmentKelebihan fragmentKelebihan1 = FragmentKelebihan.newInstance();
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.add(R.id.fragment_container, fragmentKelebihan1).addToBackStack(null).commit();
        mButton.setText("Mantap!");
        isFragmentHondaDisplay = false;
        
        
    }




    }