package com.example.eduenroll; // Sesuaikan dengan nama package project kamu

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Menghubungkan ke activity_main.xml

        MaterialCardView cardForm = findViewById(R.id.cardForm);
        MaterialCardView cardEmail = findViewById(R.id.cardEmail);
        MaterialCardView cardPhone = findViewById(R.id.cardPhone);
        MaterialCardView cardAbout = findViewById(R.id.cardAbout);

        // 1. Ke Form Pendaftaran
        cardForm.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, FormRegistrationActivity.class));
        });

        // 2. Redirect ke Gmail / Email Client
        cardEmail.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:info@eduenroll.sch.id"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Tanya Pendaftaran Siswa Baru");
            startActivity(Intent.createChooser(emailIntent, "Kirim Email via..."));
        });

        // 3. Redirect ke Phone Dialer
        cardPhone.setOnClickListener(v -> {
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
            phoneIntent.setData(Uri.parse("tel:081234567890"));
            startActivity(phoneIntent);
        });

        // 4. Ke Halaman About Us
        cardAbout.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
        });
    }
}