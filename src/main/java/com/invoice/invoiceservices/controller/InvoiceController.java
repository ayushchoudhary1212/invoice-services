package com.invoice.invoiceservices.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invoice.invoiceservices.model.Invoice;
import com.invoice.invoiceservices.service.InvoiceService;
import com.invoice.invoiceservices.service.InvoiceServiceImpl;

@RestController
public class InvoiceController {
	
	
	InvoiceService invoiceService;
	
	@Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

	
	    @PostMapping("/invoice")
	    public String addInvoice(@RequestBody Invoice invoice) {
	        return invoiceService.saveInvoice(invoice);
	    }
	    
	    @GetMapping("/invoices")
	    public List<Invoice> viewAllInvoices() {
	        return invoiceService.getAllInvoices();
	    }
	    
	    @GetMapping("/invoice/{invoiceId}")
	    public Invoice viewInvoice(@PathVariable("invoiceId") int invoiceId) {
	        return invoiceService.getInvoice(invoiceId);
	    }
	
}
