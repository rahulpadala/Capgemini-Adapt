package Assn2;

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() 
    {
    
    return "Inside FilePersistence";
    
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() 
    {
    return "Inside DatabasePersistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) 
    {
    Persistence fp = new FilePersistence();
    Persistence dp = new DatabasePersistence();
    System.out.println(fp.persist());
    System.out.println(dp.persist());
    
    }
}