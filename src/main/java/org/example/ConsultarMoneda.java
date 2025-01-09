package org.example;

import com.google.gson.Gson;
import java.net.URI;


import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Moneda buscarMonedas(String monedaBase) {
        // URL de la API con la clave API y la moneda base
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fb8d45a710a549658bd85d3c/latest/" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificar si la respuesta fue exitosa
            if (response.statusCode() == 200) {
                // Convertir la respuesta JSON a un objeto Moneda
                return new Gson().fromJson(response.body(), Moneda.class);
            } else {
                // Si la respuesta no es exitosa, lanzar un error
                throw new RuntimeException("Error en la API, código de respuesta: " + response.statusCode());
            }
        } catch (Exception e) {
            // Manejo de errores
            throw new RuntimeException("Error al hacer la solicitud HTTP: " + e.getMessage(), e);
        }
    }
}
