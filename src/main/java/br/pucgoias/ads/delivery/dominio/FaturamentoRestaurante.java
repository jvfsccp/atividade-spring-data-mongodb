package br.pucgoias.ads.delivery.dominio;

import java.math.BigDecimal;

/** Projecao produzida pelo pipeline de agregacao de faturamento. */
public record FaturamentoRestaurante(String restauranteId, BigDecimal faturamento, long quantidadePedidos) {
}
