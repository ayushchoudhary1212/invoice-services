package com.invoice.invoiceservices.service;

import java.util.List;

import com.invoice.invoiceservices.exception.InvoiceNotFoundException;
import com.invoice.invoiceservices.model.Invoice;

public interface InvoiceService {
	 public String saveInvoice(Invoice invoice);
	 public List<Invoice> getAllInvoices() throws InvoiceNotFoundException;
	 public Invoice getInvoice(int invoiceId) throws InvoiceNotFoundException;
}
