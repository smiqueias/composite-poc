import java.util.List;

public class Bill {
    List<Purchase> purchases;
    String timestamp;


    public Bill(List<Purchase> purchases, String timestamp) {
        this.purchases = purchases;
        this.timestamp = timestamp;

    }

    @Override
    public String toString() {
        return "Bill{" +
                "purchases=" + purchases +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
