import java.util.*;
public class Redbus {
	 static private String Name="Raghul";
	 static private String Email="1";
	 static private String Password="1";
	 static private String Mobileno="987654";
	 static Scanner s=new Scanner(System.in);
public static void login() {
     System.out.println("Email Id:");
     String email = s.nextLine();
     System.out.println("Password:");
     String password=s.nextLine();
     if(Email.equals(email) && Password.equals(password)){ 
     System.out.println("Login successfully Welcome to RedBus "+Name);
     booking.bookingTickets();
    }
	 else
	Forgot();
}
private static void Forgot() {
	 pattern(1);
	 System.out.println("*    Incorrect password and email-id     *");
	 pattern(1);
	 System.out.println("*     Press-1------->Try again           *");
	 System.out.println("*     Press-2------->Forgot password     *");
	 System.out.println("*     Press-3------->Exit                *");
	 pattern(1);
	 String forgot=s.nextLine();
	 switch(forgot)
	 {
	 	case "1":{login();break;}
	 	case "2":{setPassword();break;}
	 	case "3":{Exit();break;}
	 	default :{System.out.println("==>Invalid Entry Try again<==");Forgot();}
	 }
	 }

private static void setPassword() {
	 pattern(2);
	 System.out.println("* Account verification *");
	 System.out.println("*   Enter Mobile no:   *");
	 pattern(2);
	 String mobileno=s.nextLine();
	 if(Mobileno.equals(mobileno)) {
	 pattern(2);
     System.out.println("*   Set New Email Id   *");
     pattern(2);
	 String email = s.nextLine();
	 Email=email;
	 pattern(2);
	 System.out.println("*   Set New Password:  *");
	 pattern(2);
	 String password = s.nextLine();
	 Password=password;
	 pattern(2);
     System.out.println("*   Set New Name   *");
     pattern(2);
	 String Newname = s.nextLine();
	 Name=Newname;
	 pattern(2);
	 System.out.println("* Successfully Updated *");
	 pattern(2);
	 System.out.println("=====>Enter new<=====");
	 login();}
	 else
	 {
     pattern(3);
     System.out.println("*    Invalid Mobile no       *");
	 System.out.println("*  Press-1------->Try again  *");
	 System.out.println("*  Press-3------->Exit       *");        
	 pattern(3);
	 String no =s.nextLine();
	 if("1".equals(no))
	 setPassword();
	 else if("3".equals(no))
	 Exit();
	 else
	 { 
	 System.out.println("=====>Invalid Entry try again<=====");
	 setPassword();
	 }
	 }	
 }
public static void Exit() {
	 System.out.println("    THANKYOU for using RedBus "+Name);
	 pattern(1);
}
public static void pattern(int a) {
	switch(a)
	 {
	 	case 1:{System.out.println("******************************************");break;}
	 	case 2:{System.out.println("************************");break;}
	 	case 3:{System.out.println("******************************");break;}
	 }

}
}