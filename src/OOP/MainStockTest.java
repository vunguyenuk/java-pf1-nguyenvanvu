package OOP;

public class MainStockTest {
    public static void main(String[] args) {
        Stock st = new Stock("ORCL", "Oracle Corporation");
        double inra = st.getChangePercent(34.5,34.35);
        System.out.println("percentage change in price: " + inra);
    }
}
