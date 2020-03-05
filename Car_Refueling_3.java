import java.util.Scanner ;

public class Car_Refueling_3
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int total_distance = scan.nextInt();

        int max_fuel_capacity = scan.nextInt();

        int number_of_stops = scan.nextInt();

        int arr[] = new int[number_of_stops+2] ;

        arr[0] = 0 ;
        arr[number_of_stops+1] = total_distance;

        for(int i = 1 ; i <= number_of_stops ; i++)
        {
            arr[i] = scan.nextInt();
        }

        System.out.println("" + minimum_Refills(arr, max_fuel_capacity, total_distance));

    }

    public static int minimum_Refills(int[] arr, int max_fuel_capacity, int total_distance)
    {


        int count = 0;

        int curr_fuel_capacity = max_fuel_capacity ;

        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            int distance = arr[i+1] - arr[i] ;

            if(curr_fuel_capacity >= distance)
            {
                curr_fuel_capacity = curr_fuel_capacity - distance ;

            }
            else
            {
                curr_fuel_capacity = max_fuel_capacity ;
                //System.out.println("Max Fuel Cap" + max_fuel_capacity) ;
                //System.out.println("Current Fuel Capacity is  ------>" + curr_fuel_capacity) ;
                count = count + 1 ;
                
                //System.out.println("ith value  "+i) ;
                if(curr_fuel_capacity < distance)
                {
                    return -1 ;
                }
                curr_fuel_capacity = curr_fuel_capacity - distance ;

            }

        }

        return count ;
    }

}