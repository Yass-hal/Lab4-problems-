package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxId=0;
        int minId=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
            if (sales[i]>sales[maxId]){
                maxId=i;
            }
            if(sales[i]<sales[minId]){
                minId=i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\n Average sales: " + sum/SALESPEOPLE);
        System.out.println("\n Salesperson"+maxId+"had the highest sale with $"+sales[maxId]);
        System.out.println("\n Salesperson"+minId+"had the lowest sale with $"+sales[minId]);
    }
}