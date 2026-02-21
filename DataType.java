public interface DataType {
    public static void main(String[] args) {
        //primitive type
        int num1  = 5;   //integer    -> 4 byte (32bits)
        short sh = 223;   //short   -> 2 bytes
        byte by = 127;  //byte     -> 1 bytes
        long l = 7776434556l;//long  -> 8 bytes

        float f = 7.9f;   //float    -> 4 byte
        double d = 5.6666;  //double -> 8 bytes
        

        char c = 'k';    //char     ->2 bytes
        String  str = "Alex";

        boolean  b = true;   //boolean -> 1bytes
        System.out.println("Name:"+str+","+"age"+num1);


        //literals

        int num = 0b101;   //binary number(5)
        int num2 = 0x7E;   //hexadecimal number
        System.out.println(num);

        int num3 = 10_00_00_000;
        double num4= 56;    //convert int to float

        double num5 = 12e10;
        System.out.println(num5);

        char a = 'a';
        a++;
        System.out.println(a);
           


        
        
    }
}
