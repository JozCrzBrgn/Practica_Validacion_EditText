package com.example.login_basico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relación de valores entre la parte gráfica y la parte lógica
        et1 = (EditText)findViewById(R.id.txt_nombre);
        et2 = (EditText)findViewById(R.id.txt_password);

    }

    // Metodo para el boton
    public void Registrar(View view){

        //Nos traemos el texto de la parte gráfica (llegan en formato String)
        String nombre = et1.getText().toString();
        String pass = et2.getText().toString();

        //Hacemos la validacion
        if(nombre.length() == 0){
            Toast.makeText(this,"Debes de ingresar un nombre",Toast.LENGTH_SHORT).show();
        }
        if(pass.length() == 0){
            Toast.makeText(this,"Debes ingresar una contraseña",Toast.LENGTH_SHORT).show();
        }
        if(nombre.length() != 0 && pass.length() != 0){
            Toast.makeText(this,"Registro en proceso...",Toast.LENGTH_SHORT).show();
        }
    }
}