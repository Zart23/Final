
//**This class focuses on the creation and information held by the Passenger Object**//
public class Passenger
{
   private String Gender, DateOfBirth, DateOfDeparture;
   private Address homeAddress;
   private String Name;
   
   //*Allows for the instantiation of Passenger objects into the database*//
   public Passenger (String name1, Address home,
                    String MaleFemale, String DOB)
   {
      Name = name1;
      homeAddress = home;
      Gender = MaleFemale;
      DateOfBirth=DOB;
   }

   //*Sets up the way information is displayed*//
   public String toString()
   {
      String result;
      result = Name + "\n";
      result += "Home Address:\t" + homeAddress + "\n";
      result += "Gender:\t" + Gender + "\n";
      result += "Date of Birth:\t" + DateOfBirth + "\n";
      result += "\n";
      return result;
   }
}