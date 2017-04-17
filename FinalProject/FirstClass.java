//**The FirstClass class which builds upon ticket**//
public class FirstClass extends Ticket
{
    private final int Cost= 400;
    //*The method which handles creation of FirstClass objects*//
    public FirstClass(String name1, Address home, String MaleFemale, String DOBString)
    {
        super (name1, home, MaleFemale, DOBString);
    }
    
    //*Modified toString for FirstClass*//
    public String toString()
    {
        String result = "First Class\n";
        result += super.toString();
        return result;
    }
    
    //*Polymorphic class which returns a different value based upon ticket class*//
    public int returnCost()
    {
        return Cost;
    }
}