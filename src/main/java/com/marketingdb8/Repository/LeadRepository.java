package com.marketingdb8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingdb8.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
