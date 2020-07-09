package com.example.demetra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        ImageView user = findViewById(R.id.imageView9);
        user.setOnClickListener(v -> {

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

    public void changeTemperatura(View view) {
        Intent intent = new Intent(getApplicationContext(), DettaglioTemperatura.class);
        startActivity(intent);

    }

    public void changeAcqua(View view) {
        Intent intent = new Intent(getApplicationContext(), DettaglioAcqua.class);
        startActivity(intent);
    }

    public void changeScansione(View view) {
        Intent intent = new Intent(getApplicationContext(), DettaglioScansione.class);
        startActivity(intent);
    }

    public void changeNutrienti(View view) {
        Intent intent = new Intent(getApplicationContext(), DettaglioNutrienti.class);
        startActivity(intent);
    }

    public void changeMeteo(View view) {
        Intent intent = new Intent(getApplicationContext(), DettaglioMeteo.class);
        startActivity(intent);
    }

    public void changeFertilizzante(View view) {
        Intent intent = new Intent(getApplicationContext(), DettaglioFertilizzante.class);
        startActivity(intent);
    }
}
