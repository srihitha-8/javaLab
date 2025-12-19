import java.util.Scanner;
class Account{
    String custName;
    int accNum;
    String acctype;
    double balance;
    Account(String name,int num,String type,double balance){
        custName=name;
        accNum=num;
        acctype=type;
        this.balance=balance;
    }
    
    public void displayBalance(){
        System.out.println("Balace: "+balance);
    }
    
    public void deposit(int amount){
        balance+=amount;
        System.out.println("amount is added to balace successfully");
    }
}

class SavingsAccount extends Account{
    double rate=0.05;
    SavingsAccount(String name,int num,double balance){
        super(name,num,"Savings",balance);
    }
    public void computeInterest(){
        double interest=balance*rate;
        balance+=interest;
        System.out.println("interest credited: "+interest);
    }
    
    public void withdraw(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("amount withdrawn successfully");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account{
    CurrentAccount(String name,int num,double balance){
        super(name,num,"Current",balance);
    }
    double MinBalance=1000;
    double serviceCharge=100;
    public void checkMinBalance(){
        if(balance<MinBalance){
            balance-=serviceCharge;
        }
    }
}
class BankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.next();
        System.out.print("Enter account number: ");
        int num=sc.nextInt();
        System.out.print("Enter initial balance: ");
        double balance=sc.nextDouble();
        System.out.print("Enter account type(1.Savings account ,2.Current account: " );
        int choice=sc.nextInt();
        if(choice==1){
            SavingsAccount sa=new SavingsAccount(name,num,balance);
            sa.computeInterest();
            sa.displayBalance();
            
            System.out.print("Enter amount to be withdrawn: ");
            int amount=sc.nextInt();
            sa.withdraw(amount);
            sa.displayBalance();
        }
        else if(choice==2){
            CurrentAccount ca=new CurrentAccount(name,num,balance);
            ca.checkMinBalance();
            ca.displayBalance();
        }
    }
}
