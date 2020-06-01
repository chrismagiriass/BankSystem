/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;

/**
 *
 * @author Christos
 */
public class VIPAccount extends Account{

    public VIPAccount(String Name, String Id, double balance) {
        super(Name, Id, balance);
    }

    @Override
    public void withdraw(double y) {
        if(BankBalance<y)
            System.out.println("den mporeis na vgaleis tetoio poso");
        else
            balance=balance-y;
        
    }
    
}
