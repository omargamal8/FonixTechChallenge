/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fonixwebapp;
import java.util.Random;
/**
 *
 * @author Omar
 */
public class CodeGenerator {
    /*
    Singelton Class
    */
    private static CodeGenerator instance = null;
    private CodeGenerator()
    {
        
    }
    public static CodeGenerator getGenerator()
    {
        if(instance == null)
           instance = new CodeGenerator();
        return instance;
    }
    public int generateCode()
    {


    Random rand = new Random();
    int  total_no = 0;
    for (int i=0; i<4; i++)
    {
        int  n = rand.nextInt(9);
        total_no =(int) (total_no + (n * Math.pow(10, i)));
    }
    return total_no;
    }
            
}
