package com.cheerhou.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeRateRepo repo;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeRate retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeRate exchangeRate = repo.findByFromAndTo(from, to);

        //读取配置文件中的port参数
        exchangeRate.setPort(
                Integer.parseInt(environment.getProperty("local.server.port"))
        );
        return exchangeRate;
    }
}
