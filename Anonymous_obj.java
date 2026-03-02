class A
{
    public A()
    {
      System.out.println("Object created");
    }
    public void show()
    {
        System.out.println("In a Show");
    }
}

public class Anonymous_obj {
    public static void main(String[] args) {
        new A ();    //Anonymous Object creation, you can not reuse them
        new A().show();  //here create new object , every time you call
    }
    
}
