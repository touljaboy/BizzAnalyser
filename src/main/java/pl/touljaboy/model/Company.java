package pl.touljaboy.model;

//class used to store info about a specific company. each company will have their annual reports, so specific
// company entity will act as a key value in guava arraylist map.
public class Company {
    private String name;
    private String taxID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }
}
