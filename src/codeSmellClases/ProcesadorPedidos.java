package codeSmellClases;

import codeSmellMetodosLargos.negocio.Pedido;

public class ProcesadorPedidos {

    //relaciones de las clases.
    private Notificador notificador;
    private Reporte reporte;

    public ProcesadorPedidos(Notificador notificador) {
        this.notificador = notificador;
    }

    // Métodos para procesar pedidos
    public void procesarPedido(Pedido pedido) {
        // Lógica para procesar el pedido
    }

    public void setReporte(Reporte reporte){
        this.reporte = reporte;
    }
}
