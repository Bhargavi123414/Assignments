"use strict";
// main account
class Accountss {
    constructor(balance) {
        this.total_Balance = balance;
    }
    get Balance() {
        return this.total_Balance;
    }
    deposit(amount) {
        this.total_Balance += amount;
        console.log("Deposited : $" + amount);
        console.log("Total Balance : $" + this.Balance);
    }
    withdraw(amount) {
        if (amount < this.Balance) {
            this.total_Balance -= amount;
            console.log("Withdraw Amount : $" + amount);
            console.log("Remaining Balance : $" + this.Balance);
        }
        else {
            return "Less Cash Present";
        }
    }
}
// savings account
class Savings_Account extends Accountss {
    constructor() {
        super(...arguments);
        this.interest = 0.05;
    }
    getAfterInterest() {
        console.log("After Interest Added : $" + (this.Balance + (this.Balance * this.interest)));
    }
}
// current account
class Current_Account extends Accountss {
    constructor() {
        super(...arguments);
        this.cashCreditR = 5.00;
    }
    cashCredit() {
        console.log("After Cash Credited : $" + (this.Balance - ((this.Balance * 0.02) - this.cashCreditR)));
    }
}
// objects 1
let savingss = new SavingsAccount(1000);
savings.deposit(500);
savings.withdraw(100);
savings.getAfterInterest();
console.log("=========================================");
let checkingg = new CurrentAccount(2000);
checking.deposit(600);
checking.withdraw(100);
checking.cashCredit();
// we can add many objects...
