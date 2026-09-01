package cl.duoc.model;

import cl.duoc.util.Cancelable;
import cl.duoc.util.Despachable;
import cl.duoc.util.Rastreable;

public class PedidoExpress extends Pedido  implements Despachable, Cancelable, Rastreable {


    public PedidoExpress(int id, String cliente, String direccion, String repartidor) {
        super(id, cliente, direccion, repartidor);
    }

    @Override
    public void asignarRepartidor() {
        repartidor = "Repartidor Express";
        System.out.println("Repartidor asignado automáticamente: " + repartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        return 10;
    }

    @Override
    public void despachar() {
        System.out.println("Pedido Express numero:" + id + " despachado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido Express numero:" + id + " cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Pedido Express numero:" + id + ": entregado correctamente.");
    }
}