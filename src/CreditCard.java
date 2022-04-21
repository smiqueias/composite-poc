public class CreditCard {

    double limit;
    String number;
    String timestamp;
    int code;

    public CreditCard(double limit, String number,String timestamp, int code) {
        this.limit = limit;
        this.number = number;
        this.timestamp = timestamp;
        this.code = code;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "limit=" + limit +
                ", number='" + number + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", code=" + code +
                '}';
    }
}
