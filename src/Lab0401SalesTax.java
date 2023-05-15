// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lab0401SalesTax
{
    public static void main(String[] args)
    {
        double SALES_TAX = 0.05;
        double costOfItems = 12.25;
        double taxCost = 0;
        double totalCost = 0;

        taxCost = SALES_TAX * costOfItems;
        totalCost = costOfItems + taxCost;

        System.out.println("Your total tax is " + taxCost + " and your total cost is " + totalCost + ".");
    }
}