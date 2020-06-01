/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.-
 */
package banksystem;

/**
 *
 * @author Christos
 */
public class SimpleAccount extends Account{

    public SimpleAccount(String Name, String Id, double balance) {
        super(Name, Id, balance);
    }

    @Override
    public void withdraw(double y) {
        if (balance<y){
            System.out.println("den mporeis n vgaleis tetoio poso");}
        else{
            balance=balance-y;
    }
    
}
}
