package ClassComponents;

public class Test {
    public static void main(String[] args) {
        //printvalue (100);// method call, method intvakation
        Test.printvalue(100);
        //deposit
        BankAccount BankAccount = new BankAccount();
        BankAccount.deposit(100.5f);
        System.out.println("updated balance" + BankAccount.balance);
    }


    //method dfiniton
    static void printvalue(int number) {
        System.out.println("printing..." + number);
    }
}
