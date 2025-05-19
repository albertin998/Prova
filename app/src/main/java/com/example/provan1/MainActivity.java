package com.example.provan1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editLogin, editSenha;
    private Button btnLogin, btnCadastrar, btnRecuperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.editSenha);
        btnLogin = findViewById(R.id.btnLogin);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnRecuperar = findViewById(R.id.btnRecuperar);

        btnLogin.setOnClickListener(v -> {
            String login = editLogin.getText().toString();
            String senha = editSenha.getText().toString();

            if (login.isEmpty() || senha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            } else if (login.equals("albertoteste@teste") && senha.equals("1234")) {

                Intent intent = new Intent(this, ListaContatosActivity.class);
                startActivity(intent);
            } else {
                startActivity(new Intent(this, TelaErroActivity.class));
            }
        });

        btnCadastrar.setOnClickListener(v ->
                startActivity(new Intent(this, CadastroUsuarioActivity.class))
        );

        btnRecuperar.setOnClickListener(v ->
                startActivity(new Intent(this, RecuperarSenhaActivity.class))
        );
    }
}
