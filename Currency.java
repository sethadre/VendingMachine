public class Currency extends Vending{
    private double COIN_VALUE = 0;
    private double BILL_VALUE = 0;
    private String BillName;
    private String CoinName;


    public Currency(){
     this.COIN_VALUE = 0;
     this.CoinName = "";
    }
    public Currency(double COIN_VALUE, String CoinName){
        this.COIN_VALUE = COIN_VALUE;
        this.CoinName = CoinName;
    }

    public void setBILL_VALUE(double BILL_VALUE) {
        this.BILL_VALUE = BILL_VALUE;
    }

    public void setCOIN_VALUE(double COIN_VALUE) {
        this.COIN_VALUE = COIN_VALUE;
    }

    public double getBILL_VALUE() {
        return BILL_VALUE;
    }

    public double getCOIN_VALUE() {
        return COIN_VALUE;
    }
}