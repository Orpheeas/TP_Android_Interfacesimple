package com.example.teokr.tp_am_interfacessimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Interface_3 extends AppCompatActivity {
    private Button Int3_sport;
    private Button Int3_accueil;
    private final String  NAME="NOM";
    private final String  SURNAME="PRENOM";
    private final String  BORN="DATE";
    private final String  MAIL="MAIL";
    private final String  ADR="ADR";
    private final String  COMM="COMM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_3);


        final TextView nom = (TextView) findViewById(R.id.Int3_nom);
        final TextView prenom = (TextView) findViewById(R.id.Int3_prenom);
        final TextView born = (TextView) findViewById(R.id.Int3_naissance);
        final TextView email = (TextView) findViewById(R.id.Int3_mail);
        final TextView adresse = (TextView) findViewById(R.id.Int3_adr);
        final TextView comm = (TextView) findViewById(R.id.Int3_com);

        Intent recintent = getIntent();
        nom.setText(recintent.getStringExtra(NAME));
        prenom.setText(recintent.getStringExtra(SURNAME));
        born.setText(recintent.getStringExtra(BORN));
        email.setText(recintent.getStringExtra(MAIL));
        adresse.setText(recintent.getStringExtra(ADR));
        comm.setText(recintent.getStringExtra(COMM));

        Button Int3_Sportbutton = (Button)findViewById(R.id.Int3_sport);
        Button Int3_Accbutton = (Button)findViewById(R.id.Int3_acc);

        Int3_Sportbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int3_Int4 = new Intent(Interface_3.this, Interface_4.class);
                Int3_Int4.putExtra(NAME, nom.getText().toString());
                Int3_Int4.putExtra(SURNAME, prenom.getText().toString());
                //On demarre la seconde interface
                startActivity(Int3_Int4);
            }
        });

        Int3_Accbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int3_Int1 = new Intent(Interface_3.this, Interface_1.class);
                //On demarre la seconde interface
                startActivity(Int3_Int1);
            }
        });


    }


}
