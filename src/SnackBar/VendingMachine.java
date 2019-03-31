package SnackBar;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getVendingMachineID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
