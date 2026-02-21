public class MultiDarray {
    
    public static void main(string1[] args) {
        
        // int nums[][] = new int [3] [4];

        // for (int i=0; i<3; i++)
        // {
        //     for(int j =0; j<4; j++ )
        //     {
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        int nums [][]= new int[3][4];
        for(int i =0; i<3;i++)
        {
            for(int j =0; j<4;j++)
            {
                nums[i][j]= (int)(Math.random()*100);
            }
        }

        for(int i =0; i<3; i++)
        {
            for(int j=0;j<4; j++)
            {
              System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        //insted of this for loop use enhanced array
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
