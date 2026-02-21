public class TypeCasting {
    public static void main(string1[] args) {
        
        //byte b = 127;
         //int a = b;
        int a = 12;
    
        byte k = (byte)a;     //explicit  
        System.out.println(k);

        float f = 5.6f;
        int t = (int)f;
        System.out.println(t);


        //Type Promotion

        byte d = 10;
        byte b = 30;

        int result = a*b;  // result should be in byte (it give error)but java pramote


    }
    
}
