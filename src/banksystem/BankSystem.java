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
public class BankSystem {

    public static void main(String[] args) {
        SimpleAccount sa1=new SimpleAccount("mitsos","1223456",1000.45);
        SimpleAccount sa2=new SimpleAccount("mitsos","1223456",1000.45);
        VIPAccount vip1=new VIPAccount("geo","1234556",5000.50);
        vip1.deposit(2000);
        System.out.println(vip1.balance);
        vip1.withdraw(10000);
        System.out.println(vip1.balance);
        vip1.withdraw(2000000001);
        sa1.withdraw(7100);
        System.out.println(sa2.countAccount);
        System.out.println(vip1.countAccount);
    }
    
}
