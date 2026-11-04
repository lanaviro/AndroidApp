package com.example.zavrsni_projekt_g3p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageView arrow;
    ImageView home;
    ImageView menu;
    TextView textView;
    TextView textView2;
    TextView textView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        arrow =  findViewById(R.id.arrow);
        home = findViewById(R.id.home);
        menu = findViewById(R.id.menu);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView6);
        textView3 = (TextView) findViewById(R.id.textView7);



        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name");
        String email1 = intent.getStringExtra("email");
        textView.setText("Dobrodošli " + name1 + "!");
        textView3.setText(name1);
        textView2.setText(email1);


        View.OnClickListener arrow_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        };
        arrow.setOnClickListener(arrow_listener);

        View.OnClickListener home_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
                startActivity(intent);
            }
        };
        home.setOnClickListener(home_listener);

        View.OnClickListener menu_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, meni.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "Dobrodošli u meni! Izaberite što vam se sviđa a mi ćemo vam izraćunati cijenu:)", Toast.LENGTH_LONG).show();
            }
        };
        menu.setOnClickListener(menu_listener);

//        View.OnClickListener lozinka = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//                startActivity(intent);
//            }
//        };
//        textView4.setOnClickListener(lozinka);
    }
}