public class Credencial {
    private String nombre;
    private String cargo;
    private String rut;

    public Credencial(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}

