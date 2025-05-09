## Generador de Credenciales de Evento

### Estudiante: Ethan Nienhuser V. – Patrones de Diseño (Sección 1)

## Patrón Prototype – Aplicación:
La clase 'CredencialPrototype' implementa la interfaz Cloneable, lo que permite la clonación de sus instancias.
```java
public class CredencialPrototype implements Cloneable {
    private String nombre;
    private String cargo;
    private String rut;
```

Luego se utiliza 'clone' para clonar la instancia actual de CredencialPrototype y 'super.clone()' para crear una copia de la instancia:

```java
    public CredencialPrototype clone() {
        try {
            return (CredencialPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
```
## Patrón Singleton – Aplicación:
La clase 'CredencialSingleton' implementa un atributo estático el cual mantiene la única instancia de la clase:
```java
public class CredencialSingleton {
    private static CredencialSingleton instancia;
```

Ademas implementa un constructor privado para evitar que otras clases instancien 'CredencialSingleton' directamente:
```java
    private CredencialSingleton() {}
```

Luego se utiliza el metodo 'getInstancia' que proporciona acceso a la instancia única de la clase. Si la instancia no existe, se crea una nueva:

```java
        public static CredencialSingletongetInstancia() {
        if (instancia == null) {
            instancia = new CredencialSingleton();
        }
        return instancia;
    }
```
## Diagrama UML:
![GeneradorCredenciales](https://github.com/user-attachments/assets/68d7cd31-1e27-4c52-a4ff-1072347770b6)

## Programa funcionando:
### Inicio
![Captura de pantalla 2025-05-08 185647](https://github.com/user-attachments/assets/7e3f1c5f-d6dd-4f7d-9bf2-92c02311d404)
### Agregar credencial
![Captura de pantalla 2025-05-08 185709](https://github.com/user-attachments/assets/21491cfb-c356-4de3-8a9d-c7e49d131cf0)
### Mostrar credencial
![Captura de pantalla 2025-05-08 185743](https://github.com/user-attachments/assets/a9ac8f01-7c59-4355-b9b3-298312c03581)
### Salir
![Captura de pantalla 2025-05-08 185818](https://github.com/user-attachments/assets/c425831a-aae2-408d-8406-7fdf7d9fe264)
### Opcion no valida
![Captura de pantalla 2025-05-08 185839](https://github.com/user-attachments/assets/e4bfc428-2f47-467b-8deb-ee1dbc343e57)


