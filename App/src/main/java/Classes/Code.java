package Classes;

public class Code {
    private String ID;
    private String coinName;
    private String country;

    public Code(String ID, String coinName, String country) {
        this.ID = ID;
        this.coinName = coinName;
        this.country=country;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{ ID_COD='" + ID + '\'' +
                ", coinName='" + coinName + '\'' +
                "} \n";
    }
}
