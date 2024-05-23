package tk_pay.model;

public class Wallet {
    private static long idCounter = 0;

    private Long id;
    private double tyMoney;
    private double tyPoints;
    private Customer customer;

    public Wallet(Customer customer) {
        this.id = ++idCounter;
        this.customer = customer;
        this.tyMoney = 0;
        this.tyPoints = 0;
    }

    public Long getId() {
        return id;
    }

    public double getTyMoney() {
        return tyMoney;
    }

    public void setTyMoney(double tyMoney) {
        double temp_tyMoney = 0;
        if(this.getTyMoney() > 10000)
            temp_tyMoney = tyMoney * (0.05);
        else
            temp_tyMoney = tyMoney * (0.01);
        this.tyMoney = tyMoney;
        this.setTyPoints(temp_tyMoney);
    }

    public double getTyPoints() {
        return tyPoints;
    }

    public void setTyPoints(double tyPoints) {
        this.tyPoints = tyPoints;
    }

    public Customer getCustomer() {
        return customer;
    }
}
