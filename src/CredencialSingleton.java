public class CredencialSingleton {
    private static CredencialSingleton instancia;
    private String atributo;

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
}
