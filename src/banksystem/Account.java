/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.-
 */
package banksystem;

/**
 *
 * @author Christos-
 */
public abstract class Account {
    
    protected String Name;
    protected String Id;
    protected double balance;
    static double BankBalance=2000000000;
    public int countAccount=0;
    
    public Account(String Name,String Id,double balance){
    this.Name=Name;
    this.Id=Id;
    this.balance=balance;
    countAccount++;
    BankBalance+=balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    
    public abstract void withdraw(double y);
    
    public void deposit(double x){
        balance=balance+x;
        BankBalance=BankBalance+x;
    }
    
    

    
    
    
    
}
