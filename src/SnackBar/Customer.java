package SnackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashonhand;

    public Customer(String name, double cashonhand)
    {
        maxId++;
        id=maxId;
        this.name = name;
        this.cashonhand = cashonhand;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void getName()
    {
        return name;
    }

    public getCashOnHand(){
        return cashonhand;
    }

    public addCash(double addCash)
    {
        cashonhand += addCash;
    }

    public totalCash(double totalCash)
    {
        double cashLeft;
        cashLeft = cashonhand - totalCash;
        return cashLeft;
    }
}