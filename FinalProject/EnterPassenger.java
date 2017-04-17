//**This class contains methods for creating passengers and many other vital functions of my program**//
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
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
    
    ArrayList<Ticket> PassengerList = new ArrayList<Ticket>();
    FlightOrg Flight = new FlightOrg();
    
    ArrayList<Ticket> Flight1ListTEMP = new ArrayList<Ticket>();
    ArrayList<Ticket> Flight2ListTEMP = new ArrayList<Ticket>();
    ArrayList<Ticket> Flight3ListTEMP = new ArrayList<Ticket>();
    //*This is the method for creating passengers and assigning them a flight and ticket*//
    public void EnterPassengers()
    {
        String YesNo;
        boolean TicketLoop=true; 
        System.out.println("Would you like to input more passengers?");
        YesNo = scan1.nextLine();
        //*General info questions*//
        while (YesNo.equalsIgnoreCase("Yes") || YesNo.equalsIgnoreCase("Yes "))
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
          System.out.println();
          //*Assigning a ticket and flight*//
          while(TicketLoop)
          {
            System.out.println("What kind of ticket did the passenger wish to purchase?\n" + "Economy: $150\n" + "Business: $250\n" + "First Class: $400");
            String Ticket = scan9.nextLine();
            if (Ticket.equalsIgnoreCase("Economy"))
            {
                Economy tempPassenger = new Economy (Name, tempAddress, Gender, DOB);
                PassengerList.add(tempPassenger);
                
                System.out.println("Which flight does the passenger wish to fly on? Enter the number of the flight.");
                Flight.flightInfo();
                int FlightNumAssign = scan1.nextInt();
                if (FlightNumAssign==1)
                Flight1ListTEMP.add(tempPassenger);
                if (FlightNumAssign==2)
                Flight2ListTEMP.add(tempPassenger);
                if (FlightNumAssign==3)
                Flight3ListTEMP.add(tempPassenger);
                
                TicketLoop=false;
            }
            else if(Ticket.equalsIgnoreCase("Business"))
            {
                Business tempPassenger = new Business (Name, tempAddress, Gender, DOB);
                PassengerList.add(tempPassenger);
        
                System.out.println("Which flight does the passenger wish to fly on? Enter the number of the flight.");
                Flight.flightInfo();
                int FlightNumAssign = scan1.nextInt();
                if (FlightNumAssign==1)
                Flight1ListTEMP.add(tempPassenger);
                if (FlightNumAssign==2)
                Flight2ListTEMP.add(tempPassenger);
                if (FlightNumAssign==3)
                Flight3ListTEMP.add(tempPassenger);
                
                TicketLoop=false;
            }
            else if(Ticket.equalsIgnoreCase("First Class"))
            {
                FirstClass tempPassenger = new FirstClass (Name, tempAddress, Gender, DOB);
                PassengerList.add(tempPassenger);
                
                System.out.println("Which flight does the passenger wish to fly on? Enter the number of the flight.");
                Flight.flightInfo();
                int FlightNumAssign = scan1.nextInt();
                if (FlightNumAssign==1)
                Flight1ListTEMP.add(tempPassenger);
                if (FlightNumAssign==2)
                Flight2ListTEMP.add(tempPassenger);
                if (FlightNumAssign==3)
                Flight3ListTEMP.add(tempPassenger);
                
                TicketLoop=false;
            }
            else
            {
                System.out.println();
                System.out.println("Invalid Input - Please input ticket type:");
                System.out.println();
            }
          }
          System.out.println("Would you like to input more passengers?");
          YesNo = scan2.nextLine();
        }
        System.out.println();
    }
    
    //*This method creates and adds premade passengers to the lists in order to save time in demonstrating the functionality*//
    public void addPremadePassengers()
    {
          Address PremadeA = new Address ("6324 Hawthorne Blvd", "RPV", "CA", 90273);      
          Economy PremadePassA = new Economy ("Mike Gogg", PremadeA, "Male", "December 17, 1978");
          PassengerList.add(PremadePassA);
          Flight1ListTEMP.add(PremadePassA);
          
          Address PremadeB = new Address ("345 Magnolia Drive", "Los Angeles", "CA", 18082);      
          Business PremadePassB = new Business ("Kelly Hallibe", PremadeB, "Female", "February 14, 1990");
          PassengerList.add(PremadePassB);
          Flight2ListTEMP.add(PremadePassB);
          
          Address PremadeC = new Address ("34 Mainstreet Way", "Buffalo", "New York", 67821);      
          FirstClass PremadePassC = new FirstClass ("Blake Vallers", PremadeC, "Female", "January 1, 1999");
          PassengerList.add(PremadePassC);
          Flight3ListTEMP.add(PremadePassC);
          
          Address PremadeD = new Address ("128 Gladdion Ave", "Springfield", "Illinois", 32456);      
          Economy PremadePassD = new Economy ("Collin Baden", PremadeD, "Male", "July 16, 1989");
          PassengerList.add(PremadePassD);
          Flight1ListTEMP.add(PremadePassD);
          
    }
    
    //*This method prints the Passenger Master List*//
    public void PrintInfo()
    {
       ListIterator DisplayData = PassengerList.listIterator();
       int PassNumber = 1;
       while (DisplayData.hasNext()) {
            System.out.println("Master List: Passenger " + PassNumber);
            System.out.println(DisplayData.next());
            PassNumber++;
        }
       System.out.println(); 
    }
    
    //*This method removes a selected passenger from the master list*//
    public void RemovePassenger(int RemovePassNum)
    {
        PassengerList.remove(RemovePassNum);
    }
    
    //*This method removes a selected passenger from the first flight list*//
    public void RemoveList1(int RemoveNum)
    {
        Flight1ListTEMP.remove(RemoveNum);
    }
    
    //*This method removes a selected passenger from the second flight list*//
    public void RemoveList2(int RemoveNum)
    {
        Flight2ListTEMP.remove(RemoveNum);
    }
    
    //*This method removes a selected passenger from the third flight list*//
    public void RemoveList3(int RemoveNum)
    {
        Flight3ListTEMP.remove(RemoveNum);
    }
    
    //*This method prints the first flight list*//
    public void List1()
    {
       System.out.println();
       ListIterator DisplayF1 =Flight1ListTEMP.listIterator();
       int PassNumber = 1;
       while (DisplayF1.hasNext()) {
            System.out.println("Flight 1: Passenger " + PassNumber);
            System.out.println(DisplayF1.next());
            PassNumber++;
        }
       System.out.println(); 
    }
    
    //*This method prints the second flight list*//
    public void List2()
    {
        System.out.println();
       ListIterator DisplayF2 = Flight2ListTEMP.listIterator();
       int PassNumber = 1;
       while (DisplayF2.hasNext()) {
            System.out.println("Flight 2: Passenger " + PassNumber);
            System.out.println(DisplayF2.next());
            PassNumber++;
        }
       System.out.println(); 
    }
    
    //*This method prints the third flight list*//
    public void List3()
    {
        System.out.println();
       ListIterator DisplayF3 = Flight3ListTEMP.listIterator();
       int PassNumber = 1;
       while (DisplayF3.hasNext()) {
            System.out.println("Flight 3: Passenger " + PassNumber);
            System.out.println(DisplayF3.next());
            PassNumber++;
        }
       System.out.println(); 
    }
    
    //*This method prints the cost of the ticket*//
    public void PriceCheck(int CheckPriceInt)
    {
        Ticket tempPCheck = PassengerList.get(CheckPriceInt);
        System.out.println("$" + tempPCheck.returnCost() + "\n");
    }
}