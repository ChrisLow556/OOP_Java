package lab1;
public class test2 {
    public static void main(String[] args) {

        //Create a new stock object called stock1
        Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5);
        
        //call in the setCurrentPrice function
        stock1.setCurrentPrice(34.35);

        //Output the result
        System.out.println("Symbol: " + stock1.symbol);
        System.out.println("Name: " + stock1.name);
        System.out.println("Previous Closing Price: " + stock1.previousClosingPrice);
        System.out.println("Current Price: " + stock1.currentPrice);
        System.out.printf("Price change percentage: %.2f%%", stock1.getChangePrice());
    }
}
