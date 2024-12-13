class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Enter positive amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance > amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Enter positive amount");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(7304);
        System.out.println(acc.getBalance());

        acc.withdraw(1448);
        System.out.println(acc.getBalance());
    }
}

// OUTPUT ---

// 7304.0
// 5856.0