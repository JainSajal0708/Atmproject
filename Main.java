package com.Atmproject;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		System.out.println("Welcome");
		System.out.println("Please insert your card");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select your choice");
		
		int Amount =10000;
//		System.out.println("");
		int userWish;
		do {
			System.out.println("Please select a option");
			int userInput=	scanner.nextInt();
		switch(userInput) {
		case 1:
//			System.out.println("Deposit");
			int maxLimit =500000;
			System.out.println("Enter the amount you have to deposit");
			int depositAmount=scanner.nextInt();
			if (depositAmount<=maxLimit){
				System.out.println("Amount Send");
			}
			else {
				System.out.println("Cannot send as amount exceeded");
			}
//			Amount=Amount+userInput;
			break;
		case 2:
//			System.out.println("Cash WIthdrawal");
//			int amount =10000;
			System.out.println("Please Enter your cash");
			int userAmount=scanner.nextInt();
			if(userAmount<=Amount) {
//				userAmount / 500;
				System.out.println("Take out your cash");
			}
			else {
				System.out.println("Insufficient Balance");
			}
//			Amount=Amount-userInput;
			break;
		case 3:
//			Scanner scanner1=new Scanner(System.in);
			System.out.println("Select your account type");
//			String accountType=scanner1.nextLine();
//			
//			switch(accountType) {
//			case "savingsaccount":
//				System.out.println("pin changed");
//				break;
//			case "currentaccount":
//				System.out.println("pin chanded");
//				break;
//				
//			case "creditaccount":
//				System.out.println("pin changed");
//				break;
//				default:
//				System.out.println("wrong case");
//			
//			}
			int selectAccount;
			int selectAmmount = scanner.nextInt();
			if(selectAmmount==1) {
				System.out.println("Saving Account selected");
				int pin=5469;
				System.out.println("Enter old pin");
				int oldPin = scanner.nextInt();
				if(oldPin == pin) {
					System.out.println("Enter New pin");
					int newPin = scanner.nextInt();
					System.out.println("PIN changed");
				}
				else {
					System.out.println("Enter Correct pin");
				}
			}
			else if(selectAmmount==2) {
				System.out.println("Current Account selected");
				int pin=5478;
				System.out.println("Enter old pin");
				int oldPin = scanner.nextInt();
				if(oldPin == pin) {
					System.out.println("Enter New pin");
					int newPin = scanner.nextInt();
					System.out.println("PIN changed");
				}
				else {
					System.out.println("Enter Correct pin");
				}
			}
			else if(selectAmmount==3) {
				System.out.println("Credit Account selected");
				int pin=8562;
				System.out.println("Enter old pin");
				int oldPin = scanner.nextInt();
				if(oldPin == pin) {
					System.out.println("Enter New pin");
					int newPin = scanner.nextInt();
					System.out.println("PIN changed");
				}
				else {
					System.out.println("Enter Correct pin");
				}
			}
			else {
				System.out.println("Invalid entry");
			}
			
			
			break;
		case 4:
//			System.out.println("Balance Enquiry");
//			int balance =874864;
			int passcode=5478;
			System.out.println("Enter Passcode");
			int enteredPasscode = scanner.nextInt();
			if (enteredPasscode==passcode) {
				System.out.println("Your account balance = "+Amount);
			}
			else {
				System.out.println("Incorrect Passcode");
			}
			break;
			default:
				System.out.println("Please Select relevant option");
		}
		
		System.out.println("Do you want to continue so 'press 1'");
		userWish=scanner.nextInt();
		}
		while(userWish==1);
		System.out.println("Thank You PLease vist again");
		}
}
