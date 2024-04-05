package com.example.connectodoo;

import static com.example.connectodoo.R.*;
import static com.example.connectodoo.R.id.btninscri;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boutton;
    Button boutonconx;
    EditText editTextUsername;
    EditText editTextPassword;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        boutton=(Button) findViewById(R.id.btninscri);
        editTextUsername = findViewById(R.id.nom);
        editTextPassword = findViewById(R.id.pass);

        boutonconx=(Button) findViewById(id.cnx);
        boutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, RegisterOdoo.class);
                startActivity(intent);
            }
        });

        boutonconx=(Button) findViewById(id.cnx);
        boutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.equals("youssouf") && password.equals("123456789")) {
                    // Si les identifiants sont corrects, accéder à l'interface suivante
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                } else {
                    // Si les identifiants sont incorrects, afficher un message d'erreur
                    // (Vous pouvez également ajouter d'autres logiques de gestion des erreurs ici)
                    Toast.makeText(MainActivity.this, "Identifiants incorrects", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}