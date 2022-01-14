package com.invoice.invoiceservices.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.invoice.invoiceservices.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
