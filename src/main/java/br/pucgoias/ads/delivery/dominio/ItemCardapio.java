package br.pucgoias.ads.delivery.dominio;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

/** Item do cardapio, incorporado ao documento do restaurante. */
public record ItemCardapio(
        String codigo,
        String nome,
        @Field(targetType = FieldType.DECIMAL128) BigDecimal preco,
        boolean disponivel) {
}
