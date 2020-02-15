package Classes_and_Constructor.Constructor_example;

public class Main {
    public static void main(String args[]){
        Account CustomerAccount=new Account();
        System.out.println(CustomerAccount.getNumber());
        System.out.println(CustomerAccount.getBalance());
        CustomerAccount.withdrawal(100.00);

        CustomerAccount.deposit(50.00);
        CustomerAccount.withdrawal(100.00);
        CustomerAccount.deposit(51.00);
        CustomerAccount.withdrawal(100.00);

    }
}
