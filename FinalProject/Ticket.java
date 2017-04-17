//**This class is the abstract class upon which we will organize the different types of tickets**//
 abstract public class Ticket extends Passenger 
{
    //*The basic ticket class*//
    public Ticket(String name1, Address home, String MaleFemale, String DOBString)
                    
    {
        super (name1, home, MaleFemale, DOBString);
    }
    
    //*The way information will be displayed for tickets*//
    public String toString()
    {
      String result = super.toString();
      return result;
    }
    
    //*My abstract class for returning ticket prices*//
    abstract public int returnCost();
}