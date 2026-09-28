package br.pucgoias.ads.delivery.excecao;

public class ItemIndisponivelException extends RuntimeException {

    public ItemIndisponivelException(String codigo) {
        super("Item inexistente ou indisponivel: " + codigo);
    }
}
