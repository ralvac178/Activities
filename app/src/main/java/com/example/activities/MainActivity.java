package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String name;
    String phone;
    String description;
    String email;
    String day;
    String month;
    String year;

    EditText pName;
    EditText pPhone;
    EditText pDescription;
    EditText pEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.next);
        final DatePicker date = findViewById(R.id.date);

        pName = findViewById(R.id.name);
        pPhone = findViewById(R.id.phone);
        pDescription = findViewById(R.id.description);
        pEmail = findViewById(R.id.mail);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = pName.getText().toString();
                phone = pPhone.getText().toString();
                description = pDescription.getText().toString();
                email = pEmail.getText().toString();
                day = ((Integer)date.getDayOfMonth()).toString();
                month = ((Integer)date.getMonth()).toString();
                year = ((Integer)date.getYear()).toString();

                Contacto c = new Contacto(name,email,phone,description,day,month,year);

                Intent i = new Intent(getApplicationContext(),Datos2.class);
                i.putExtra("DatoName",c.getName());
                i.putExtra("DatoPhone",c.getPhone());
                i.putExtra("DatoEmail",c.getMail());
                i.putExtra("DatoDescription",c.getDescription());
                i.putExtra("DatoMonth",c.getMonth());
                i.putExtra("DatoYear",c.getYear());
                i.putExtra("DatoDay",c.getDay());

                startActivity(i);
            }
        });
    }
}
