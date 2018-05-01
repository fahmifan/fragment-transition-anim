package com.example.asuspc.fragmentapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new BEFragment());
    }

    private void changeFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(R.animator.fragment_slide_left_enter,
                R.animator.fragment_slide_left_exit,
                R.animator.fragment_slide_right_enter,
                R.animator.fragment_slide_right_exit);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.replace(R.id.BKFragment, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onClickBE(View view){
        changeFragment(new BEFragment());
    }

    public void onClickDPA(View view){
        changeFragment(new DPAFragment());
    }

    public void onClickPresidium(View view){
        changeFragment(new PresidiumFragment());
    }
}
