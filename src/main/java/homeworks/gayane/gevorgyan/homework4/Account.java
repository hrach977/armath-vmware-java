package homeworks.gayane.gevorgyan.homework4;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String i, String n){
        id = i;
        name = n;
    }
    public Account(String i, String n, int b){
        id = i;
        name = n;
        balance = b;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
       return  balance;
    }

    public int debit (int amount){
        if (amount <= balance)
        {
            return balance - amount;
        }
        else{
            System.out.println("Amount exeeded");
            return balance;
        }
    }
    public int transferTo(Account another, int amount){

        if(amount <= balance){
            return amount;
        }
        else{
            System.out.println("Amount exeeded");
            return balance;
        }
    }

    @Override
    public String toString() {
        return "Account [id = " + id
                + ", name = "
                + name + "]";
    }
}
