package com.udemy.billing.repository;

import com.udemy.billing.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Invoice,Long> {
}
