package lab2.payMoneyTransactions.app;

import java.util.Scanner;

import lab2.payMoneyTransactions.service.PayMoneyTransactions;

public class PayMoneyTransactionsDriver {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		PayMoneyTransactions paymoney = new PayMoneyTransactions();
		
		System.out.println("Enter the size of transaction array");
		int sizeOfTransactionArray = scan.nextInt();
		int transactionArray[] = new int[sizeOfTransactionArray];
		
		System.out.println("enter the values of array");
		
		for(int i=0;i<sizeOfTransactionArray;i++)
			transactionArray[i] = scan.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int totalNumberOfTargets = scan.nextInt();
		while(totalNumberOfTargets--!=0) {
			int target;
			System.out.println("enter the value of target");
			target = scan.nextInt();
			paymoney.payTransactions(transactionArray, totalNumberOfTargets, target);
		}
		scan.close();
	}

}
