package br.pucgoias.ads.delivery.excecao;

public class ItemDuplicadoException extends RuntimeException {

    public ItemDuplicadoException(String codigo) {
        super("Codigo ja existente no cardapio: " + codigo);
    }
}
