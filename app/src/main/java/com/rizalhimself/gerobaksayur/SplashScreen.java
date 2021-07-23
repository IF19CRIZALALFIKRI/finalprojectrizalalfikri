package com.rizalhimself.gerobaksayur;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, login2.class);
        startActivity(intent);
        finish();
    }
}
