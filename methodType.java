class overloading {
    public int add(int n1, int n2)
    {
        return n1 +n2 ;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 +n2 + n3 ;
    }

    public double add(double n1, int n2, double n3)
    {
        return n1 +n2 +n3;
    }

    
}
public class methodType {

    public static void main(string1[] args) {

        overloading obj = new overloading();
        
        double result = obj.add(1.1,4,3.3);
        System.out.println(result);


        
    }

    
}