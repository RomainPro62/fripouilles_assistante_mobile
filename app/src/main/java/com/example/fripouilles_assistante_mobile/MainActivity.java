package com.example.fripouilles_assistante_mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editTextHeureDebut, editTextHeureArrivee, editTextRepas, editTextFrais;
    Button buttonEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHeureDebut = findViewById(R.id.editTextTextHeureDebut);
        editTextHeureArrivee = findViewById(R.id.editTextHeureArrivee);
        editTextRepas = findViewById(R.id.editTextRepas);
        editTextFrais = findViewById(R.id.editTextFrais);
        buttonEnvoyer = findViewById(R.id.buttonEnvoyer);

        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heureDebut = editTextHeureDebut.getText().toString();
                String heureArrivee = editTextHeureArrivee.getText().toString();
                String repas = editTextRepas.getText().toString();
                String frais = editTextFrais.getText().toString();

                if (heureArrivee.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir l'heure d'arrivée.", Toast.LENGTH_SHORT).show();
                } else if (heureDebut.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir l'heure de début.", Toast.LENGTH_SHORT).show();
                } else if (repas.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir le nombre de repas.", Toast.LENGTH_SHORT).show();
                } else if (frais.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Veuillez saisir le montant des frais.", Toast.LENGTH_SHORT).show();
                } else {
                    // Code pour enregistrer les données
                    Toast.makeText(getApplicationContext(), "Données enregistrées avec succès.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}