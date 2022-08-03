
    import java.util.Scanner;

class LessBalanceException extends Exception
{
    LessBalanceException(double amt)
    {
        System.out.println("Withdrawing "+amt+ "is Invalid");
     }
     }
      class user
{
    String name;
    user(String name)
    {
        this.name=name;
    }
    class Account
    {
        int acc_no;
        double bal;
        Account(int acc_no,double bal)
        {
            this.acc_no=acc_no;
            this.bal=bal;
        }
    }
        Account [] a= new Account[2];
        void deposite(Double amount,int a_no)
        {
            int found=0,k=1;
            for(int i=0;i<2;i++)
            if(a[i].acc_no==a_no)
            {
                a[i].bal+=amount;
            found=1;
            k=i;
            break;
            }
            if(found==1)
            {
                System.out.println("Balance Updated");
                display(a[k].acc_no);
            }
            else
            System.out.println("Account Number Does not exist");
        }
        void withdraw(Double amount,int acc_no)throws LessBalanceException
        {
            int k=-1;int found=0;
            for(int i=0;i<2;i++)
              if(a[i].acc_no==acc_no)
              {
                k=i;
                found=1;
                break;
              }
             if(found==1)
             {
                  if((a[k].bal<500)||(a[k].bal<amount))
                  throw new LessBalanceException(amount);
              else
              {
                a[k].bal-=amount;
                display(a[k].acc_no);
              }
            }
            else
                  System.out.println("Account number Doesnot exist");
              }
              void create_account()
              {
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<2;i++)
                {
                    System.out.println("Enter Account number");
                    int acc_no=sc.nextInt();
                    System.out.println("Enter Balance");
                    Double balance=sc.nextDouble();
                    a[i]=new Account(acc_no,balance);
                }
              }
              void display(int acc_no)
              {
                int k=1,found=0;
                for(int i=0;i<2;i++)
                if(a[i].acc_no==acc_no)
                {
                    k=i;
                    found=1;
                    break;
                }
                if(found==1)
                {
                    System.out.println("-----------Account Details--------");
                    System.out.println(name+"\t"+a[k].acc_no+"\t"+a[k].bal);
                    System.out.println("------------------------------------");
                }
              }
            }
            
public class bank {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("CREATE ACCOUNT WITH MINIMUM BALANCE 500");
    System.out.println("Enter Owner Name");
    String name=sc.next();
    int acc_no;
    user u=new user(name);
    u.create_account();
    System.out.println("Account created successfully");
    Boolean opt=true;
    while(opt)
    {
        System.out.println("=================================");
        System.out.println("1.BALANCE ENQUIRY2.DEPOSIT3.WITHDRAW");
        System.out.println("=================================");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Your Account Detials");
            System.out.println("Enter account number");
            acc_no=sc.nextInt();
            u.display(acc_no);
            break;
            case 2:System.out.println("Your Account No");
            acc_no=sc.nextInt();
            System.out.println("Enter Amount to deposit");
            Double amt=sc.nextDouble();
            u.deposite(amt,acc_no);
            break; 
            case 3:try
            {
            System.out.println("Enter account number");
            acc_no=sc.nextInt();
            System.out.println("Enter Amount to withdrawal");
            Double amount=sc.nextDouble();
            u.withdraw(amount,acc_no);
            }
            catch(LessBalanceException e){}
            break;
        }
        }
    }
}    


