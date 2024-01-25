package org.springframework.samples.petclinic.billing;

import java.util.List;
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
