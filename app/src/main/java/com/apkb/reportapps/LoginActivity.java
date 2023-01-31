package com.apkb.reportapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.apkb.reportapps.ui.main.MainActivity;

public class LoginActivity<activity_login> extends AppCompatActivity {

    String username = "admin";
    String password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText txtUser = findViewById(R.id.txtUser);
        final EditText txtPass = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.Login);

        login.setOnClickListener(view -> {
            if (txtUser.getText().toString().equalsIgnoreCase(username)&& txtPass.getText().toString().equalsIgnoreCase(password)) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }else{
                Toast.makeText(LoginActivity.this, "username/password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}