package com.example.demetra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demetra.HomePageActivity;
import com.example.demetra.MainScreenActivity;
import com.example.demetra.R;
import com.example.demetra.RegistrationActivity;

public class Utente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utente);

        ImageView back = findViewById(R.id.imageView);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainScreenActivity.class);
            startActivity(intent);
        });

        TextView logoutView1 = findViewById(R.id.logouttext);
        logoutView1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
            startActivity(intent);
        });

        ImageView logoutView2 = findViewById(R.id.logout);
        logoutView2.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
            startActivity(intent);
        });
    }
}