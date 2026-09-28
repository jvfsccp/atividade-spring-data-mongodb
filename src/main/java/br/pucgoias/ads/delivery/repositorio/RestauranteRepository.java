package br.pucgoias.ads.delivery.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.pucgoias.ads.delivery.dominio.Restaurante;

public interface RestauranteRepository extends MongoRepository<Restaurante, String> {

    List<Restaurante> findByCategoriaIgnoreCase(String categoria);

    // Consulta sobre campo de objeto incorporado: { "endereco.bairro": ?0 }
    List<Restaurante> findByEnderecoBairro(String bairro);
}
