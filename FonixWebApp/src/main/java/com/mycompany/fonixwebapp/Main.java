/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fonixwebapp;

/**
 *
 * @author Omar
 */
public class Main {
    private Customer customer;
    private Sender sms_sender;
    public Main(long mobile_no)
    {
        customer = new Customer(mobile_no);
        sms_sender = new Sender();
        
    }
    public void startVerification()
    {

        customer.setCode();
        sms_sender.send_cust(customer);
        
    }
    
    public boolean verify(int code)
    {
        return code == customer.getCode();
    }
}
