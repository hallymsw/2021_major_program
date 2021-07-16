package pr01;

public class PayManager {
	PaymentInterface pi;

	public void setPayObj(PaymentInterface p) {
		this.pi=p;
	}
	public int buy(int price, int num) {
		int ret=0;
		ret=pi.pay(price*num);
		return ret;
	}
	public int checkBalance(int accountNum) {
		int balance=0;
		balance=pi.checkBalance(accountNum);
		return balance;
	}
}
