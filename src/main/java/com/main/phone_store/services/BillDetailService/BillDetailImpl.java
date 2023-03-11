package com.main.phone_store.services.BillDetailService;

import com.main.phone_store.entities.BillDetail;

import com.main.phone_store.repositories.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BillDetailImpl implements BillDetailService{
    @Autowired private BillDetailRepository billDetailRepository;
    @Override
    public BillDetail saveBillDetail(BillDetail billDetail) {
        return billDetailRepository.save(billDetail);
    }

    @Override
    public List<BillDetail> fetchBillDetailList() {
        return billDetailRepository.findAll();
    }

    @Override
    public Optional<BillDetail> getBillDetailByID(int bill_id) {
        return billDetailRepository.findAllById(bill_id);
    }

    @Override
    public BillDetail updateBillDetail(BillDetail billDetail, int bill_id) {
       return null;
    }

    @Override
    public void deleteBillDetail(int bill_id) {

    }
}
