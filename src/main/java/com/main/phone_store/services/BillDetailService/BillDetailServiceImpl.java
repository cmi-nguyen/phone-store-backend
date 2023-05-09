package com.main.phone_store.services.BillDetailService;

import com.main.phone_store.entities.BillDetail;
import com.main.phone_store.repositories.BIllDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillDetailServiceImpl implements BIllDetailService{
    @Autowired private BIllDetailRepository bIllDetailRepository;
    @Override
    public BillDetail saveBillDetail(BillDetail billDetail) {
        return bIllDetailRepository.save(billDetail);
    }

    @Override
    public List<BillDetail> fetchBillDetailList() {
        return bIllDetailRepository.findAll();
    }

    @Override
    public Optional<BillDetail> getBillDetailByID(int billDetailID) {
        return bIllDetailRepository.findById(billDetailID);
    }

    @Override
    public BillDetail updateBillDetail(BillDetail billDetail, int billDetailID) {
        return null;
    }

    @Override
    public void deleteBillDetail(int billDetailID) {
        bIllDetailRepository.deleteById(billDetailID);
    }
}
