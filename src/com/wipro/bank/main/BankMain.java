package com.wipro.bank.main;

import java.util.Date;

import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.service.BankService;

public class BankMain {

    public static void main(String[] args) {

        BankService service = new BankService();

        // Check balance
        System.out.println(service.checkBalance("A103"));

        // Transfer
        TransferBean bean = new TransferBean();
        bean.setFromAccountNumber("A103");
        bean.setToAccountNumber("A102");
        bean.setAmount(500);
        bean.setDateOfTransaction(new Date());

        String result = service.transfer(bean);
        System.out.println("Transfer Status: " + result);
    }
}