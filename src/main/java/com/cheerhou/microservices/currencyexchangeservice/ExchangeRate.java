package com.cheerhou.microservices.currencyexchangeservice;

import java.math.BigDecimal;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/30
 */
public class ExchangeRate {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public ExchangeRate() {
    }

    public ExchangeRate(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
