package com.example.julio.appteste;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.InputDevice;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button botao;
    EditText email;
    EditText senha;
    TextView TextoaExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        botao = findViewById(R.id.login);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        TextoaExibir = findViewById(R.id.TextoaExibir);
    }

    public void  clicouNoBotao(View view){
        TextoaExibir.setText("Teste");
        setContentView(R.layout.tela2);
    }

    public void  clicouSalvar(View view){
        setContentView(R.layout.telafinal);
    }

}
