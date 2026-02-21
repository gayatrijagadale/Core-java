public class jaggedArray {

    public static void main(string1[] args) {
        
        int nums [][]= new int [3][];  //jagged

        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];

        for(int i =0; i<nums.length; i++)    //enhances for loop not need to size of array
        {
            for(int j=0;j<nums[i].length; j++)
            {
              nums[i][j]= (int)(Math.random() * 10);
            }
            
        }

   // Create 3 D array
        // int nums [][][]= new int [3][4][5];

        // for(int i =0; i<nums.length; i++)    //enhances for loop not need to size of array
        // {
        //     for(int j=0;j<nums[i].length; j++)
        //     {
        //         for(int k =0; k<nums[j].length; k++)
        //         {
        //            nums[i][j][k]= (int)(Math.random() * 10);
        //         }
        //     }
    
        // }

        for(int n[] :nums )
        {
            for(int m: n)
            {
                System.out.print(m+" ");
            }
            System.out.println( );
        }
    }
    
}
