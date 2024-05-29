package com.microservices.order.dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, BigDecimal price, Integer quantity) {
}