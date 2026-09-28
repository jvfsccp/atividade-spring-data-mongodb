package br.pucgoias.ads.delivery.excecao;

public class RecursoNaoEncontradoException extends RuntimeException {

    public RecursoNaoEncontradoException(String recurso, String id) {
        super(recurso + " nao encontrado: " + id);
    }
}
