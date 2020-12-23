package homeworks.gayane.gevorgyan.homework7;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("270046", "Bari Mardukyan");
        Account account2 = new Account("45007", "Harust Milionyan", 150050);

        System.out.println(account1.toString());
        System.out.println("Account [id = " + account2.getId() + ", name = " + account2.getName() + ", balance = " + account2.getBalance()+"]");
        System.out.println("Credit = " + account2.credit(600000));
        System.out.println("Debit = " + account2.debit(1000000));
        System.out.println("TransferTo = " + account2.transferTo(account1, 3000));
    }
}
