package com.cheerhou.microservices.currencyexchangeservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/30
 */
@RestController
public class CurrencyExchangeController {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeRate retrieveExchangeValue(@PathVariable String from, @PathVariable String to)  {
        return new ExchangeRate(1000L, from, to, BigDecimal.valueOf(65));
    }
}
