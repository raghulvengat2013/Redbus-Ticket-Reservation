import java.util.*;
public class booking {
	static Scanner s=new Scanner(System.in);
	static booking ref=new booking();
	private double totalcost;	
	String a;
	String From;                    
	double distance=0;
	String from="";
	String to="";
	int coachfare=0;
    String coachtype;
    int seats=0;
    int date;
	int month;
    int year;
    public static void bookingTickets() {
     System.out.println("********************************");	
     System.out.println("*         MAIN-MENU            *");	
     System.out.println("********************************");
     System.out.println("*  Press-1----->Date           *");
     System.out.println("*  Press-2----->Coaches        *");
     System.out.println("*  Press-3----->Location       *");
   	 System.out.println("*  Press-4----->SeatsBooking   *");
   	 System.out.println("*  Press-5----->ConfirmBooking *");
   	 System.out.println("*  press-6----->Exit           *");
   	 System.out.println("********************************");
   	 ref.a=s.nextLine();
   	 switch(ref.a)
	 {
	    case "1":{date();break;}
	    case "2":{Coaches();break;}
	 	case "3":{Fromto();break;}
	 	case "4":{SeatsBooking();break;}
	 	case "5":{ConfirmBooking();break;}
	 	case "6":{Redbus.Exit();break;}
	 	default :{System.out.println("==>Invalid Entry Try again<==");bookingTickets();break;}
	 }
   	 
	}
	private static void date() {
		System.out.println("Date");
		ref.date=s.nextInt();
		System.out.println("Month");
		ref.month=s.nextInt();
		System.out.println("Year(2022,2023)");
		ref.year=s.nextInt();
		s.nextLine();
		if(ref.date<32 && ref.month<13 && ref.year==2022 || ref.year==2023)
		bookingTickets();
		else
		{System.out.println("Invalid date month year");
		date();	
		}
	}
	private static void ConfirmBooking() {
		if(ref.date==0)
			System.out.println("Please enter date");
		if(ref.month==0)
			System.out.println("Please select month");
		if(ref.year==0)
			System.out.println("Please select year");
		if(ref.distance==0)
			System.out.println("Please select correct Location");
		if(ref.coachfare==0)
			System.out.println("Please book Coaches");
		if(ref.seats==0)
			System.out.println("Please book Seats");
		if(ref.from.equals(ref.to))
			{
			System.out.println("Destination and Departure not be same");}

		if(ref.date!=0 && ref.month!=0 && ref.year!=0 && ref.distance!=0 && ref.coachfare!=0 && 
				ref.seats!=0 && ((ref.from).length()!= (ref.to).length()))
			{
			ref.totalcost=ref.distance*(ref.coachfare * ref.seats);
			payment.count=1; payment.pay();}
		else
			bookingTickets();		
	}

	private static void Coaches() {
		 System.out.println("********************************");	
	     System.out.println("*           COACHES            *");	
	     System.out.println("********************************");
	     System.out.println("*    Press-1-->AC SLP          *");
	     System.out.println("*    Press-2-->AC SEMI-SLP     *");
	     System.out.println("*    Press-3-->SLP             *");
	     System.out.println("*    Press-4-->SEMI-SLP        *");
	     System.out.println("*    Press-5-->PREVIOUS PAGE   *");
	     System.out.println("*    Press-6-->EXIT            *");
	     System.out.println("********************************");
	     ref.a=s.nextLine();
	     if("1".equals(ref.a))
	     {
	     ref.coachfare=390;
	     ref.coachtype="AC-SLP";
	     bookingTickets(); }
	     else if("2".equals(ref.a))
	     {ref.coachfare=280;
	     ref.coachtype="AC-SEMI-SLP";
	     bookingTickets(); }
	     else if("3".equals(ref.a))
	     {ref.coachfare=210;
	     ref.coachtype="SLP";
	     bookingTickets(); }
	     else if("4".equals(ref.a))
	     {ref.coachfare=150;
	     ref.coachtype="SEMI-SLP";
	     bookingTickets(); }
	     else if("5".equals(ref.a))
	     bookingTickets();
	     else if("6".equals(ref.a))
		 Redbus.Exit();
	     else
	     {System.out.println("==>Invalid Entry Try again<==");
	     Coaches();
	     } 
	}
	private static void Fromto() {
		 System.out.println("FROM==>");
		 ref.From=s.nextLine();
		 ref.from=ref.From;
		 Location();
		 System.out.println("TO==>");
		 ref.From=s.nextLine();	
		 ref.to=ref.From;
		 Location();
		 System.out.println("  Location updated ");
		 System.out.println("From: "+ref.from+ " to "+ref.to);
		 bookingTickets();
	}
	private static void Location() {
		switch(ref.From)
		 {
		 	case "chennai","madras","tiruvallur","kanchipuram","ranipet",
		 	"chengalpattu","vellore","villupuram" :{ref.distance(1);break;}
		 	case "tiruvannamalai,tirupattur",
		 	"kallakurichi","cuddalore":{ref.distance(2);break;}
		 	case "krishnagiri","dharmapuri","salem","namakkal"
		 	:{ref.distance(3);break;}
		 	case "erode","nilgiris","coimbatore","tiruppur"
		 	:{ref.distance(4);break;}
		 	case "karur","perambalur","ariyalur","mayladuturai",
		 	"tiruchirapalli","trichy","thanjavur","tiruvarur",
		 	"nagapattinam":{ref.distance(5);break;}
		 	case "dindigal","thindukkal","pudukottai","theni","madurai",
		 	"sivagangai","virudhunagar":{ref.distance(6);break;}
		 	case "ramanathapuram","tenkasi","thoothukudi",
		 	"thirunelveli","kanniyakumari":{ref.distance(7);break;}
		 	default :{System.out.println("==>Invalid Entry Try again<==");Fromto();}
		 }
		
	}
	public void distance(int a) {
		distance=a-distance;
	   distance=1*Math.abs(distance);
	   if(distance==0 && ref.from!=ref.to )
		  distance=0.5;
	}
	
	private static void SeatsBooking() {
		System.out.println("No of seats");
		ref.seats=s.nextInt();
		if(ref.seats>=10)
		{
			System.out.println("Max limit 10 seats try again");
			SeatsBooking();
		}
		s.nextLine();
		bookingTickets();
	}
	public double gettotalcost() {
		return ref.totalcost;
	}
	
}