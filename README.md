## Generador de Credenciales de Evento

### Estudiante: Ethan Nienhuser V.

## Patrón Prototype – Aplicación:
    public CredencialPrototype clone() {
        try {
            return (CredencialPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Credencial createCredencial() {
        return new Credencial(nombre, cargo, rut);
    }
## Patrón Singleton – Aplicación:
    private CredencialSingleton() {}

    public static CredencialSingleton getInstancia() {
        if (instancia == null) {
            instancia = new CredencialSingleton();
        }
        return instancia;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
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


