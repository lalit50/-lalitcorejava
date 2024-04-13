package ClassComponents;

public class BankAccount {
    int customerId;
    String customerName;
    float balance;
    int phoneNumber;
    String email;

    static String bankName ="Back of Baroda";
    float deposit(float amountToBeDeposited) {
        //float balance =0 ;
        if (amountToBeDeposited > 0) {

            this.balance = balance + amountToBeDeposited;
        }
        return this.balance;
    }

}
