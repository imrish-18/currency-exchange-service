package com.currency.exchange;

import java.math.BigDecimal;

public class ExchangeValue 
{
    private Long id;
    private BigDecimal conversionMultiple;
	private String from;
   private String to;
   public ExchangeValue()
   {	   
   }
  public ExchangeValue(Long id, String to, String from, BigDecimal conversionMultiple) {
	super();
	this.id = id;
	this.conversionMultiple = conversionMultiple;
	this.from = from;
	this.to = to;
}
public Long getId() {
	return id;
}
public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}
public String getFrom() {
	return from;
}
public String getTo() {
	return to;
}
   
   
}
