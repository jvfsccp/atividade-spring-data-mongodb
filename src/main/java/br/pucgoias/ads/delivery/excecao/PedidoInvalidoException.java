package br.pucgoias.ads.delivery.excecao;

public class PedidoInvalidoException extends RuntimeException {

    public PedidoInvalidoException(String motivo) {
        super("Pedido invalido: " + motivo);
    }
}
