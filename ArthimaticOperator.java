public class ArthimaticOperator {
    public static void main(string1[] args) {
        int num1 = 7;
        int num2 = 5;

        //Operation with  Arithmatic oerator(+,-,*,/,%)

        int result = num1 + num2;  //addition
        int div = num1 /num2;   //division ->get quetiont
        int mod = num1 % num2;  //modulus ->get reminder

        num1 = num2 +2;  //9
        num1 = num1+1;   //8 
        num1 +=1;      //8
        num1++;       //post- increment operator(fetch the values & then increment)
        ++num1;       //pre-increment (increment first and then fetch the value)
        num1--;  //decrement

        num1 -= 1;  //6
        num1 *= 1; //49
        num1 /= 1;
        

        //Relational Operator (<,>,<=,>=,!=)
        int  num3 = 7;

        boolean r = num1 < num2;  //false  -> " < "
        boolean s = num1 > num2; //true    -> "  > "
        boolean t = num1 != num2;  //true   -> " != "

        boolean a = num1 == num3;  //true  -> " == "

        double x = 1.2;
        double y = 2.3;
        boolean q = x <= y ;  //true   -> " <= "
        boolean p = x >= y ;  //false  -> " >= "

        int val1 =12;
        int val2 = 23;

        //logical Operator(&&,||,!)

        boolean logical_result = x < y && val1 < val2 ;  //true  //if 1 of oaccur false reult will false
        boolean result2 = x > y || val1>= val2 ;  //false   //if 1 of true then result will true 
        System.out.println(!result2);







        



        System.out.println(result);
    }
    
}
