package codeSmellMetodosLargos;

import codeSmellMetodosLargos.dao.PedidoDAO;
import codeSmellMetodosLargos.enumeracion.EstadoItem;
import codeSmellMetodosLargos.externo.Notificador;
import codeSmellMetodosLargos.negocio.ItemPedido;
import codeSmellMetodosLargos.negocio.Pedido;
import codeSmellMetodosLargos.negocio.Producto;

public class PedidoService {

    public void procesarPedido(Pedido pedido) {
        validarPedido(pedido);
        procesarItemsDelPedido(pedido);
        PedidoDAO.actualizar(pedido);
        Notificador.notificarPedidoProcesado(pedido.getCliente());
    }

    private void procesarItemsDelPedido(Pedido pedido) {
        for (ItemPedido item : pedido.getItems()) {
            Producto producto = item.getProducto();
            if (producto.getStock() >= item.getCantidad()) {
                producto.descontarStock(item.getCantidad());
                item.setEstado(EstadoItem.PROCESADO);
            } else {
                item.setEstado(EstadoItem.SIN_STOCK);
            }
        }
    }

    private void validarPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("El pedido no puede ser nulo");
        }
        if (pedido.getItems().isEmpty()) {
            throw new IllegalArgumentException("El pedido no tiene items");
        }
    }
}
