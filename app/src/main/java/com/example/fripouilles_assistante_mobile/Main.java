package com.example.fripouilles_assistante_mobile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import com.google.gson.Gson;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        try {
            // Créer une URL pour le serveur PHP
            URL url = new URL("http://localhost/LesFripouilles/traitement.php");

            // Créer une connexion HttpURLConnection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json");

            // Créer un objet contenant les données à envoyer
            MyData data = new MyData("12:00", "14:00", "frites", "supplément mayo");

            // Encoder les données en JSON
            Gson gson = new Gson();
            String json = gson.toJson(data);

            // Envoyer les données encodées en JSON au serveur
            OutputStream os = conn.getOutputStream();
            byte[] input = json.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);

            // Récupérer la réponse du serveur
            int responseCode = conn.getResponseCode();
            System.out.println("Response Code : " + responseCode);

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
