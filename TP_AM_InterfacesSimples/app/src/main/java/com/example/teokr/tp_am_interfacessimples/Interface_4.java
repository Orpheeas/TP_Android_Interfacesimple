package com.example.teokr.tp_am_interfacessimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Interface_4 extends AppCompatActivity {

    private final String  NAME="NOM";
    private final String  SURNAME="PRENOM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_4);

        final TextView nom_int4 = (TextView) findViewById(R.id.Int4_nom);
        final TextView prenom_int4 = (TextView) findViewById(R.id.Int4_prenom);

        Intent recintent2 = getIntent();
        nom_int4.setText(recintent2.getStringExtra(NAME));
        prenom_int4.setText(recintent2.getStringExtra(SURNAME));

        Button Int4_Hand = (Button)findViewById(R.id.Int4_hand);
        Button Int4_Golf = (Button)findViewById(R.id.Int4_golf);
        Button Int4_Rugby = (Button)findViewById(R.id.Int4_rugby);
        Button Int4_acc = (Button)findViewById(R.id.Int4_acc);

        Int4_Hand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int4_IntH = new Intent(Interface_4.this, Interface_H.class);
                Int4_IntH.putExtra(NAME, nom_int4.getText().toString());
                Int4_IntH.putExtra(SURNAME, prenom_int4.getText().toString());
                //On demarre la seconde interface
                startActivity(Int4_IntH);
            }
        });

        Int4_Golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int4_IntG = new Intent(Interface_4.this, Interface_G.class);
                Int4_IntG.putExtra(NAME, nom_int4.getText().toString());
                Int4_IntG.putExtra(SURNAME, prenom_int4.getText().toString());
                //On demarre la seconde interface
                startActivity(Int4_IntG);
            }
        });

        Int4_Rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int4_IntR = new Intent(Interface_4.this, Interface_R.class);
                Int4_IntR.putExtra(NAME, nom_int4.getText().toString());
                Int4_IntR.putExtra(SURNAME, prenom_int4.getText().toString());
                //On demarre la seconde interface
                startActivity(Int4_IntR);
            }
        });

        Int4_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int4_Int1 = new Intent(Interface_4.this, Interface_1.class);
                //On demarre la seconde interface
                startActivity(Int4_Int1);
            }
        });

    }
}
