package com.invoice.invoiceservices.exception;

public class InvoiceNotFoundException extends RuntimeException{
	 private String message;
	    public InvoiceNotFoundException(String message) {
	        super(message);
	        this.message = message;
	    }
	    public InvoiceNotFoundException() {
	    }
}
