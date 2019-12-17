package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Datos2 extends AppCompatActivity {

    TextView tvName;
    TextView tvPhone;
    TextView tvDescription;
    TextView tvEmail;
    TextView tvDate;
    Button bEditar;
    String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos2);

        tvDescription = findViewById(R.id.datoDescription);
        tvEmail = findViewById(R.id.datoEmail);
        tvName = findViewById(R.id.datoName);
        tvPhone = findViewById(R.id.datoPhone);
        tvDate = findViewById(R.id.datoDate);

        Bundle p = getIntent().getExtras();

        tvName.setText("Nombre: "+p.getString("DatoName"));
        tvDescription.setText("Descripción: "+p.getString("DatoPhone"));
        tvEmail.setText("Email: "+p.getString("DatoEmail"));
        tvPhone.setText("Phone: "+p.getString("DatoDescription"));

        fecha = (p.getString("DatoDay"));
        fecha+= "/"+(p.getString("DatoMonth"));
        fecha+= "/"+(p.getString("DatoYear"));

        tvDate.setText("Nacimiento: "+fecha);


        bEditar = findViewById(R.id.bEditar);

        bEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Datos2.this,MainActivity.class);
                finish();
            }
        });
    }
}
