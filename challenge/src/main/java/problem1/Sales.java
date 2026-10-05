package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int SALESPEOPLE;
        System.out.println("Enter the number of sales people ");
        SALESPEOPLE=scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxId=0;
        int minId=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if (sales[i]>sales[maxId]){
                maxId=i;
            }
            if(sales[i]<sales[minId]){
                minId=i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + (double)sum/SALESPEOPLE);
        System.out.println("\nSalesperson "+(maxId+1)+" had the highest sale with $"+sales[maxId]);
        System.out.println("\nSalesperson " +(minId+1)+" had the lowest sale with $"+sales[minId]);
        int valueOfSale;
        int totalExceeded=0;
        System.out.println("Enter value of a sale: ");
        valueOfSale=scan.nextInt();
        for (int i=0;i<sales.length;i++)
            {
            if (sales[i]>valueOfSale)
                {
                totalExceeded++;
                System.out.println("\nSalesperson "+ (i+1) +" exceeded the amount "+valueOfSale+"\nHis sales are "+sales[i]);
                }

            }
        System.out.println("Total number of salespeople whose sales exceeded the value entered is "+totalExceeded);
    }
}