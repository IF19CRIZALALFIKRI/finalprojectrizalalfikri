package com.rizalhimself.gerobaksayur;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;

import fargment.AkunFragment;
import fargment.HomeFragment;
import fargment.KeranjangFragment;

public class MainActivity extends AppCompatActivity {

    val fargmentHome: Fragment = HomeFragment ()
    val fargmentAkun: Fragment = AkunFragment ()
    val fargmentKeranjang: Fragment = KeranjangFragment ()
    val fm: FragmentManager =

    @NonNull
    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    var active: Fragment = fargmentHome
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm.beginTransaction().add(R.id.container,fargmentHome).show(fargmentHome).commit()
        fm.beginTransaction().add(R.id.container,fargmentAkun).hide(fargmentAkun).commit()
        fm.beginTransaction().add(R.id.container,fargmentKeranjang).hide(fargmentKeranjang).commit()
    }
}