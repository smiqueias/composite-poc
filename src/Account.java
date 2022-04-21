import java.util.List;

public class Account {
    Client client;
    CreditCard creditCard;
    List<Bill> bilss;

    public Account(Client client, CreditCard creditCard, List<Bill> bilss) {
        this.client = client;
        this.creditCard = creditCard;
        this.bilss = bilss;
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", creditCard=" + creditCard +
                ", bilss=" + bilss +
                '}';
    }
}
