package com.example.teokr.tp_am_interfacessimples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

/**
 * Created by teokr on 22/11/2017.
 */

public class Interface_2 extends AppCompatActivity{
    private Button Int2_button;
    private RadioButton Int2_Rb_h;
    private RadioButton Int2_Rb_f;
    private EditText    Int2_name;
    private EditText    Int2_surname;
    private EditText    Int2_born;
    private EditText    Int2_email;
    private EditText    Int2_adr;
    private EditText    Int2_comm;
    private final String  NAME="NOM";
    private final String  SURNAME="PRENOM";
    private final String  BORN="DATE";
    private final String  MAIL="MAIL";
    private final String  ADR="ADR";
    private final String  COMM="COMM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_2);

        // On prepare notre boutton pour le onclick ainsi que nos edit text pour les passer à l'activité suivante

        Button Int2_mybutton = (Button)findViewById(R.id.Int2_valider);
        final EditText nom = (EditText)findViewById(R.id.Int2_Name);
        final EditText prenom = (EditText)findViewById(R.id.Int2_Surname);
        final EditText born = (EditText)findViewById(R.id.Int2_naissance);
        final EditText mail = (EditText)findViewById(R.id.Int2_email);
        final EditText adr = (EditText)findViewById(R.id.Int2_Name);
        final EditText comm = (EditText)findViewById(R.id.Int2_comm);

        // Quand on clic sur notre bouton on passe à la seconde interface
        Int2_mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int2_Int3 = new Intent(Interface_2.this, Interface_3.class);
                Int2_Int3.putExtra(NAME, nom.getText().toString());
                Int2_Int3.putExtra(SURNAME, prenom.getText().toString());
                Int2_Int3.putExtra(BORN, born.getText().toString());
                Int2_Int3.putExtra(MAIL, mail.getText().toString());
                Int2_Int3.putExtra(ADR, adr.getText().toString());
                Int2_Int3.putExtra(COMM,comm.getText().toString());
                //On demarre la seconde interface
                startActivity(Int2_Int3);
            }
        });
    }
}



