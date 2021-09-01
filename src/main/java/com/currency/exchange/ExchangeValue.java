package com.currency.exchange;

import java.math.BigDecimal;

public class ExchangeValue 
{
    private Long id;
    private BigDecimal conversionMultiple;
	private String from;
   private String to;
   private int port;
  
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public void setId(Long id) {
	this.id = id;
}
public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}
public void setFrom(String from) {
	this.from = from;
}
public void setTo(String to) {
	this.to = to;
}
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