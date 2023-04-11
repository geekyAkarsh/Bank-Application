public class Main {
    public static void main(String[] args) {

        System.out.println("Let's create a bank app!");
        //we ll be creating a bank app today
        // features to be added -
        // 1 - create bank account
        // 2 - add money
        // 3 - check balance
        // 4 - withdraw balance

        Bank sbiBankAccount = new SBIBankAccount(1000,"Akarsh","Akarsh12345");
        sbiBankAccount.addMoney(1000);
        boolean withdrawStatus = sbiBankAccount.withdrawMoney(1300);
        if(Boolean.TRUE.equals(withdrawStatus)){
            System.out.println("Money withdrawn successfully");
        }
        System.out.println("BALANCE : " + sbiBankAccount.checkBalance());
    }
}