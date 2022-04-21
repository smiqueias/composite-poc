import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account1 =  new Account(
                new Client(
                        "fc2dc478e9abca8e1",
                        "01234567890",
                        "Fausto",
                        "Melo"

                ),
                new CreditCard(
                        12000,
                        "5f4dcc3b5aa765d61d8327deb882cf99",
                        "2022-04-19",
                         378313
                ),
                new ArrayList<Bill>() {
                    {
                        add(new Bill(
                                new ArrayList<Purchase>() {
                                    {
                                        add (new Purchase(
                                                500,
                                                "Flutter Course"
                                        ));
                                        add (new Purchase(
                                                300,
                                                "Keyboard"
                                                ));
                                    }
                                },
                                "2022-04-19"

                        ));

                        add(new Bill(
                                new ArrayList<Purchase>() {
                                    {
                                        add (new Purchase(
                                                50,
                                                "Burguer King"
                                        ));
                                        add (new Purchase(
                                                12000,
                                                "MacBook Pro"
                                        ));
                                    }
                                },
                                "2021-08-19"

                        ));
                    }
                }

        );

        System.out.println(account1.toString());
    }
    }

