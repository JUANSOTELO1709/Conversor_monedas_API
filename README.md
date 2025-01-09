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

## 🔑 Configuración de la API KEY 

1. Crea tu API KEY en [Example Exchange Rates API](https://example.com/api-key)
2. Una vez que tengas tu API KEY, añádela al archivo de configuración en el proyecto


## 🚀 Ejecución

# 🌍💱 Conversor de Monedas 💱🌍

Este proyecto es una aplicación de escritorio simple para convertir diferentes monedas utilizando Java Swing para la interfaz gráfica de usuario (GUI). La aplicación permite seleccionar monedas, ingresar una cantidad y realizar la conversión utilizando tasas de conversión predefinidas.

## 🛠️ Requisitos

- **Java 11** o superior
- **Maven** para la gestión de dependencias y construcción del proyecto
- **API KEY** de [ExchangeRate-API](https://www.exchangerate-api.com)

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

## 🔑 Configuración de la API KEY

1. Crea tu API KEY en [ExchangeRate-API](https://www.exchangerate-api.com).
2. Una vez que tengas tu API KEY, añádela al archivo de configuración en el proyecto "ConsultarMonedas.java".

    ```properties

    public Moneda buscarMonedas(String monedaBase) {
        // URL de la API con la clave API y la moneda base
        URI direccion = URI.create("___Agrega tu API KEY___" + monedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

    ```

## 🚀 Ejecución

1. Ejecuta la aplicación desde la línea de comandos:
    ```bash
    java -jar target/conversor-monedas-1.0-SNAPSHOT.jar
    ```
    Al ejecutar el programa aparecerá una ventana similar a la siguiente:
    ![conversor de monedas](https://github.com/user-attachments/assets/36b4797b-7843-4b38-932e-3662acef22dd)

    Tal como se puede observar, existe la posibilidad de ver una subdivisión de menú desplegándose:

    ![menu del conversor](https://github.com/user-attachments/assets/89351835-4e23-4b46-9092-e071aa769183)

    Y tal como se podrá ver el resultado del día 09/01/2025:

    ![Resultado conversor](https://github.com/user-attachments/assets/05ccd11f-1d14-4218-8726-5abdf8115858)

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
