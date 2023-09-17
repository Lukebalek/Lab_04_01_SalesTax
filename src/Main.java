public class Main
{
    public static void main(String[] args)
    {
    double doublePrice = 5;
    double doubleTax = .05;
    double doubleTotal = 0;

    doubleTax = doublePrice * .05;
    doubleTotal = doublePrice + doubleTax;
System.out.println("The cost of your item is " + doublePrice + " with a 5% sales tax of "
        + doubleTax + " the total amount you owe is " + doubleTotal);


    }
}