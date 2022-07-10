package lab2.algorithmsTravellerMoneyDenominations.service;

import java.util.Scanner;

public class TravelerMoneyDenominations {
	
	public void getDenominations(int denominations[], int noOfDenominations) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the currency denominations value ");
		for(int index=0; index < noOfDenominations; index++) {
			denominations[index] = scan.nextInt();
		}
	}


	public void denominationsToPay(int denominations[], int amountToPay) {	
		int denominationsToPay[] = new int[denominations.length];

		int amount = amountToPay;

		for(int index =0; index < denominations.length; index++) {
			denominationsToPay[index] = amount / denominations[index];
			amount -= (denominations[index] * denominationsToPay[index]);
		}
		if(amount != 0) {
			System.out.println("Sorry can’t make exact payment");
			return;
		}

		System.out.println("To pay amountToPay Pay in ");
		for(int index=0; index < denominations.length; index++) {
			if(denominationsToPay[index] != 0) {
				System.out.println(denominations[index] + " : " + denominationsToPay[index]);
			}
		}

	}

}
