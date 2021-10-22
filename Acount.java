
package project_acount;


public class Acount {
   private int id = 0;
   private double balance = 0;
   private double annualInterestRate = 0;
   private java.util.Date dateCreated;
    public Acount(){
        
    }
    public Acount(int id , double balance){
        this.id=id;
        this.balance=balance;
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
        if(id >=0)
        this.id=id;
    }
    public double getBalance(){
        return balance;
        
    }
    public void setBalance(double balance){
        if(balance >=0)
        this.balance= balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate( double annualInterestRate) {
        if(annualInterestRate >=0)
            this.annualInterestRate = annualInterestRate;
    }
    public java.util.Date getdateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterest() 
   {
   double monthlyInterest = (balance * annualInterestRate/100 / 12);
   return monthlyInterest;
   }

public boolean withdraw(double amount) 
{

  if(amount > balance)
  {
     return false;
  }
  else
  {
     balance = balance - amount;
     return true;
  }
  
}
 public double deposit(double amount) 
  {
   balance = balance + amount;
   return balance;   
  }
    
       
    
    
}
