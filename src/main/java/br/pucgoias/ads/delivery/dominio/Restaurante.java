package br.pucgoias.ads.delivery.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Raiz do agregado Restaurante. O cardapio e o endereco sao incorporados:
 * sao lidos e gravados sempre em conjunto com o restaurante.
 */
@Document(collection = "restaurantes")
public class Restaurante {

    @Id
    private String id;

    @Indexed(unique = true)
    private String nome;

    private String categoria;

    private Endereco endereco;

    private List<ItemCardapio> cardapio = new ArrayList<>();

    protected Restaurante() {
    }

    public Restaurante(String nome, String categoria, Endereco endereco) {
        this.nome = nome;
        this.categoria = categoria;
        this.endereco = endereco;
    }

    public void incluirNoCardapio(ItemCardapio item) {
        cardapio.add(item);
    }

    public Optional<ItemCardapio> buscarItem(String codigo) {
        return cardapio.stream().filter(i -> i.codigo().equals(codigo)).findFirst();
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public Endereco getEndereco() { return endereco; }
    public List<ItemCardapio> getCardapio() { return List.copyOf(cardapio); }
}
