package br.pucgoias.ads.delivery.excecao;

import br.pucgoias.ads.delivery.dominio.StatusPedido;

public class TransicaoInvalidaException extends RuntimeException {

    public TransicaoInvalidaException(StatusPedido atual, String operacao) {
        super("Operacao '" + operacao + "' nao permitida no status " + atual);
    }
}
