package lab2.payMoneyTransactions.service;

public class PayMoneyTransactions {

	public void payTransactions(int[] transactionArray,int totalNumberOfTargets, int target) {

		int flag = 0;
		long targetAmountSum = 0;
		for(int i =0; i<transactionArray.length;i++) {
			targetAmountSum+=transactionArray[i];
			if(targetAmountSum >= target) {
				System.out.println("Target achieved after "+(i+1)+" transaction(s)");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Given target is not achieved");
		}
	}
}
