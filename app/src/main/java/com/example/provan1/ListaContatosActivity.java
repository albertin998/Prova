package com.example.provan1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListaContatosActivity extends AppCompatActivity {
    public static ArrayList<Contato> contatos = new ArrayList<>();
    ArrayAdapter<Contato> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contatos);

        ListView listView = findViewById(R.id.listContatos);
        Button btnAdicionar = findViewById(R.id.btnAdicionarContato);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contatos);
        listView.setAdapter(adapter);

        btnAdicionar.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroContatoActivity.class));
        });

        listView.setOnItemClickListener((parent, view, position, id) -> {
            contatos.remove(position);
            adapter.notifyDataSetChanged();
        });
    }
}
