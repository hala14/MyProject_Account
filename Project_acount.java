/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_acount;

public class Project_acount {

  
    public static void main(String[] args) {
        Acount ob=new Acount();
        ob.setID(1122);
        ob.setBalance(20.000);
        ob.setAnnualInterestRate(4.5);
        System.out.println(ob.withdraw(2.500));
        System.out.println(ob.deposit(3.000));
        System.out.println(ob.getBalance());
        System.out.println(ob.getMonthlyInterest());
        System.out.println(ob.getdateCreated());
        
    }
    
}
