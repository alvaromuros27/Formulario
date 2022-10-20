package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    public ArrayList<String> nombres = new ArrayList<>();
    public ArrayList<String> apellidos = new ArrayList<>();
    public ArrayList<String> email = new ArrayList<>();
    public ArrayList<String> mensaje = new ArrayList<>();
    public ArrayList<String> suscrito = new ArrayList<String>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textonombre = findViewById(R.id.textnombre);
        TextView textapellidos = findViewById(R.id.textapellidos);
        TextView textemail = findViewById(R.id.textemail);
        TextView textmensaje = findViewById(R.id.textmensaje);
        CheckBox subcribirse = findViewById(R.id.sub);
        
        Button button = (Button) findViewById(R.id.aceptar);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String a = textonombre.getText().toString();
                nombres.add(a);

                String b = textapellidos.getText().toString();
                apellidos.add(b);

                String c = textemail.getText().toString();
                email.add(c);

                String d = textmensaje.getText().toString();
                mensaje.add(d);

                boolean e = subcribirse.getLinksClickable();

            }
        });
        
        Button eliminar =(Button) findViewById(R.id.limpiar);
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textonombre.setText(" ");
                textapellidos.setText(" ");
                textemail.setText(" ");
                textmensaje.setText(" ");
                subcribirse.setChecked(false);
            }
        });
    }



}
