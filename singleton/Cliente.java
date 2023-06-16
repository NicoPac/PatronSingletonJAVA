package singleton;

public class Cliente {
    private String nombre;
    private String apellido;
    private int saldo;

    public Cliente(String nombre, String apellido, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getSaldo() {
        return saldo;
    }
}
