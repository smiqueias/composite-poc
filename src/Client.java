public class Client extends People {

    String id;
    String cpf;

    public Client(String id, String cpf, String name, String lastName) {
        super(name, lastName);
        this.id = id;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
