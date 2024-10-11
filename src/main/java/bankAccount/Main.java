package bankAccount;

public class Main {


    public static void main(String[] args) {

        Account account1 = new Account();

        account1.setName("Damian Gildea");
        account1.setAccountNumber(12345678);
        account1.setEmail("hello@gmail.com");
        account1.setPhoneNumber("07312345678");
        account1.setBalance(1000.0);

        account1.withdrawFunds(100);
        account1.depositFunds(150);
        account1.withdrawFunds(100);

    }

}
