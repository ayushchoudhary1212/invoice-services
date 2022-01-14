package com.invoice.invoiceservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.invoice.invoiceservices.dao.InvoiceRepository;
import com.invoice.invoiceservices.model.Invoice;

@Component
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;
	
	    public String saveInvoice(Invoice invoice) {	
	    	invoiceRepository.save(invoice);
	        return "invoice saved...";
	    }
	    
	 
	    public List<Invoice> getAllInvoices() {
	        return invoiceRepository.findAll();
	    }
	    
	   
	    public Invoice getInvoice(int invoiceId) {
	    	return invoiceRepository.findById(invoiceId).get();
	    }
	
}
