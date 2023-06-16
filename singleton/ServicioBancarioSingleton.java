package singleton;

public class ServicioBancarioSingleton {
    private static ServicioBancarioSingleton instancia;
    private Cliente cliente;

    private ServicioBancarioSingleton() {
        // Aquí puedes inicializar cualquier configuración necesaria.
        cliente = new Cliente("Mariano", "Perez", 300);
    }

    public static ServicioBancarioSingleton getInstance() {
        if (instancia == null) {
            synchronized (ServicioBancarioSingleton.class) {
                if (instancia == null) {
                    instancia = new ServicioBancarioSingleton();
                }
            }
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conexión establecida.");
    }

    public int obtenerSaldoCliente() {
        return cliente.getSaldo();
    }

    public String obtenerNombreCliente() {
    return cliente.getNombre();
}
}
