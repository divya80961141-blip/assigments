public class ATM
{
   
  static String bankName="SBI";
  static String holderName="divya";
  static  long  phoneno=8096114129l;
  static long accountno=234567890;
   static int Balance=1000;
    public static void main(String[] args)
    {
      welcome();
      checkbalance();
      desposit(500);
      checkbalance();
      withdraw(100);
      checkbalance();
      bankName("SBI");
      changeholderName("bhargavi");
      changebankName("canara bank");
      changephoneno(8096114189l);

    } 
    public static void welcome()
    {
      System.out.println("welocome to bank");
    }
     public static void desposit(int amount)
      {
        Balance +=amount;
        System.out.println("desposit  " + amount);
        System.out.println("update Balance " + Balance);
      }
      public static void withdraw( int amount)
     {
    if (amount<=Balance){
    Balance-=amount;
    System.out.println("withdrawn  " + amount);
    System.out.println("update Balance  " + Balance);
    }
    else{
      System.out.println("insufficient funds: ");
    }
  }
    public static void checkbalance(){
      System.out.println("current Balance");
    }
    public static void bankName(String bankName)
     {
     if (ATM.bankName.equals(bankName)) {
       System.out.println("bank name is SBI");
    
       }
      }

     public static void  changeholderName(String holderName)
     {
  ATM.holderName=holderName;
  System.out.println( "Update the holder name is "+ATM.holderName);
   }
  public static void changebankName(String bankName)
  {
    ATM.bankName=bankName;
    System.out.println( "update the bank name is "+ATM.bankName);
  }
    public static void  changephoneno(long phoneno)
    {
      ATM.phoneno=phoneno;
   System.out.println("update the phone number is "+ATM.phoneno);
    
     
    
  }
}

  


