package com.main.phone_store.repositories;

import com.main.phone_store.entities.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BillDetailRepository extends JpaRepository<BillDetail,Integer> {
    Optional<BillDetail> findAllById(int bill_id);
}
