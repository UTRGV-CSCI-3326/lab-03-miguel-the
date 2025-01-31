
public class BankAccount 
{
    public static void main(String[] args)
    {
        double total = 2175.37;

        total -= 302.50;
        total += 50.03;
        total /= 2;
        total += 20.00;
        total -= 1;
        total *= 2;
        total += 1;


        System.out.printf("%.2f", total);
    }
}