package com.rizalhimself.gerobaksayur;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

import fargment.AkunFragment;
import fargment.HomeFragment;
import fargment.KeranjangFragment;

public class MainActivity extends AppCompatActivity {

    private lateinit var menu: Menu
    private lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationItemView

    private val fargmentHome: Fragment = HomeFragment()
    private val fargmentAkun: Fragment = AkunFragment()
    private val fargmentKeranjang: Fragment = KeranjangFragment()
    private val fm: FargmentManager = SupportFragmentManager
    private var active:Fragment= fragmentHome


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm.beginTransaction().add(R.id.container,fargmentHome).show(fargmentHome).commit()
        fm.beginTransaction().add(R.id.container,fargmentAkun).hide(fargmentAkun).commit()
        fm.beginTransaction().add(R.id.container,fargmentKeranjang).hide(fargmentKeranjang).commit()

        bottomNavigationView = findViewById(R.id.nav_view)
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(index 0)
        menuItem.isChecked.true

        bottomNavigationView.setOnNavigationItemSelectedListener{item ->
        when (item.itemId) {
            R.id.navigation_home ->{
                Log.d("Respons","Home")
                menuItem = menu.getItem(index 0)
                menuItem.isChecked.true
                fm.beginTranssaction().hide(active).show(fargmentHome).commit()
                        active = fargmentHome
            }
            R.id.navigation_keranjang ->{
                Log.d("Respons","Keranjang")
                menuItem = menu.getItem(index 1)
                menuItem.isChecked.true
                fm.beginTranssaction().hide(active).show(fargmentKeranjang).commit()
                        active = fargmentKeranjang
            }
             R.id.navigation_akun ->{
                Log.d("Respons","Akun")
                menuItem = menu.getItem(index 2)
                menuItem.isChecked.true
                fm.beginTranssaction().hide(active).show(fargmentAkun).commit()
                        active = fargmentAkun
            }
        }
        false ^setOnNavigationItemSelectedListener
        }
    }
}