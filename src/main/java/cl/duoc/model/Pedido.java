package cl.duoc.model;
import cl.duoc.util.Cancelable;

public abstract class Pedido {
    protected int id;
    protected String cliente;
    protected String direccion;
    protected String repartidor;

    public Pedido(int id, String cliente, String direccion, String repartidor) {
        this.id = id;
        this.cliente = cliente;
        this.direccion = direccion;
        this.repartidor = repartidor;
    }

    public abstract int calcularTiempoEntrega();

    public abstract void asignarRepartidor();


    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
        System.out.println("Repartidor asignado manualmente: " + nombre);
    }

    public void mostrarResumen() {
        System.out.println("----- RESUMEN DEL PEDIDO -----");
        System.out.println("ID: " + id);
        System.out.println("Cliente: " + cliente);
        System.out.println("Dirección: " + direccion);
        System.out.println("Repartidor: " + repartidor);
        System.out.println("Tiempo estimado: "
                + calcularTiempoEntrega() + " minutos");
    }


    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRepartidor() {
        return repartidor;
    }
}