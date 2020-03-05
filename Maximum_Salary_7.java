import java.util.Scanner;


import java.lang.*;


class Maximum_Salary_7
{
    public static void main(String[] args)
    {
        
        Scanner s = new Scanner(System.in);

        
        int num_elements = s.nextInt(); 

        String[] arr = new String[num_elements]; 


        for(int i = 0 ; i < arr.length ; i++)
        {
            
            arr[i] = s.next() ;

        }
    

        maxSalary(arr);

        
      

    }

    public static void maxSalary(String[] arr)
    {
        
        String[] sal_arr = new String[arr.length] ;

        for(int i = 0 ; i < sal_arr.length ; i++)
        {
            sal_arr[i] = "0" ;

        }

        String temp_max = "";

        for(int i = 0 ; i < arr.length ; i++)
        {
            temp_max = arr[i];
            for(int j = 0 ; j < arr.length ; j++)
            {
                
                temp_max = return_Num_which_should_appear_first(temp_max, arr[j]);
                
            }

            for(int k = 0 ; k < arr.length ; k++)
            {
                if(arr[k] == temp_max)
                {
                    arr[k] = "0" ;
                }
            }

            sal_arr[i] = temp_max ;
              
        } 

        for(int i = 0 ; i < sal_arr.length ; i++)
        {
            System.out.print(sal_arr[i]) ;
        }


        /*for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++)
            {
                System.out.println(arr[i] + "  " + arr[j]);
                String num = return_Num_which_should_appear_first(arr[i], arr[j]);
                System.out.println(num);
            }

        
        }*/

        
    }

    public static String return_Num_which_should_appear_first(String num1 , String num2)
    {

        int num_1 = Integer.parseInt(num1 + num2);
        int num_2 = Integer.parseInt(num2 + num1);

        
        if(num_1 >= num_2)
        {
            return num1;
        }
        else
        {
            return num2 ;
        }
        
    }
}