package com.invoice.invoiceservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.invoice.invoiceservices.model.Invoice;
import com.invoice.invoiceservices.service.InvoiceService;

@SpringBootTest
public class SaveInvoiceTest {
	@Autowired
	InvoiceService invoiceService;

	@Test
	void testSaveInvoice() {
		// test data
		Invoice invoice = new Invoice();
		invoice.setId(1);
		invoice.setClient("Mark");
		invoice.setVatRate(1000L);
		invoice.setInvoiceDate(new java.util.Date(2022, 01, 13));

		// service call
		String message = invoiceService.saveInvoice(invoice);
		
		
		// assertions
		assertEquals(message, "invoice saved...");
		

	}

}
