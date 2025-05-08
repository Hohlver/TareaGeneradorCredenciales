public class CredencialPrototype implements Cloneable {
    private String nombre;
    private String cargo;
    private String rut;

    public CredencialPrototype(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

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
}
