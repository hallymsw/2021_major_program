package pr01;

public class MainClass {

	public static void main(String[] args) {
		int bCode=1,price=5000, num=3;
		int accNumber=010;
		int retVal=0;
		PaymentInterface pi = new Ppay();
//		
		PayManager pm = new PayManager();
		pm.setPayObj(pi);
		retVal=pm.buy(price,num);
		retVal=pm.checkBalance(accNumber);

	}

}
