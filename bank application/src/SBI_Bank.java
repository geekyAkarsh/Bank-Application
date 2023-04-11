public class SBI_Bank implements Bank{
    private int balance;
    private String name;
    private int roi;// lets assume it is fixed for now
    private String password;
    private String accountNumber;
    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance <money) return false;

        this.balance -= money;
        return true;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int totalInterest(int loanAmount,int timeInYears) {
        return (loanAmount*roi*timeInYears)/100;
    }
}