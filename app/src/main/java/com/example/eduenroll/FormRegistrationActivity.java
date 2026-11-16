package com.example.eduenroll;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class FormRegistrationActivity extends AppCompatActivity {

    private TextInputEditText etNama, etNisn, etJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_registration);

        ImageButton btnBack = findViewById(R.id.btnBack);
        etNama = findViewById(R.id.etNama);
        etNisn = findViewById(R.id.etNisn);
        etJurusan = findViewById(R.id.etJurusan);
        MaterialButton btnSubmit = findViewById(R.id.btnSubmit);

        btnBack.setOnClickListener(v -> finish());

        btnSubmit.setOnClickListener(v -> {
            String nama = etNama.getText() != null ? etNama.getText().toString().trim() : "";
            String nisn = etNisn.getText() != null ? etNisn.getText().toString().trim() : "";
            String jurusan = etJurusan.getText() != null ? etJurusan.getText().toString().trim() : "";

            if (nama.isEmpty() || nisn.isEmpty() || jurusan.isEmpty()) {
                Toast.makeText(this, "Semua field wajib diisi!", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(FormRegistrationActivity.this, ResultRegistrationActivity.class);
            intent.putExtra("EXTRA_NAMA", nama);
            intent.putExtra("EXTRA_NISN", nisn);
            intent.putExtra("EXTRA_JURUSAN", jurusan);
            startActivity(intent);
        });
    }
}