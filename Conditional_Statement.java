public class Conditional_Statement {
    public static void main(string1[] args) {
        
//         int x = 8;
        
// //1) if-else statement
//         if(x>10 && x <=20)    //11-20

//         System.out.println("Hello");  //if you have onle single codition uou don't need curly brackets
//         else 
//         System.out.println("Hello");

//         if(x>10 && x <=20) {   //11-20

//         System.out.println("Hello"); 
//     } //if you have onle single codition uou don't need curly brackets
//         else {
//                     System.out.println("Hello");


//         }
//2) if -else if loop

int x = 8;
int y = 7;
int z = 9;

if (x>y && x > z)
        System.out.println(x);
else if (y>x && y>z)
        System.out.println(y);
else 
        System.out.println(z);

//3) ternary Operator 

int n = 5;
int result = 0;

// if (n%2 ==0)
//     result = 10;
// else 
//     result = 20;

//use ? , :
result = n%2 ==0 ? 10: 20;

System.out.println(result);


        


        

        

    }
    
}
