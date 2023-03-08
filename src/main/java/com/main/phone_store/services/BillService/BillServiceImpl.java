package com.main.phone_store.services.BillService;

import com.main.phone_store.entities.Bill;
import com.main.phone_store.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BillServiceImpl implements BillService{
    @Autowired private BillRepository billRepository;
    @Override
    public Bill saveBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public List<Bill> fetchBillList() {
        return billRepository.findAll();

    }

    @Override
    public Optional<Bill> getBillByID(int bill_id) {
        return billRepository.findById(bill_id);
    }

    @Override
    public Bill updateBill(Bill bill, int bill_id) {
        Bill billDB=billRepository.findById(bill_id).get();
        if(Objects.nonNull(bill.getBillID())){
            billDB.setBillID(bill.getBillID());
        }
        if (Objects.nonNull(bill.getUserID())){
            billDB.setUserID(bill.getUserID());
        }
        if (Objects.nonNull(bill.getTotal())){
            billDB.setTotal(bill.getTotal());
        }
        if (Objects.nonNull(bill.getDate())){
            billDB.setDate(bill.getDate());
        }
        if (Objects.nonNull(bill.isStatus())){
            billDB.setStatus(bill.isStatus());
        }
        return billRepository.save(billDB);
    }

    @Override
    public void deleteBill(int bill_id) {
        billRepository.deleteById(bill_id);
    }
}
