package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private ConsultarMoneda consultar = new ConsultarMoneda();
    private JTextField cantidadField; // Declara cantidadField como una variable de instancia
    private JTextArea resultadoArea;
    private JComboBox<String> comboBox;

    public Main() {
        setTitle("Conversor de Monedas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el menú
        String[] opciones = {
                "MXN => USD",
                "USD => MXN",
                "BRL => USD",
                "USD => BRL",
                "USD => COL",
                "COL => USD",
                "ARG => USD",
                "USD => ARG",
                "Salir"
        };

        comboBox = new JComboBox<>(opciones);
        cantidadField = new JTextField(10); // Inicializa cantidadField
        JButton botonConvertir = new JButton("Convertir");
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        // Añadir componentes a la ventana
        JPanel panel = new JPanel();
        panel.add(new JLabel("Seleccione la divisa:"));
        panel.add(comboBox);
        panel.add(new JLabel("Cantidad:"));
        panel.add(cantidadField);
        panel.add(botonConvertir);
        panel.add(new JScrollPane(resultadoArea));

        add(panel);

        // Acción del botón Convertir
        botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = comboBox.getSelectedIndex() + 1;
                String cantidadTexto = cantidadField.getText();
                double cantidad = 0;
                try {
                    cantidad = Double.parseDouble(cantidadTexto);
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor, ingrese una cantidad válida.");
                    return;
                }

                String resultado = "";
                switch (opcion) {
                    case 1:
                        resultado = convertir("MXN", "USD", cantidad);
                        break;
                    case 2:
                        resultado = convertir("USD", "MXN", cantidad);
                        break;
                    case 3:
                        resultado = convertir("BRL", "USD", cantidad);
                        break;
                    case 4:
                        resultado = convertir("USD", "BRL", cantidad);
                        break;
                    case 5:
                        resultado = convertir("USD", "COP", cantidad);
                        break;
                    case 6:
                        resultado = convertir("COP", "USD", cantidad);
                        break;
                    case 7:
                        resultado = convertir("ARS", "USD", cantidad);
                        break;
                    case 8:
                        resultado = convertir("USD", "ARS", cantidad);
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    default:
                        resultado = "Opción no válida.";
                }
                mostrarResultado(resultado);
            }
        });
    }

    private void mostrarResultado(String resultado) {
        // Crear una nueva ventana para mostrar el resultado
        JFrame resultadoVentana = new JFrame("Resultado de la Conversión");
        resultadoVentana.setSize(300, 200);
        resultadoVentana.setLocationRelativeTo(null);

        JTextArea resultadoTexto = new JTextArea(resultado);
        resultadoTexto.setEditable(false);
        resultadoTexto.setLineWrap(true);
        resultadoTexto.setWrapStyleWord(true);

        JButton botonReiniciar = new JButton("Reiniciar");
        JButton botonCerrar = new JButton("Cerrar");

        botonReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadField.setText(""); // Reinicia el campo de texto de cantidad
                resultadoArea.setText(""); // Reinicia el área de resultados
                resultadoVentana.dispose(); // Cierra la ventana de resultados
            }
        });

        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Cierra el programa
            }
        });

        JPanel resultadoPanel = new JPanel();
        resultadoPanel.setLayout(new BoxLayout(resultadoPanel, BoxLayout.Y_AXIS));
        resultadoPanel.add(new JScrollPane(resultadoTexto));
        resultadoPanel.add(botonReiniciar);
        resultadoPanel.add(botonCerrar);

        resultadoVentana.add(resultadoPanel);
        resultadoVentana.setVisible(true);
    }

    private String convertir(String monedaBase, String monedaTarget, double cantidad) {
        // Crear un objeto ConsultarMoneda y llamar al método convertir
        ConsultarMoneda consulta = new ConsultarMoneda();
        return ConvertirMoneda.convertir(monedaBase, monedaTarget, consulta, cantidad);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main ventana = new Main();
            ventana.setVisible(true);
        });
    }
}
