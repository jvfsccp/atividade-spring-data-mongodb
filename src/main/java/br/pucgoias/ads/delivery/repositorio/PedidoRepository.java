package br.pucgoias.ads.delivery.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.pucgoias.ads.delivery.dominio.Pedido;
import br.pucgoias.ads.delivery.dominio.StatusPedido;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

    // { "restauranteId": ?0 } com ordenacao { "criadoEm": -1 }
    List<Pedido> findByRestauranteIdOrderByCriadoEmDesc(String restauranteId);

    // { "status": ?0 }
    List<Pedido> findByStatus(StatusPedido status);

    // Consulta sobre campo de objeto incorporado, escrita em JSON
    @Query("{ 'cliente.telefone': ?0 }")
    List<Pedido> buscarPorTelefoneDoCliente(String telefone);
}
