package lab1;
public class Stock {
    //The attributes of the stock object
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    //Create an empty constructor
    public Stock(){

    }

    //Create a constructor that accepts symbol, name and previousClosingPrice as parameters
    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }

    //Function to change the currentPrice value
    public void setCurrentPrice(double price){
        this.currentPrice = price;
    }

    //Function to calculate the percent change in price
    public double getChangePrice(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
    }
}

