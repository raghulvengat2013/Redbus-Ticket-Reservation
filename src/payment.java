import java.util.*;
public class payment extends booking{
	static Scanner s=new Scanner(System.in);
	int paidamount;
	static int count=1;
	static payment ref2=new payment();
	static canara  ref3=new canara();
	public static void pay() {
		System.out.println("*****************************************");
		System.out.println("               YOUR TICKET              ");
		System.out.println("*****************************************");
		System.out.println("*"  +ref.date+"/"+ref.month+"/"+ref.year );
		System.out.println("*    From  :"+ref.from +" To "+ref.to    );
		System.out.println("*    Coach : "+ref.coachtype             );
		System.out.println("*    No of seats: "+ref.seats            );
		System.out.println("*    Bus Fare: "+ref.gettotalcost()      );
		System.out.println("**************");
		System.out.println("*    Press-1----->Payment and conform  *");
		System.out.println("*    Press-2----->Modify               *");
		System.out.println("*    Press-3----->Exit                 *");
		System.out.println("****************************************");
		System.out.println("****************************************");
		String confirm=s.nextLine();
		 switch(confirm)
		 {
		 	case "1":{paypentmethod();ref3.verification();break;}
		 	case "2":{booking.bookingTickets();break;}
		 	case "3":{Redbus.Exit();break;}
		 	default :{System.out.println("==>Invalid Entry Try again<==");pay();}
		 }
	}
	
	private static void paypentmethod() {
		System.out.println("***********************");
		System.out.println("*   PAYMENT METHOD    *");
		System.out.println("***********************");  
		System.out.println("* Press-1----->GPAY   *");
		System.out.println("* Press-2----->DEBIT  *");
		System.out.println("* Press-3----->CREDIT *");
		System.out.println("***********************");
		String confirm=s.nextLine();
		
	}

	public static void paymentfare() {
		   if(ref3.getbal()>ref.gettotalcost())
		   {ref2.paidamount=(int) (ref3.getbal()-ref.gettotalcost());
		   ref3.setbal(ref2.paidamount);
		   }
		   else
		   {System.out.println("Insufficient amount");
		   Redbus.Exit();}	   
	}
}