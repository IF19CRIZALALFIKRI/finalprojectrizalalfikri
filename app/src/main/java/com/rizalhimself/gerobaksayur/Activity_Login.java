package com.rizalhimself.gerobaksayur;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_Login extends AppCompatActivity {
    EditText etUserName, etPassword;
    Button btDaftar, btLogin;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        btDaftar = findViewById(R.id.btDaftar);
        btLogin = findViewById(R.id.btLogin);
        etPassword = findViewById(R.id.etPassword);
        etUserName = findViewById(R.id.etUsername);

        btDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Daftar_Activity.class);
                startActivity(intent);
            }
        });
    }

}
