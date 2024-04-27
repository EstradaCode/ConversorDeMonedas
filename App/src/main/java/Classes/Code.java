package Classes;

public class Code {
    private String ID;
    private String coinName;

    public Code(String ID, String coinName) {
        this.ID = ID;
        this.coinName = coinName;
    }

    public Code() {
    }

    public String getID() {
        return ID;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    @Override
    public String toString() {
        return "{ ID_COD='" + ID + '\'' +
                ", coinName='" + coinName + '\'' +
                "} \n";
    }
}
