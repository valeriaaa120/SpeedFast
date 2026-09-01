package cl.duoc.model;

import cl.duoc.util.Cancelable;
import cl.duoc.util.Despachable;
import cl.duoc.util.Rastreable;

public class PedidoComida extends Pedido implements Cancelable, Rastreable, Despachable {

    private String restaurante;

    public PedidoComida(int id, String cliente, String direccion, String repartidor) {
        super(id, cliente, direccion, repartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 60;
    }

    @Override
    public void asignarRepartidor() {
        repartidor = "delivery repartidor: ";
        System.out.println("Repartidor asignado: "  + repartidor);

    }
    @Override
    public void cancelar() {
        System.out.println("Pedido de comida numero" + id + " cancelado");
    }

    @Override
    public void verHistorial() {
        System.out.println("Pedido de comida numero" + id + ": entregado correctamente.");
    }

    @Override
    public void despachar() {
        System.out.println("Pedido de comida numero " + id + " despachado");
    }
}



