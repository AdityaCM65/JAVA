final class ParentClass 
{
    void showData() 
    {
        System.out.println("This is a method of final Parent class");
    }
}


//It will throw compilation error
class ChildClass extends ParentClass 
{
  public void showData2() 
    {
        System.out.println("This is a method of Child class");
    }
}

class FinalKey
{
    public static void main(String arg[])
    {
        ParentClass obj = new ChildClass();
        obj.showData();
    }
}