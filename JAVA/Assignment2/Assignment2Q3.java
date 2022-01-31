import java.util.ArrayList;
import java.util.List;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        
        return totalDeposits;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        
        return totalDeposits;
    }
    public int getFixedDepositAmount() {
        return fixedDepositAmount;
    }
    public int getWithDrawal() {
        
        return totalDeposits - fixedDepositAmount;
    }
}
public class Assignment2Q3 {
    public static Integer totalCashInBank(int cash){
        return cash;
    }
    
    public int getCash(){ return 0; }
    public int getFixedDepositAmount() { return 0; }
    public int getWithDrawal() { return 0; }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Assignment2Q3 currentAccount = new CurrentAccount();
        Assignment2Q3 savingsAccount = new SavingsAccount();
        
        array.add(totalCashInBank(currentAccount.getCash() + savingsAccount.getCash()));

        int total = 0;
        for(int i : array){
            total += i;
        }

        

        int withDraw = currentAccount.getCash() + savingsAccount.getWithDrawal();

        System.out.println("Cash in Savings Account  : $"+savingsAccount.getCash());
        System.out.println("Cash in Current Account  : $"+currentAccount.getCash());
        System.out.println("---------------------------------------------");
        System.out.println("Total Cash in the Bank   : $"+total);
        System.out.println("---------------------------------------------");
        System.out.println("------> Savings Fixed Deposit Amount : $"+savingsAccount.getFixedDepositAmount());
        System.out.println("------> Withdrawl From Savings       : $"+savingsAccount.getWithDrawal());
        System.out.println("------> Withdrawl From Current       : $"+currentAccount.getCash());
        System.out.println("---------------------------------------------");
        
        System.out.println("Total Withdrawal Cash : $"+withDraw);
    }
}