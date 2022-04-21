public class Purchase {

    double value;
    String description;

    public Purchase(double value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "value=" + value +
                ", description='" + description + '\'' +
                '}';
    }
}
