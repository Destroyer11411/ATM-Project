/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atm;

/**
 *
 * @author My PC
 */
class transaction {
    private int tid,amt;
    private String type,tdate;
    
    public transaction(int tid,int amt,String type,String tdate)
    {
        this.tid=tid;
        this.type=type;
        this.amt=amt;
        this.tdate=tdate;
    }
    public int gettid()
    {
        return tid;
    }
    public int getamt()
    {
        return amt;
    }
    public String gettype()
    {
        return type;
    }
    public String gettdate()
    {
        return tdate;
    }
    
}
