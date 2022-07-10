package lab2.algorithmsTravellerMoneyDenominations.app;

import java.util.Scanner;

import lab2.algorithmsTravellerMoneyDenominations.service.MergeSort;
import lab2.algorithmsTravellerMoneyDenominations.service.TravelerMoneyDenominations;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int amountToPay=0;
		System.out.println("How many currency denominations ");
		int  noOfDenominations = scan.nextInt();
		int denominations[] = new int[noOfDenominations];
		TravelerMoneyDenominations tpay = new TravelerMoneyDenominations();
		tpay.getDenominations(denominations,noOfDenominations);
		

		MergeSort mergeSort = new MergeSort();
		mergeSort.sortDsc(denominations, 0, denominations.length -1);
		
		System.out.println("Enter the amount you want to pay ");
		amountToPay = scan.nextInt();
		tpay.denominationsToPay(denominations, amountToPay);
		scan.close();
	}

}
