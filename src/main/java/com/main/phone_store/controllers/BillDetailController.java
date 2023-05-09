package com.main.phone_store.controllers;

import com.main.phone_store.entities.BillDetail;
import com.main.phone_store.services.BillDetailService.BIllDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillDetailController {
    @Autowired private BIllDetailService bIllDetailService;
    @PostMapping("/billdetail")
    public BillDetail saveBillDetail(@RequestBody BillDetail billDetail){
        return bIllDetailService.saveBillDetail(billDetail);
    }
    @GetMapping("/billdetail")
    public List<BillDetail> fetchBillDetailList(){
        return bIllDetailService.fetchBillDetailList();
    }

}
