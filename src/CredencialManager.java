import java.util.ArrayList;
import java.util.List;

public class CredencialManager {
    private List<Credencial> credenciales = new ArrayList<>();
    private CredencialPrototype plantilla;

    public CredencialManager() {
        plantilla = new CredencialPrototype("Nombre", "Cargo", "RUT");
    }

    public void agregarCredencial(String nombre, String cargo, String rut) {
        CredencialPrototype clon = plantilla.clone();
        clon.setNombre(nombre);
        clon.setCargo(cargo);
        clon.setRut(rut);
        credenciales.add(clon.createCredencial());
    }

    public void mostrarCredenciales() {
        for (Credencial credencial : credenciales) {
            System.out.println(credencial);
        }
    }
}
