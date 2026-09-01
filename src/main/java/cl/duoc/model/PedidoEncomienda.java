package cl.duoc.model;

import cl.duoc.util.Cancelable;
import cl.duoc.util.Despachable;
import cl.duoc.util.Rastreable;

public class PedidoEncomienda extends Pedido implements Cancelable, Despachable, Rastreable {

    private double peso;

    public PedidoEncomienda(int id, String cliente, String direccion,
                            String repartidor, double peso) {

        super(id, cliente, direccion, repartidor);
        this.peso = peso;
    }

    @Override
    public int calcularTiempoEntrega() {
        if (peso > 10) {
            return 60;
        }
        return 45;
    }


    @Override
    public void asignarRepartidor() {
        repartidor = "delivery repartidor: ";
        System.out.println("Repartidor asignado: "  + repartidor);
    }

    @Override
    public void despachar() {
        System.out.println("Encomienda numero" + id + " despachada");
    }

    @Override
    public void cancelar() {
        System.out.println("Encomienda numero:" + id + " cancelada");
    }

    @Override
    public void verHistorial() {
        System.out.println("Encomienda numero" + id  + ": entregada correctamente");
    }

}
