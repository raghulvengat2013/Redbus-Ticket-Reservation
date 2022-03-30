import java.util.*;
class canara extends payment
{
	static payment ref4=new payment();
	static canara ref5=new canara();
	
	static Scanner s=new Scanner(System.in);
	 
	    private int accno=10001;
		private String name="raghul";
		private int phno=9344331;
		private int pin=1234;
		private int bal=10000;
		static int Count=1;
		static int Count1=0;
	    String Copyname=name;
	    public void verification()
		{   
			while(Count<=3)
			{System.out.println("Enter accno : ");
			int Accno=s.nextInt();
			System.out.println("Enter PIN : ");
			int Pin=s.nextInt();
			if(Pin==pin && Accno==accno)
            {
			System.out.println("Verification Success");
			paymentfare();
			break;
			}
			else if(Count<=2)
            System.out.println("Incorrect Try Again Attempt "+Count+" of 3");
			else
			System.out.println("3 Attempt Failed Your Account Locked For 24HRS");
			 ++Count;
			 ref5.mobNo();
			}
		}	
		public void mobNo()
		{
     	if(Count==4)
		{
		  System.out.println(" To Unlock Account Press Y or N");
          char Yn= s.next().charAt(0);
		  if(Yn=='Y')
		{ System.out.println("Enter mobile no : ");
		  int Mobno=s.nextInt();
          if(Mobno==phno)
	     {
            System.out.println("Verified success");
			Count1++;
			setupdatePin();
		 }
			 else
			System.out.println("Verified failed Try Next time");
		 }
		     else
		     { System.out.println("Thank you");
		     System.out.println("Payment failed");
		     
		     }
		 }
	     }
		 public void setupdatePin()
	    {  
	     if (Count1==1) 
		{
		 System.out.println("Enter new pin:");
		 int updatePin=s.nextInt();
         this.pin=updatePin;
		 System.out.println("Pin Updated");
		 Count=0;
		 verification();
		 }
		}

public int getpin()
	    {  
	     return pin;
		}

public int getbal() {
	return bal;
	
}

public void setbal(int paidamount) {
	bal=paidamount;
	System.out.println("* Canara Bank amount paid :Rs" +ref.gettotalcost());
	System.out.println("* Canara Bank account balance :Rs" +bal);
}

}