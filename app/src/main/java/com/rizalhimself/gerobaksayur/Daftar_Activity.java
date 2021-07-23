package com.rizalhimself.gerobaksayur;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Daftar_Activity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference dataUser;
    EditText etDaftarUsername, etDaftarPassword, etDaftarNama, etDaftarAlamat,
            etDaftarTglLahir, etDaftarNoKtp, etDaftarNoTelp;
    RadioButton rdDaftarLaki, rdDaftarPerempuan;
    Button btDaftarUlPhoto, btDaftarSaveData;

    final int KodeGallery = 100, KodeKamera = 99;
    Uri imageUri;

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

        btDaftarUlPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}