package singleton;

public class ServicioBancario {
    public static void main(String[] args) {
        ServicioBancarioSingleton servicio = ServicioBancarioSingleton.getInstance();
        servicio.conectar();
        int saldo = servicio.obtenerSaldoCliente();
        String nombre = servicio.obtenerNombreCliente();
        System.out.println("El saldo de " + nombre +" es de un total de: $" + saldo);
    }
}
