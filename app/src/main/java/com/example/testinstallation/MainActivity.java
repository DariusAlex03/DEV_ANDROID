package com.example.testinstallation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = this.findViewById(R.id.button_affiche_ok);
        final TextView affichage = (TextView) this.findViewById(R.id.tv_affichage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                affichage.setText(R.string.mess_after_click_ok);
            }
        });



        Log.i("information", "Farida va vous afficher une information géenérale");
        Log.d("information", "Farida va vous afficher une information pour le debbogage");
        Log.w("information", "Farida va vous afficher une information de warning");
        Log.e("information", "Farida va vous afficher une erreur");
    }
}