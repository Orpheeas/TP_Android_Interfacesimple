package com.example.teokr.tp_am_interfacessimples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Interface_1 extends AppCompatActivity {

    //Declaration des objet de l'interface
    private ImageView Int1_Img;
    private Button Int1_Buttton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_1);

        // On prepare notre boutton pour le onclick */
        Button Int1_mybutton = (Button)findViewById(R.id.Int1_startbutton);

        // Quand on clic sur notre bouton on passe à la seconde interface
        Int1_mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //On ecrit dans le log pour s'assurer de l'action effectuer
                Log.i("Interface 1","On passe à l'interface 2");

                //On cree notre intent pour que l'application sache ou elle doit se rendre
                Intent Int1_Int2 = new Intent(Interface_1.this, Interface_2.class);
                //On demarre la seconde interface
                startActivity(Int1_Int2);
            }
        });
    }
}
