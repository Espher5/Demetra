package com.example.demetra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class DettaglioAcqua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dettaglio_acqua);

        ImageView back = findViewById(R.id.imageView);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainScreenActivity.class);
            startActivity(intent);
        });

        ImageView user = findViewById(R.id.imageView9);
        user.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Utente.class);
            startActivity(intent);
        });

        ImageView calendar = findViewById(R.id.imageView10);
        calendar.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), CalendarioActivity.class);
            startActivity(intent);
        });

        ImageView home = findViewById(R.id.imageView3);
        home.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainScreenActivity.class);
            startActivity(intent);
        });

        ImageView bell = findViewById(R.id.imageView8);
        bell.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), PromemoriaActivity.class);
            startActivity(intent);
        });
    }
}