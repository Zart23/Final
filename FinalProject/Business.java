//**The Business class which builds upon ticket**//
public class Business extends Ticket
{
    private final int Cost= 250;
    //*The method which handles creation of Business objects*//
    public Business(String name1, Address home, String MaleFemale, String DOBString)
    {
        super (name1, home, MaleFemale, DOBString);
    }
    
    //*Modified toString for Economy*//
    public String toString()
    {
        String result = "Business Class\n";
        result += super.toString();
        return result;
    }
    
    //*Polymorphic class which returns a different value based upon ticket class*//
    public int returnCost()
    {
        return Cost;
    }
}