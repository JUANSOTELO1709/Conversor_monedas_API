package org.example;

import java.util.Scanner;

public class ConvertirMoneda {

    public static String convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, double cantidad) {
        // Consultar las tasas de conversión
        Moneda monedas = consulta.buscarMonedas(monedaBase);

        // Obtener la tasa de conversión de la moneda base a la moneda destino
        Double tasaConversion = monedas.getConversionRate(monedaTarget);
        if (tasaConversion != null) {
            // Realizar la conversión
            double cantidadConvertida = cantidad * tasaConversion;
            return cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedaTarget + "\n" +
                    "La tasa de conversión de " + monedaBase + " a " + monedaTarget + " es: " + tasaConversion;
        } else {
            return "La tasa de conversión para " + monedaTarget + " no está disponible.";
        }
    }
}
