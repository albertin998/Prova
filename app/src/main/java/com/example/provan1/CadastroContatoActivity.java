package com.example.provan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.provan1.Contato;
import com.example.provan1.ListaContatosActivity;
public class CadastroContatoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_contato);

        EditText nome = findViewById(R.id.editNome);
        EditText telefone1 = findViewById(R.id.editTelefone1);
        EditText telefone2 = findViewById(R.id.editTelefone2);
        EditText nascimento = findViewById(R.id.editNascimento);
        EditText email = findViewById(R.id.editEmail);
        EditText rua = findViewById(R.id.editRua);
        EditText quadra = findViewById(R.id.editQuadra);
        EditText lote = findViewById(R.id.editLote);
        EditText bairro = findViewById(R.id.editBairro);
        EditText cidade = findViewById(R.id.editCidade);
        EditText estado = findViewById(R.id.editEstado);
        EditText cep = findViewById(R.id.editCep);
        EditText cpf = findViewById(R.id.editCpf);
        Button salvar = findViewById(R.id.btnSalvarContato);

        salvar.setOnClickListener(v -> {
            Contato c = new Contato(
                    nome.getText().toString(),
                    telefone1.getText().toString(),
                    telefone2.getText().toString(),
                    nascimento.getText().toString(),
                    email.getText().toString(),
                    rua.getText().toString(),
                    quadra.getText().toString(),
                    lote.getText().toString(),
                    bairro.getText().toString(),
                    cidade.getText().toString(),
                    estado.getText().toString(),
                    cep.getText().toString(),
                    cpf.getText().toString()
            );
            ListaContatosActivity.contatos.add(c);
            finish();
        });
    }
}
