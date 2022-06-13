package com.swp.insurancecard.repositories;

import com.swp.insurancecard.models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {
}
