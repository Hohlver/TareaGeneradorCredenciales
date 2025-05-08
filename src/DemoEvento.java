import java.util.Scanner;

public class DemoEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CredencialManager manager = new CredencialManager();
        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Agregar nueva credencial");
            System.out.println("2. Ver credenciales generadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Ingrese el RUT: ");
                    String rut = scanner.nextLine();
                    manager.agregarCredencial(nombre, cargo, rut);
                    break;
                case 2:
                    manager.mostrarCredenciales();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
