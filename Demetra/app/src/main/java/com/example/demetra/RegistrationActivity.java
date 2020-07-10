package com.example.demetra;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button registrationButton = findViewById(R.id.registration);
        registrationButton.setOnClickListener(v -> {
            EditText nameText = findViewById(R.id.username);
            EditText emailText = findViewById(R.id.email2);
            EditText passwordText = findViewById(R.id.password2);
            EditText passwordCheckText = findViewById(R.id.password3);

            String name = nameText.getText().toString();
            String email = emailText.getText().toString();
            String password = passwordText.getText().toString();
            String passwordCheck = passwordCheckText.getText().toString();

            CheckBox checkBox = findViewById(R.id.checkBox);

            if(name.equals("Nome") && email.equals("Email") && password.equals("Password") && passwordCheck.equals("Password") && checkBox.isChecked()) {
                Intent intent = new Intent(getApplicationContext(), MainScreenActivity.class);
                startActivity(intent);
            }
        });

        ImageView back = findViewById(R.id.imageView);
        back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), HomePageActivity.class);
            startActivity(intent);
        });

        TextView createAccountView = findViewById(R.id.textView10);
        createAccountView.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        });
    }
}
