package model;

public class Auto {
    private String number;
    private String brand;
    private String model;
    private int year;
    private double pricePerMonth;
    private Client client = null;

    public Auto(String number, String brand, String model, int year, double pricePerMonth) {
        this.number = number;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.pricePerMonth = pricePerMonth;
    }

    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public Client getClient() {
        return client;
    }

    public void rent(Client client) {
        this.client = client;
    }

    public void release() {
        this.client = null;
    }
}
