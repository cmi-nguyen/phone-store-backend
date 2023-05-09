package com.main.phone_store.services.BillDetailService;

import com.main.phone_store.entities.BillDetail;

import java.util.List;
import java.util.Optional;

public interface BIllDetailService {
    BillDetail saveBillDetail(BillDetail billDetail);

    List<BillDetail> fetchBillDetailList();

    Optional<BillDetail> getBillDetailByID(int billDetailID);
    // Update operation
    BillDetail updateBillDetail(BillDetail billDetail, int billDetailID);

    // Delete operation
    void deleteBillDetail( int billDetailID);
}
