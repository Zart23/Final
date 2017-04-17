//**This class is the beginning of the program. Its asks for input from the user and runs methods accordingly**//
import java.util.Scanner; 
public class UserInput
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        
        EnterPassenger Run = new EnterPassenger();
        FlightOrg FlightRun = new FlightOrg();
        
        boolean Continue=true;
        String End, temp, YesNoNew;
        int RemovedPass, CheckFlightsInt, CheckPriceInt, ListRemovePass;
        
        Run.addPremadePassengers();
        //*This is the main loop of the program in which the user's input is processed*//
        while (Continue)
        {
        System.out.println ("Input desired operation. (PrintInfo/InputPassengers/RemovePassengers/CheckFlights/CheckCost)\nEnter END to quit operations");
        temp=scan.nextLine();
        //*The method to end the program*//
        if (temp.equalsIgnoreCase("END"))
         Continue=false;
         
        //*Prints the master list of passengers*//
        if (temp.equalsIgnoreCase("PrintInfo")) {
             System.out.println();
             Run.PrintInfo();
            }
            
        //*Allows for the input of passengers into the database*//
        if (temp.equalsIgnoreCase("InputPassengers"))
            Run.EnterPassengers();
            
        //*Removes passengers from the database*//
        if (temp.equalsIgnoreCase("RemovePassengers"))
        {
            System.out.println();
            Run.PrintInfo();
            System.out.println("Please input the passenger number associated with the traveler you would like to remove.");
            RemovedPass=scan1.nextInt();
            RemovedPass = RemovedPass - 1;
            Run.RemovePassenger(RemovedPass);
            System.out.println();
            
            Run.List1();
            System.out.println("Was the desired passenger on this list?");
            YesNoNew=scan5.nextLine();
            if (YesNoNew.equalsIgnoreCase("Yes"))
            {
                    System.out.println("Please input the passenger number associated with the traveler you would like to remove.");
                    ListRemovePass=scan2.nextInt();
                    ListRemovePass = ListRemovePass - 1;
                    Run.RemoveList1(ListRemovePass);
            }
            else {
                Run.List2();
                System.out.println("Was the desired passenger on this list?");
                YesNoNew=scan1.nextLine();
                if (YesNoNew.equalsIgnoreCase("Yes"))
                {
                    System.out.println("Please input the passenger number associated with the traveler you would like to remove.");
                    ListRemovePass=scan3.nextInt();
                    ListRemovePass = ListRemovePass - 1;
                    Run.RemoveList2(ListRemovePass);
                }
                else {
                    Run.List3();
                    System.out.println("Was the desired passenger on this list?");
                    YesNoNew=scan1.nextLine();
                    if (YesNoNew.equalsIgnoreCase("Yes"))
                    {
                    System.out.println("Please input the passenger number associated with the traveler you would like to remove.");
                    ListRemovePass=scan4.nextInt();
                    ListRemovePass = ListRemovePass - 1;
                    Run.RemoveList3(ListRemovePass);
                   }
                }
           }
        }
        
        //*Allows for the checking of flight lists*//
        if (temp.equalsIgnoreCase("CheckFlights"))
        {
           System.out.println();
           System.out.println("Which flight do you want to check? Enter the flight number.");
           FlightRun.flightInfo();
           CheckFlightsInt = scan1.nextInt();
           
           if (CheckFlightsInt==1)
                Run.List1();
           if (CheckFlightsInt==2)
                Run.List2();
           if (CheckFlightsInt==3)
                Run.List3();
        }
        //*Allows for the checking of ticket prices*//
        if (temp.equalsIgnoreCase("CheckCost"))
        {
            Run.PrintInfo();
            System.out.println("Input the passenger number associated with the traveler who's ticket price you would like to check.");
            CheckPriceInt = scan1.nextInt();
            CheckPriceInt = CheckPriceInt - 1;
            Run.PriceCheck(CheckPriceInt);
        }
      }
    }
}