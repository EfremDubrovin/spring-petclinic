package org.springframework.samples.petclinic.billing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.owner.Visit;

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
