Project Due: April 17, 2017
Topic: Airline Ticket Customer Database


Polymorphism in different amounts that passengers pay
first class pays 100
economy pays 25 ect.










import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class EnterPassenger
{
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    Scanner scan4 = new Scanner(System.in);
    Scanner scan5 = new Scanner(System.in);
    Scanner scan6 = new Scanner(System.in);
    Scanner scan7 = new Scanner(System.in);
    Scanner scan8 = new Scanner(System.in);
    Scanner scan9 = new Scanner(System.in);
    
    ArrayList<Economy> PassengerListE = new ArrayList<Economy>();
    ArrayList<Business> PassengerListB = new ArrayList<Business>();
    ArrayList<FirstClass> PassengerListFC = new ArrayList<FirstClass>();
    
    ListIterator DisplayDataE = PassengerListE.listIterator();
    ListIterator DisplayDataB = PassengerListB.listIterator();
    ListIterator DisplayDataFC = PassengerListFC.listIterator();
  
    public void EnterPassengers()
    {
        String YesNo;
        boolean TicketLoop=true; 
        
        
        System.out.println("Would you like to input more passengers?");
        YesNo = scan1.nextLine();
        
        while (YesNo.equalsIgnoreCase("Yes"))
        {
          System.out.println("What is the new passenger's name?");  
          String Name = scan2.nextLine();
          
          System.out.println("What is the new passenger's gender?");  
          String Gender = scan3.nextLine();
          
          System.out.println("What is the new passenger's date of birth?");  
          String DOB = scan4.nextLine();
          
          System.out.println("What is the new passenger's street?");  
          String Street = scan5.nextLine();
          
          System.out.println("What is the new passenger's city?");  
          String City = scan6.nextLine();
          
          System.out.println("What is the new passenger's state?");  
          String State = scan7.nextLine();
          
          System.out.println("What is the new passenger's zipcode?");  
          int Zipcode = scan8.nextInt();
          
          Address tempAddress = new Address (Street, City, State, Zipcode);      
          
          while(TicketLoop)
          {
            System.out.println("What kind of ticket did the passenger wish to purchase?\n" + "Economy: $150\n" + "Business: $250\n" + "First Class: $400");
            String Ticket = scan9.nextLine();
            if (Ticket.equalsIgnoreCase("Economy"))
            {
                Economy tempPassenger = new Economy (Name, tempAddress, Gender, DOB);
                PassengerListE.add(tempPassenger);
                 TicketLoop=false;
            }
            else if(Ticket.equalsIgnoreCase("Business"))
            {
                Business tempPassenger = new Business (Name, tempAddress, Gender, DOB);
                PassengerListB.add(tempPassenger);
                TicketLoop=false;
            }
            else if(Ticket.equalsIgnoreCase("First Class"))
            {
                FirstClass tempPassenger = new FirstClass (Name, tempAddress, Gender, DOB);
                PassengerListFC.add(tempPassenger);
                TicketLoop=false;
            }
            else
            {
                System.out.println("Invalid Input - Please input ticket type:");
            }
          
          }
          
          //Address tempAddress = new Address (Street, City, State, Zipcode);      
          //Passenger tempPassenger = new Passenger (Name, tempAddress, Gender, DOB);
   
          
                
          
          System.out.println("Would you like to input more passengers?");
          YesNo = scan2.nextLine();
        }
        System.out.println();
        
        
        
    }
    
    public void addPremadePassengers()
    {
          Address PremadeA = new Address ("6324 Hawthorne Blvd", "RPV", "CA", 90273);      
          Economy PremadePassA = new Economy ("Mike Gogg", PremadeA, "Male", "December 17, 1978");
          PassengerListE.add(PremadePassA);
          
          Address PremadeB = new Address ("345 Magnolia Drive", "Los Angeles", "CA", 18082);      
          Business PremadePassB = new Business ("Kelly Hallibe", PremadeB, "Female", "February 14, 1990");
          PassengerListB.add(PremadePassB);
          
          Address PremadeC = new Address ("34 Mainstreet Way", "Buffalo", "New York", 67821);      
          FirstClass PremadePassC = new FirstClass ("Blake Vallers", PremadeC, "Female", "January 1, 1999");
          PassengerListFC.add(PremadePassC);
          
          Address PremadeD = new Address ("128 Gladdion Ave", "Springfield", "Illinois", 32456);      
          Economy PremadePassD = new Economy ("Collin Baden", PremadeD, "Male", "July 16, 1989");
          PassengerListE.add(PremadePassD);
          
          //System.out.println(PassengerList);
    }
    
    public void PrintInfo()
    {
       System.out.println("Economy Passenger List");
       while (DisplayDataE.hasNext())
            System.out.println(DisplayDataE.next());
       System.out.println(); 
       
       System.out.println("Business Passenger List");
       while (DisplayDataB.hasNext())
            System.out.println(DisplayDataB.next());
       System.out.println();
       
       System.out.println("FirstClass Passenger List");
       while (DisplayDataFC.hasNext())
            System.out.println(DisplayDataFC.next());
       System.out.println();
    }
    
    
    
}
// 
// //Code adapted from some code found on StackOverflow.com 
//     public void RemovePassenger(String RemovePass)
//     {
//         
//         while (iter.hasNext()) 
//         {
//             Passenger pass = iter.next();
//             if(pass.Name.equals(RemovePass))
//             {
//                 iter.remove();
//             }
//         }
// 
//     }












Iterator<Employee> itr=list.iterator();

    while(itr.hasNext())
    {
        Employee employee = itr.next();

        System.out.print("age:"+employee.getAge());
        System.out.print("empid:"+employee.getEmpid());
        System.out.println("name:"+employee.getname());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Chapter 1 
        --------------
        Responsible use of Computer Systems - very low chance
        Dont need to know computer parts or internet stuff
        
        Chapter 2
        -----------
        -Know how to implement
        -Know primitive data types vs objects
        -Know declarations (final = constant)
            -New
        -String is big!!! ---Permuattions and upper lower case string concatinations ect.
        -Escape sequences
        -Variables
        -Know how to declare constants
        -Know how to convert data types (int to double and double to int-----casting)
        -KNow how to create objects!!!!
        -String methods!!!!!!!!! VERY IMPORTANT
        
        
        
        
        
         if (Flight1ListTEMP.size() >0) {  
      for (int x=0; x<Flight1ListTEMP.size();x++)
        Flight1List.add(Flight1ListTEMP.get(x));
      }
      
      if (Flight2ListTEMP.size() >0) {
      for (int y=0; y<Flight1ListTEMP.size();y++)
        Flight2List.add(Flight2ListTEMP.get(y));  
      }  
      
      if (Flight3ListTEMP.size() >0) {
      for (int z=0; z<Flight1ListTEMP.size();z++)
        Flight3List.add(Flight3ListTEMP.get(z));  
      }
        