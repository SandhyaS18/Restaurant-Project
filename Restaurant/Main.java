 
//import java.io.*;
import java.util.*;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws restaurantNotFoundException {

        //these are for testing purpose only...
        // System.out.println("\033");
        System.out.flush();
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        Scanner sc = new Scanner(System.in);
        // Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        // restaurant.addToMenu("Sweet corn soup",119);
        // restaurant.addToMenu("Vegetable lasagne", 269);
        
        System.out.println("test");
        //search for restaurnt
        //findRestaurantByName
        // restaurant.displayDetails();
        RestaurantService rs = new RestaurantService();
        rs.addRestaurant("hotel1", "tn", openingTime, closingTime);
        rs.addRestaurant("hotel3", "ka", openingTime, closingTime);
        rs.addRestaurant("hotel5", "mh", openingTime, closingTime);
        int c;
       
        while(true){
            System.out.println("1:find restaurnt\n0: exit\nenter your choice to proceed: ");
            c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 0: System.exit(0);
                case 1:{ 
                    System.out.println("enter restaurnt name to search: ");
                    String str = sc.nextLine();
                    try{
                        rs.findRestaurantByName(str);
                    }
                    catch(restaurantNotFoundException e){
                        System.out.println(e + " Not found!!!");
                    }
                    Restaurant r1 = rs.findRestaurantByName(str);
                    r1.displayDetails();
                }
                
            }
        }
    }
}
