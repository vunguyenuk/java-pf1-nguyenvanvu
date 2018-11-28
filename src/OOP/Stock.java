package OOP;

/*
1. A data field of type String is a symbol that stores symbol stocks.

2. The name field contains the data type is String save the name of the vote

3. The previousClosingPrice data field has a double data type that stores the previous day's stock price

4. The currentPrice data field has a double data type that stores current stock prices

5. Constructor to create a stock object with a given symbol and name

The getChangePercent () method returns the percentage change from previousClosingPrice to currentPrice.

7. Draw the UML diagram for the Stock layer and then install the layer.

8. Write the test program as follows:

Create a Stock object with the symbol ORCL and name Oracle Corporation,
previousClosingPrice is 34.5. Set the currentPrice to 34.35 and display the percentage change in price.
*/

public class Stock {
    public String symbol = "symbol";
    public String stockName;
    public double previousClosingPrice;
    public double currentPrice;

    Stock(String symbol, String stockName){
        this.symbol = symbol;
        this.stockName = stockName;
    }

    public double getChangePercent(double previousClosingPrice, double currentPrice){
        return  (currentPrice - previousClosingPrice)/currentPrice;
    }


}
