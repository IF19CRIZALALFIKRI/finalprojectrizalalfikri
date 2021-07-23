package com.rizalhimself.gerobaksayur;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Daftar_Activity extends AppCompatActivity {
    EditText etDaftarUsername, etDaftarPassword, etDaftarNama, etDaftarAlamat,
            etDaftarTglLahir, etDaftarNoKtp, etDaftarNoTelp;
    RadioButton rdDaftarLaki, rdDaftarPerempuan;
    Button btDaftarUlPhoto, btDaftarSaveData;


    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        //EditText
        etDaftarUsername = findViewById(R.id.etDaftarUsername);
        etDaftarPassword = findViewById(R.id.etDaftarPassword);
        etDaftarNama = findViewById(R.id.etDaftarNama);
        etDaftarAlamat = findViewById(R.id.etDaftarAlamat);
        etDaftarTglLahir = findViewById(R.id.etDaftarTglLahir);
        etDaftarNoKtp = findViewById(R.id.etDaftarNoKtp);
        etDaftarNoTelp = findViewById(R.id.etDaftarNoTelp);

        //RadioButton
        rdDaftarLaki = findViewById(R.id.rdDaftarLaki);
        rdDaftarPerempuan = findViewById(R.id.rdDaftarPerempuan);

        //Button
        btDaftarSaveData = findViewById(R.id.btDaftarSaveData);
        btDaftarUlPhoto = findViewById(R.id.btDaftarUlPhoto);


    }
}
