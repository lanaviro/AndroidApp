package com.example.zavrsni_projekt_g3p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    ImageView arrow;
    ImageView home;
    ImageView menu;

    TextView textView1;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        arrow =  findViewById(R.id.arrow);
        home = findViewById(R.id.home);
        menu = findViewById(R.id.menu);
        textView1 = (TextView) findViewById(R.id.textView3);
        textView2 = (TextView) findViewById(R.id.textView4);



        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name");


        textView1.setText("Narudžba poslana" + name1);


        View.OnClickListener arrow_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        };
        arrow.setOnClickListener(arrow_listener);

        View.OnClickListener home_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        };
        home.setOnClickListener(home_listener);

        View.OnClickListener menu_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, meni.class);
                startActivity(intent);
                Toast.makeText(MainActivity3.this, "Dobrodošli u meni! Izaberite što vam se sviđa a mi ćemo vam izraćunati cijenu:)", Toast.LENGTH_LONG).show();

            }
        };
        menu.setOnClickListener(menu_listener);
    }
}