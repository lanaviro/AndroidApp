package com.example.zavrsni_projekt_g3p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class meni extends AppCompatActivity {

    ImageView arrow;
    ImageView home;
    ImageView menu;


    ImageView add_pizza;
    ImageView remove_pizza;
    ImageView add_pasta;
    ImageView remove_pasta;
    ImageView add_pasta2;
    ImageView remove_pasta2;
    ImageView add_pasta3;
    ImageView remove_pasta3;
    ImageView add_pasta4;
    ImageView remove_pasta4;
    ImageView add_hamburger;
    ImageView remove_hamburger;
    ImageView add_salad;
    ImageView remove_salad;
    ImageView add_soup;
    ImageView remove_soup;
    ImageView add_soup2;
    ImageView remove_soup2;

    TextView textView;
    Button button;



    String food;
    Integer cijena;
    Integer brojac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meni);
        arrow =  findViewById(R.id.arrow);
        home = findViewById(R.id.home);
        menu = findViewById(R.id.menu);

        add_pizza = (ImageView) findViewById(R.id.add_pizza);
//        remove_pizza = (ImageView) findViewById(R.id.remove_pizza);
        add_pasta = (ImageView) findViewById(R.id.add_pasta);
        //remove_pasta = (ImageView) findViewById(R.id.remove_pasta);
        add_pasta2 = (ImageView) findViewById(R.id.add_pasta2);
        //remove_pasta2 = (ImageView) findViewById(R.id.remove_pasta2);
        add_pasta3 = (ImageView) findViewById(R.id.add_pasta3);
        //remove_pasta3 = (ImageView) findViewById(R.id.remove_pasta3);
        add_pasta4 = (ImageView) findViewById(R.id.add_pasta4);
        //remove_pasta4 = (ImageView) findViewById(R.id.remove_pasta4);
        add_hamburger = (ImageView) findViewById(R.id.add_hamburger);
        //remove_hamburger = (ImageView) findViewById(R.id.remove_hamburger);
        add_salad = (ImageView) findViewById(R.id.add_salad);
        //remove_salad = (ImageView) findViewById(R.id.remove_salad);
        add_soup = (ImageView) findViewById(R.id.add_soup);
        //remove_soup = (ImageView) findViewById(R.id.remove_soup);
        add_soup2 = (ImageView) findViewById(R.id.add_soup2);
        //remove_soup2 = (ImageView) findViewById(R.id.remove_soup2);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);


        cijena = 0;
        brojac = 0;
        food = "";




        View.OnClickListener listener_pizza1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(!food.isEmpty()){
                cijena += 4;
                brojac++;
                food += ", Pizza";
                textView.setText(+ cijena + food+ brojac);
            }
            else{
                cijena += 4;
                brojac++;
                food += "Pizza";
                textView.setText(+ cijena + food+ brojac);            }
            }
        };
        add_pizza.setOnClickListener(listener_pizza1);

        View.OnClickListener listener_pasta1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 7;
                    brojac++;
                    food += ", Fettuccine Alfredo";
                    textView.setText(+ cijena + food+ brojac);                }
                else{
                    cijena += 7;
                    brojac++;
                    food += "Fettuccine Alfredo";
                    textView.setText(+ cijena + food+ brojac);                }
            }
        };
        add_pasta.setOnClickListener(listener_pasta1);


        View.OnClickListener listener_pasta2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 7;
                    brojac++;
                    food += ", Tomato Bacon Pasta";
                }
                else{
                    cijena += 7;
                    brojac++;
                    food += "Tomato Bacon Pasta";
                }
            }
        };
        add_pasta2.setOnClickListener(listener_pasta2);

        View.OnClickListener listener_pasta3 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 8;
                    brojac++;
                    food += ", Tortelini";
                }
                else{
                    cijena += 8;
                    brojac++;
                    food += "Tortelini";
                }
            }
        };
        add_pasta3.setOnClickListener(listener_pasta3);

        View.OnClickListener listener_pasta4 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 7;
                    brojac++;
                    food += ", Pesto Pasta";
                }
                else{
                    cijena += 7;
                    brojac++;
                    food += "Pesto Pasta";
                }
            }
        };
        add_pasta4.setOnClickListener(listener_pasta4);

        View.OnClickListener listener_hamburger = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 9;
                    brojac++;
                    food += ", Hamburger";
                }
                else{
                    cijena += 9;
                    brojac++;
                    food += "Hamburger";
                }
            }
        };
        add_hamburger.setOnClickListener(listener_hamburger);

        View.OnClickListener listener_salad = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 6;
                    brojac++;
                    food += ", Salata";
                }
                else{
                    cijena += 6;
                    brojac++;
                    food += "Salata";
                }
            }
        };
        add_salad.setOnClickListener(listener_salad);

        View.OnClickListener listener_soup = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 5;
                    brojac++;
                    food += ", Juha od rajčica";
                }
                else{
                    cijena += 5;
                    brojac++;
                    food += "Juha od rajčica";
                }
            }
        };
        add_soup.setOnClickListener(listener_soup);

        View.OnClickListener listener_soup2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!food.isEmpty()){
                    cijena += 6;
                    brojac++;
                    food += ", Goveća juha";
                }
                else{
                    cijena += 6;
                    brojac++;
                    food += "Goveća juha";
                }
            }
        };
        add_soup2.setOnClickListener(listener_soup2);
        View.OnClickListener button1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(meni.this, MainActivity3.class);
                startActivity(intent);
                Toast.makeText(meni.this, "Vaša narudžba je poslana.", Toast.LENGTH_LONG).show();
            }
        };
        button.setOnClickListener(button1);


//        View.OnClickListener listener_pizza2 = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                cijena += 7;
//                brojac += 1;
//
//            }
//        };
//        remove_pizza.setOnClickListener(listener_pizza2);




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        View.OnClickListener arrow_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(meni.this, MainActivity.class);
                startActivity(intent);
            }
        };
        arrow.setOnClickListener(arrow_listener);

        View.OnClickListener home_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(meni.this, MainActivity2.class);
                startActivity(intent);
            }
        };
        home.setOnClickListener(home_listener);

        View.OnClickListener menu_listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(meni.this, meni.class);
                startActivity(intent);
                Toast.makeText(meni.this, "Dobrodošli u meni! Izaberite što vam se sviđa a mi ćemo vam izraćunati cijenu:)", Toast.LENGTH_LONG).show();

            }
        };
        menu.setOnClickListener(menu_listener);
    }
}