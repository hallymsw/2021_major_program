package pr01;

public class PayManager {
	PaymentInterface spay;
	PaymentInterface kpay;
	public PayManager() {
		spay = new Spay();
		kpay = new Kpay();
	}
//	PaymentInterface pi;

//	public void setPayObj(PaymentInterface p) {
//		this.pi=p;
//	}
	public int buy(int price, int num, int bankCode) {
		int ret=0;
		if(bankCode ==1) {
			ret=spay.pay(price*num);
		}
		else if(bankCode ==2) {
			ret=kpay.pay(price*num);
		}
		else{
			ret=-1;
		}
		
//		ret=pi.pay(price*num);
		return ret;
	}
	public int checkBalance(int bankCode, int accountNum) {
		int balance=0;
		if(bankCode ==1) {
			balance=spay.checkBalance(accountNum);
		}
		else if(bankCode ==2) {
			balance=kpay.checkBalance(accountNum);

		}
		
		else{
			ret=-1;
		}
//		accountNum=pi.pay(accountNum);
		return balance;
	}


}
