 /*class mobile {
    String brand;   //instance variable
    int price ;
    //String name;
    static String name;   //static variable


public void show()
{
    System.out.println(brand + " : " +price + " : " +name);
}


public static void show1(mobile obj)   //static method , you need to create object for non static varibale used in static method
{
    System.out.println(obj.brand + " : " +obj.price + " : " +name);
}
}


public class staticKeyword {

    public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand= "Apple";
        obj1.price = 10000;
        mobile.name = "Smartphone";   //refer the static variable using class name 


        mobile obj2 = new mobile();
        obj2.brand= "Samsung";
        obj2.price = 12000;
        mobile.name = "Smartphone";

        //System.out.println(obj1.brand);   // while you define static variable it will change all referd value
        obj1.show();
        obj2.show();
    }
    
}*/


//static block , used to intialize static variable

class mobile {
    String brand;   //instance variable
    int price ;
    //String name;
    static String name;   //static variable

    public mobile()
    {
        brand = "";
        price = 200;
        name = "phone";
        System.out.println("in constructor");
    }

    static       //static block , while called only once
    {
        name = "phone";
        System.out.println("in static block");


    }

public void show()
{
    System.out.println(brand + " : " +price + " : " +name);
}
}

public class staticKeyword{
    public static void main(String[] args) throws ClassNotFoundException{

        Class.forName("mobile");   //Class.forName will load class 
        
            
        }
        
    }
