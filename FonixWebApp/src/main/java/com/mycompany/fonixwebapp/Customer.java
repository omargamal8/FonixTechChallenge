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
public class Customer {
    
    private long number;
    private int code;
    private boolean verified;
    private CodeGenerator code_gen;
    
    public Customer (long number)
    {
        this.number = number;
        this.verified = false;
        code_gen = CodeGenerator.getGenerator();
    }
    
    public void setCode()
    {
       code = code_gen.generateCode();
       
    }
    public long getNumber()
    {
        return this.number;
    }
    public int getCode()
    {
        return this.code;
    }
    
    
}
