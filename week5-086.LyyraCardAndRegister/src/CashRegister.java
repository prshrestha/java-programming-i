
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double ECONOMICAL_PRICE = 2.5;
    private final double GOURMET_PRICE = 4.0;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= ECONOMICAL_PRICE) {
            economicalSold++;
            this.cashInRegister += ECONOMICAL_PRICE;
            return cashGiven - ECONOMICAL_PRICE;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= GOURMET_PRICE) {
            gourmetSold++;
            this.cashInRegister += GOURMET_PRICE;
            return cashGiven - GOURMET_PRICE;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= ECONOMICAL_PRICE) {
            economicalSold++;
            card.pay(ECONOMICAL_PRICE);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= GOURMET_PRICE) {
            gourmetSold++;
            card.pay(GOURMET_PRICE);
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
