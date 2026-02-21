class demo {
    
    int num = 5; //instance variable
    public int add(int n1, int n2)
    {
        System.out.println(num);
        return n1 +n2 ;
    }

    
}
public class stack_heap {

    public static void main(String[] args)
    {

        int data = 10;

        demo obj = new demo();
        demo obj1 = new demo();


        int r1 = obj.add(3,4);
        // System.out.println(r1);

        obj.num = 8;

        System.out.println(obj.num);

        System.out.println(obj1.num);


    


        
    }

    
}