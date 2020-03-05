import java.util.Scanner ;

class Knapsack_again
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ;

        int size = scan.nextInt() ;

        double weight = scan.nextDouble(); 

        

        double[] values                = new double[size] ;
        double[] weights               = new double[size] ;
        double[] values_per_weight     = new double[size] ;

        for(int i = 0 ; i < size ; i++)
        {
            values[i] = scan.nextDouble() ;
            weights[i] = scan.nextDouble() ;
        }
        
        /*for(int i = 0 ; i < size ; i++)
        {
            weights[i] = scan.nextDouble() ;
        }*/

        for(int i = 0 ; i < size ; i++)
        {
            values_per_weight[i] = (values[i] / weights[i])  ;
        }

        for(int i = 0 ; i < size ; i ++)
        {
            for(int j = i+1 ; j < size ; j++)
            {
                if(values_per_weight[j] >= values_per_weight[i])
                {
                    double temp = values_per_weight[j] ;
                    values_per_weight[j] = values_per_weight[i] ;
                    values_per_weight[i] = temp ;

                    //Aligning values and weights accordingly
                    double temp2 = values[j] ;
                    values[j] = values[i] ;
                    values[i] = temp2;

                    double temp3 = weights[j] ;
                    weights[j] = weights[i] ;
                    weights[i] = temp3 ;

                }
            }
        }

        

        System.out.printf("%.4f", max_loot(values, weights, values_per_weight, weight));

          

    }

    public static double max_loot(double[] values, double[] weights, double[] values_per_weight, double weight)
    {
        int i = 0 ; 

        int size = values.length ;

        double loot = 0 ; 

        while( weight != 0 )
        {
            if( weight - weights[i] >= 0)
            {
                weight = weight - weights[i] ;
                //System.out.println("" + weight) ;
                loot   = loot + weights[i] * values_per_weight[i] ;
                //System.out.println("loot --" + loot);
                i = i+1;
            }
            else
            {
                loot = loot + weight * values_per_weight[i] ;
                weight = 0 ;
            }

            if( i == (values.length))
            {
                return loot ;
            }


        }

        return loot ;
    }

    
}