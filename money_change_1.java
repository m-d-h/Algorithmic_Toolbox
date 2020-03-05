import java.util.Scanner;

class money_change_1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();

        int count = 0 ;
        
        

        int[] denominations = new int[]{20,10,4} ;

        int i = 0 ; 

        while(num != 0)
        {
            if(num / denominations[i] >= 1)
            {
                count = count + num/denominations[i] ; 
                System.out.println("" + "Count" + count); 
                num = num % denominations[i] ;
                //System.out.println("" + "num"+ num);  
            }
            i = i+1 ; 
        }

        System.out.println("" + count); 
    }

}