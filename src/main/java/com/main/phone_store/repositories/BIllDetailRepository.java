package com.main.phone_store.repositories;

import com.main.phone_store.entities.BillDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BIllDetailRepository extends JpaRepository<BillDetail,Integer> {
}
