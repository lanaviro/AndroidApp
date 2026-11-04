package com.example.zavrsni_projekt_g3p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;

    EditText email;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        button = (Button) findViewById(R.id.button);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = name.getText().toString();
                String email1 = email.getText().toString();
                if(name1.equals("") || email1.equals("")){
                    Toast.makeText(MainActivity.this, "Morate upisati vaše podatke", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("name",name1);
                    intent.putExtra("email",email1);
                    startActivity(intent);
                }

            }
        };
        button.setOnClickListener(listener);
    }
}