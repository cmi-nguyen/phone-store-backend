package com.main.phone_store.services.BillService;



import com.main.phone_store.entities.Bill;

import java.util.List;
import java.util.Optional;

public interface BillService {
    Bill saveBill(Bill bill);

    // Read  list operation
    List<Bill> fetchBillList();

    // Read  by id
    Optional<Bill> getBillByID(int bill_id);
    // Update operation
    Bill updateBill(Bill bill, int bill_id);

    // Delete operation
    void deleteBill( int bill_id);
}
