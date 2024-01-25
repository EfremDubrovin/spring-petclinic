package org.springframework.samples.petclinic.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.domain.billing.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
