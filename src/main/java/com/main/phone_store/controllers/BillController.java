package com.main.phone_store.controllers;

import com.main.phone_store.entities.Bill;
import com.main.phone_store.services.BillService.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BillController {
    @Autowired private BillService billService;
    @PostMapping("/bill")
    public Bill saveBill(@RequestBody Bill bill){
        return billService.saveBill(bill);
    }
    @GetMapping("/bill")
    public List<Bill> fetchBillList(){
        return billService.fetchBillList();
    }
    @GetMapping("/bill/{id}")
    public Optional<Bill> getBillByID(@PathVariable("id") int bill_id){
        return billService.getBillByID(bill_id);
    }
    @DeleteMapping("/bill/{id}")
    public void deleteBillByID(@PathVariable("id") int bill_id){
        billService.deleteBill(bill_id);
    }
    @PutMapping("/bill/{id}")
    public Bill updateBill(@RequestBody Bill bill, @PathVariable("id") int bill_id){
        return billService.updateBill(bill,bill_id);
    }

}
