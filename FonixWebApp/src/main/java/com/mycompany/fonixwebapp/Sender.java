/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fonixwebapp;
import io.zensend.*;
import java.io.*;
/**
 *
 * @author Omar
 */
public class Sender {
    private String base_body, originator, key;
    private Client client;

    public Sender(){

        base_body  = "Your verification code is ";
        originator = "447498552189";
        key = "I1zF4JH-fZhaa6VVr335CA";

    }
   public void send_cust(Customer c)
   {
            
            Message message = new Message();
            message.numbers = new String[]{String.valueOf(c.getNumber())};
            message.originator = originator;
            message.originatorType = message.originatorType.MSISDN;
            message.body = base_body + String.valueOf(c.getCode());
            client = new Client(key);


        try {
            SmsResult result = client.sendSms(message);
            System.out.println("guid: " + result.txGuid + " parts: " + result.smsParts + " encoding: " + result.encoding);
        } catch (ZenSendException e) {
            System.out.println("failcode: " + e.failCode + " parameter: " + e.parameter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
   }
}
