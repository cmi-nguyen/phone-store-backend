package com.main.phone_store.controllers;

import com.main.phone_store.entities.BillDetail;
import com.main.phone_store.services.BillDetailService.BillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BillDetailController {
    @Autowired private BillDetailService billDetailService;
    @GetMapping("/bill/detail")
    public List<BillDetail> fetchBillDetailList(){
        return billDetailService.fetchBillDetailList();
    }
    @PostMapping("bill/detail")
    public BillDetail saveBillDetail(@RequestBody BillDetail billDetail){
        return billDetailService.saveBillDetail(billDetail);
    }
    @GetMapping("bill/detail/{id}")
    public Optional<BillDetail> getBillDetailByID(@PathVariable("id") int bill_id){
        return billDetailService.getBillDetailByID(bill_id);
    }
}
