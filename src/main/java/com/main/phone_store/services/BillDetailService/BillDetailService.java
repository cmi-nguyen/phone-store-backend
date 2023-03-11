package com.main.phone_store.services.BillDetailService;



import com.main.phone_store.entities.BillDetail;

import java.util.List;
import java.util.Optional;

public interface BillDetailService {
    BillDetail saveBillDetail(BillDetail billDetail);

    // Read  list operation
    List<BillDetail> fetchBillDetailList();

    // Read  by id
    Optional<BillDetail> getBillDetailByID(int bill_id);
    // Update operation
    BillDetail updateBillDetail(BillDetail billDetail, int bill_id);

    // Delete operation
    void deleteBillDetail( int bill_id);
}
