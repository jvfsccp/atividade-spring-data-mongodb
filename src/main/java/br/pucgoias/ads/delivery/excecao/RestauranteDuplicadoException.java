package br.pucgoias.ads.delivery.excecao;

public class RestauranteDuplicadoException extends RuntimeException {

    public RestauranteDuplicadoException(String nome) {
        super("Ja existe restaurante com o nome: " + nome);
    }
}
