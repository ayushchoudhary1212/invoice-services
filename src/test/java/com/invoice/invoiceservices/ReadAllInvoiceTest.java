package com.invoice.invoiceservices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.invoice.invoiceservices.model.Invoice;
import com.invoice.invoiceservices.service.InvoiceService;

@SpringBootTest
public class ReadAllInvoiceTest {

	@Autowired
	InvoiceService invoiceService;

	@Test
	void testReadAllInvoices() {
		// test data 1
		Invoice invoice1 = new Invoice();
		invoice1.setId(1);
		invoice1.setClient("Mark");
		invoice1.setVatRate(1000L);
		invoice1.setInvoiceDate(new java.util.Date(2022, 01, 13));

		// test data 2
		Invoice invoice2 = new Invoice();
		invoice2.setId(2);
		invoice2.setClient("Tim");
		invoice2.setVatRate(2000L);
		invoice2.setInvoiceDate(new java.util.Date(2022, 01, 13));

		// service call
		invoiceService.saveInvoice(invoice1);
		invoiceService.saveInvoice(invoice2);
		List<Invoice> resultInvoices = invoiceService.getAllInvoices();

		// assertions
		assertEquals(resultInvoices.get(0).getId(), 1);
		assertEquals(resultInvoices.get(0).getClient(), "Mark");
		assertEquals(resultInvoices.get(0).getVatRate(), 1000L);

		assertEquals(resultInvoices.get(1).getId(), 2);
		assertEquals(resultInvoices.get(1).getClient(), "Tim");
		assertEquals(resultInvoices.get(1).getVatRate(), 2000L);

	}

}
