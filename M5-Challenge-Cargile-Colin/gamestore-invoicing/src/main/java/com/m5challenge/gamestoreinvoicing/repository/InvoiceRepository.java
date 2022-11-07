package com.m5challenge.gamestoreinvoicing.repository;

import com.m5challenge.gamestoreinvoicing.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByName(String name);
}

