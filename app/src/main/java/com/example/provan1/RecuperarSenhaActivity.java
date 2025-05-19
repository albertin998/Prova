package com.example.provan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RecuperarSenhaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);

        EditText email = findViewById(R.id.editRecuperaEmail);
        Button recuperar = findViewById(R.id.btnRecuperarSenha);

        recuperar.setOnClickListener(v -> {
            Toast.makeText(this, "Instruções enviadas para " + email.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}