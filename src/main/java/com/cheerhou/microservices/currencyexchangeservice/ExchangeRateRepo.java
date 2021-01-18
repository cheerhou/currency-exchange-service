package com.cheerhou.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hcj
 * @Description
 * @Date 2021/1/18
 */
public interface ExchangeRateRepo extends JpaRepository<ExchangeRate, Long> {
    ExchangeRate findByFromAndTo(String from, String to);
}
