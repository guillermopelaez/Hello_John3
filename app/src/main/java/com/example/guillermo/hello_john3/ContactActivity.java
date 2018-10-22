package com.example.guillermo.hello_john3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        findViewById(R.id.botonDeSiguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();
            }
        });

        // sacar nombre y apellidos del intent
        // sacar email y telefono del activity
        // cuando pulsen el bottom --> enviar 4 datos a la pago.


        //cuando pulsen el botom -->sacar nombre y apellidos, email y telf en enviar.
    }
    void enviarDatos(){
        String nombre = getIntent().getStringExtra(MainActivity.nombreUsuario);
        String apellido = getIntent().getStringExtra(MainActivity.apellidoUsuario);
        String email = findViewById(R.id.editTextEmail).getText().toString();
    }
}
