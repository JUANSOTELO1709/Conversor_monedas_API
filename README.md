# 🌍💱 Conversor de Monedas 💱🌍

Este proyecto es una aplicación de escritorio simple para convertir diferentes monedas utilizando Java Swing para la interfaz gráfica de usuario (GUI). La aplicación permite seleccionar monedas, ingresar una cantidad y realizar la conversión utilizando tasas de conversión predefinidas.

## 🛠️ Requisitos

- **Java 11** o superior
- **Maven** para la gestión de dependencias y construcción del proyecto

## 📥 Instalación

1. Clona el repositorio a tu máquina local:
    ```bash
    git clone https://github.com/tu-usuario/conversor-monedas.git
    cd conversor-monedas
    ```

2. Compila y empaqueta el proyecto utilizando Maven:
    ```bash
    mvn clean package
    ```

## 🚀 Ejecución

1. Ejecuta la aplicación desde la línea de comandos:
    ```bash
    java -jar target/conversor-monedas-1.0-SNAPSHOT.jar
    ```

## 📂 Estructura del Proyecto

El proyecto contiene las siguientes clases principales:

- `Main`: La clase principal que inicializa la interfaz gráfica y gestiona las interacciones del usuario.
- `ConvertirMoneda`: Clase que maneja la lógica de conversión de monedas.
- `ConsultarMoneda`: Clase que simula la consulta de tasas de conversión.
- `Moneda`: Clase que representa las diferentes monedas y sus tasas de conversión.

## 📄 Archivo pom.xml

El archivo `pom.xml` incluye las configuraciones necesarias para compilar y ejecutar el proyecto con Java 11.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://www.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>conversor-monedas</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.9</version>
        </dependency>
    </dependencies>
</project>
