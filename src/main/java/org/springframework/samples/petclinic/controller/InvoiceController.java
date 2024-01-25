package org.springframework.samples.petclinic.controller;

import java.util.List;
import org.springframework.samples.petclinic.persistence.InvoiceRepository;
import org.springframework.samples.petclinic.domain.billing.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/invoices")
public class InvoiceController {

	private final InvoiceRepository invoiceRepository;

	public InvoiceController(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	@GetMapping
	public @ResponseBody List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}

}
