package org.springframework.samples.petclinic.domain.billing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.samples.petclinic.domain.base.BaseEntity;

/**
 * Represents a bill for a particular visit
 */
@Entity
@Table(name = "invoices")
public class Invoice extends BaseEntity {

	@Column(name = "billed_amount")
	private String billedAmount;

	@Column(name = "currency")
	private String currency;

	public Invoice() {
	}

	public String getBilledAmount() {
		return billedAmount;
	}

	public String getCurrency() {
		return currency;
	}

}
