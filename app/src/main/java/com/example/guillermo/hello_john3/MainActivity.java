package com.example.guillermo.hello_john3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String nombreUsuario = "nombreUsuario";
    public static String apellidoUsuario = "apellidoUsuario";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.botonDeSiguiente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarDatos();
            }
        });
    }
    void enviarDatos(){
        String nombrePersona =((EditText) findViewById(R.id.editTextNombre)).getText().toString();
        String apellidosPersona =((EditText) findViewById(R.id.editTextApellidos)).getText().toString();

        Intent intent = new Intent(MainActivity.this,ContactActivity.class);
        intent.putExtra(nombreUsuario,nombrePersona);
        intent.putExtra(apellidoUsuario,apellidosPersona);

        startActivity(intent);
    }
}
