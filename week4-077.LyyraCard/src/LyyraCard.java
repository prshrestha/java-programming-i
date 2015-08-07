/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.50) {
            balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (balance >= 4.00) {
            balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0.00) {
            balance += amount;
            if (balance > 150.00) {
                balance = 150.00;
            }
        }
    }

}
