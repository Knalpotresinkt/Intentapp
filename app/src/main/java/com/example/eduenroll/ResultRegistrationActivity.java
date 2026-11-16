package com.example.eduenroll;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_registration);

        ImageButton btnBack = findViewById(R.id.btnBack);
        TextView tvResultNama = findViewById(R.id.tvResultNama);
        TextView tvResultNisn = findViewById(R.id.tvResultNisn);
        TextView tvResultJurusan = findViewById(R.id.tvResultJurusan);

        btnBack.setOnClickListener(v -> finish());

        String nama = getIntent().getStringExtra("EXTRA_NAMA");
        String nisn = getIntent().getStringExtra("EXTRA_NISN");
        String jurusan = getIntent().getStringExtra("EXTRA_JURUSAN");

        tvResultNama.setText(nama);
        tvResultNisn.setText(nisn);
        tvResultJurusan.setText(jurusan);
    }
}