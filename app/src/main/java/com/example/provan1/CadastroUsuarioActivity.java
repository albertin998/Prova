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

public class CadastroUsuarioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        EditText nome = findViewById(R.id.editNome);
        EditText email = findViewById(R.id.editEmail);
        EditText senha = findViewById(R.id.editSenha);
        EditText confirma = findViewById(R.id.editConfirmaSenha);
        Button cadastrar = findViewById(R.id.btnConfirmarCadastro);

        cadastrar.setOnClickListener(v -> {
            if (!senha.getText().toString().equals(confirma.getText().toString())) {
                Toast.makeText(this, "Senhas não conferem!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Usuário cadastrado!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}