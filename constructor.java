class human{
    private int age;
    private  String name;

    public human(){  // defult constructor
        //System.out.print("In constructor");
          age = 12;
          name = "Gayatri"; 
    } 
    
    public human(int a , String n){   ///parameterized  constructor
        age = a;
        name = n;
        
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class constructor {
    public static void main(String[] args) {
        human obj = new human();
                System.out.println(obj.getName()+ " : " + obj.getAge());



        human obj1 = new human(18, "Shradha");
        System.out.println(obj1.getName()+ " : " + obj1.getAge());




        // obj.setAge(22);
        // obj.setName("Gayatri Jagadale ");

        //System.out.println(obj.getName()+ " : " + obj.getAge());
    }
    
}
