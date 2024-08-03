import java.util.Scanner;
import java.util.*;

public class BillingSystem {
    public static void format(String date ,String name)
    {
        Date cd =new Date();
       //System.out.println(cd);

        System.out.println(" ");
        System.out.println("\t   SHREE OBSERVER RESTURANT CLUB ");
        //all occurrences of object are replaced by T or represent a tab char
        System.out.println("=============================================================");
        System.out.println(" Date :"+cd);
        System.out.print(" Invoice To :"+name);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Items");
        System.out.print("\t\t\tQTY");
        System.out.println("\t\t\tTotal");
        System.out.println("-------------------------------------------------------------------");

    }
    public  static void printBill(String item ,int qty,float price)
    {
        System.out.print(" "+item);
        System.out.print("\t\t\t"+qty);
        System.out.println("\t\t\t"+qty*price);
        System.out.println(" ");
    }

    public  static void calculate_Bill(float[] price, int[]quantities)
    {
        float total = 0;
        for (int i = 0; i < price.length ; i++)
        {
            total+= price[i]*quantities[i];
        }
        float discount = (float) (0.1 * total);
        float netTotal = total - discount;
        // \n is an escape sequence that represent a newline char
        System.out.println("\n ----------------------------------------------------------------\n");
        System.out.println("Discount:             10% \t\t\t" +discount);
        System.out.println("\n ----------------------------------------------------------------\n");
        System.out.println("Total Amount :\t\t\t\t\t"+netTotal);
        System.out.println("\n ----------------------------------------------------------------\n");
       // System.out.println(" ");
        System.out.println(" \t\t Thank's and Visit again !!! \n\n ");
    }

    public static void main(String[] args) {
        System.out.println("\t\n Welcome to the SHREE OBSERVER RESTURANT CLUB \n");
       //  format("2/8/2024" ,"Tejashree kadam");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CUSTOMER NAME:");
        String input_name = sc.nextLine();

        System.out.println("Enter the Number Of orders requested by the customer: ");
        int input_number = sc.nextInt();

        String[] items =new String[input_number];
        int[]quantities = new int[input_number];
        float[]prices = new float[input_number];

        for (int i = 0; i < input_number; i++)
        {
            System.out.println(" ");
            System.out.println("Enter Item "+(i+1)+": ");
            System.out.print("Please Enter The Item Name : ");
            sc.nextLine();
            items[i] =sc.nextLine();
            System.out.println("Enter Quantity of Items : ");
            quantities[i]= sc.nextInt();
            System.out.println("Enter the Per Unit Charge of Item : ");
            prices[i] = sc.nextFloat();
            System.out.println(" ");
        }
        format("2/8/2024" ,"Tejashree kadam");

        for (int i = 0; i < input_number; i++)
        {
            printBill(items[i],quantities[i],prices[i]);
        }
        calculate_Bill(prices,quantities);
    }
}
