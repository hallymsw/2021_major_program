package pr01;

public class PayManager {
	PaymentInterface pi;
	public void setPayObj(PaymentInterface p) {
		this.pi=p;
	}
	public int buy(int price, int num, int bankCode) {
		
		int ret=0;
		ret=pi.pay(price*num);
		return ret;
	}
	public int checkBalance(int bankCode, int accountNum) {
		int balance=0;
		accountNum=pi.pay(accountNum);
		return balance;
	}


}
