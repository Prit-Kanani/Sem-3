import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of accounts");
        int n = sc.nextInt();
        BankAccount[] arr = new BankAccount[5];
    }
}

class BankAccount {

    int account_number;
    int balance;
    String account_holder;
    String name;

    BankAccount() {
        this.account_number = account_number;
        this.balance = balance;
        this.account_holder = account_holder;
        this.name = name;
    }

    void Deposit() {

    }

    void widrow() {

    }

    void check() {

    }
}
