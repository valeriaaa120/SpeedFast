package cl.duoc.model;
import cl.duoc.util.Rastreable;

import java.util.ArrayList;

public class ControladorDeEnvios implements Rastreable {

    private ArrayList<Pedido> historial;

    public ControladorDeEnvios() {
        historial = new ArrayList<>();
    }

    public void agregarEntrega(Pedido pedido) {
        historial.add(pedido);
    }


    @Override
    public void verHistorial() {
        System.out.println("\n HISTORIAL DE ENTREGAS: ");

        if (historial.isEmpty()) {
            System.out.println("No hay entregas registradas.");
            return;
        }

        for (Pedido pedido : historial) {
            System.out.println(
                    "Pedido numero" + pedido.getId()
                            + " | Cliente: " + pedido.getCliente()
                            + " | Tipo: " + pedido.getClass().getSimpleName()
                            + " | Repartidor: " + pedido.getRepartidor()
            );
        }
    }
}


