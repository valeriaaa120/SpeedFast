package cl.duoc.app;


import cl.duoc.model.Pedido;
import cl.duoc.model.PedidoComida;
import cl.duoc.model.PedidoEncomienda;
import cl.duoc.model.PedidoExpress;
import cl.duoc.util.Cancelable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        PedidoComida comida = new PedidoComida(787,"valeria muñoz", "reñaca 123", "miguel sanchez" );

        PedidoEncomienda encomienda = new PedidoEncomienda(234, "manuel astorga", "miraflores 552", "marisol ibañez", 8);

        PedidoExpress express = new PedidoExpress(675, "gerardo sevilla", "rosedal 67", "martina muñoz");


        //pedido de comida:
        System.out.println("PEDIDO COMIDA");

        comida.asignarRepartidor("jose francisco");

        System.out.println("Pedido numero: " + comida.getId());
        System.out.println("Dirección: " + comida.getDireccion());
        System.out.println("Tiempo estimado: "+ comida.calcularTiempoEntrega() + " minutos");

        comida.despachar();

        //pedido de encomienda:
        System.out.println("\n PEDIDO ENCOMIENDA");

        encomienda.asignarRepartidor("Daniela Muñoz");

        System.out.println("Pedido:" + encomienda.getId());
        System.out.println("Dirección: " + encomienda.getDireccion());
        System.out.println("Tiempo estimado: " + encomienda.calcularTiempoEntrega() + " minutos");

        encomienda.despachar();

        //pedido express:
        System.out.println("\n PEDIDO EXPRESS");

        express.asignarRepartidor("martina");

        System.out.println("Pedido:" + express.getId());
        System.out.println("Dirección: " + express.getDireccion());
        System.out.println("Tiempo estimado: " + express.calcularTiempoEntrega() + " minutos");

//si lo cancela:

        System.out.println("\n pedido cancelado" + express.getId() + "...");

        express.cancelar();

//historial:
        System.out.println("\nHistorial:");

        ArrayList<Pedido> historial = new ArrayList<>();

        historial.add(comida);
        historial.add(encomienda);

        for (Pedido pedido : historial) {
            System.out.println("- " + pedido.getClass().getSimpleName() + " numero: " + pedido.getId()  + " – entregado por " + pedido.getRepartidor());
        }



    }
}