package com.example.proyectoapmonje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btnIngresar;
    private EditText etUsuario;
    private EditText etClave;
    private String usuario;
    private String clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnIngresar = findViewById(R.id.btnIngresar);
        etUsuario = findViewById(R.id.etUsuario);
        etClave = findViewById(R.id.etClave);
        usuario = "admin";
        clave = "uacm";
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etUsuario.getText().toString().equals(usuario) && etClave.getText().toString().equals(clave)){
                    Toast.makeText(LoginActivity.this, "Login exitoso", Toast.LENGTH_SHORT).show();

                    Intent intento = new Intent(LoginActivity.this, MenuActivity.class);
                    startActivity(intento);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "Error: Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}