package SnackBar;

public class Snack 
{
    private int id; 
    private string name;
    private int quantity;
    private int cost;
    private int vId;

    public Snack (String name, int quantity, double cost, int vendingmachineID)
	{
	    maxId++;
	    this.id = maxId;

	    this.name = name;
	    this.quantity = quantity;
	    this.cost = cost;
	    this.vendingmachineID = vendingmachineID;			
    }
    
    public getQuntity()
    {
        return this.quantity;
    }

    public gettotalCost()
    {
        double totalCost = 0;
        totalCost = this.cost * buySnacks();
        return totalCost;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int buySnacks(int quantity)
    {
        this.quantity = quanitity;
    }
}