package ENCAPCULATION;

import java.util.Scanner;

public class A {

	private double bal =5000;
	private int pwd;
	
	public void Deposite(double money) 
	{
		System.out.println("Enter password");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal= bal+money;
			System.out.println("Deposite Money: "+money);
			System.out.println("Total Balance :"+bal);
		}
		else
		{
			System.out.println("Incorrect pwd");
		}
		
	}
	public void withdraw(double money) 
	{
	System.out.println("Enter Password");
	Scanner s = new Scanner(System.in);
	pwd=s.nextInt();
	if(pwd==123)
	{
		bal= bal-money;
		System.out.println("Deposite Money: "+money);
		System.out.println("Total Balance :"+bal);
	}
	else
	{
		System.out.println("Incorrect pwd");
	}
	}
	public void checkBal()
	{
		System.out.println("Enter Password");
		Scanner s = new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Total Balance :"+bal);
		}
		else {
			System.out.println("Incorrect password...");
		}
	}
}
class Customer 
{
	public static void main(String []args) 
	{
		A b =new A();
		
		int ch;
		System.out.println("1. Deposite:");
		System.out.println("1. Widthdraw:");
		System.out.println("1. checkBalance:");
		
		System.out.println("Enter Your Choice:");
		Scanner s2 = new Scanner(System.in);
		ch=s2.nextInt();
		switch(ch)
		{
		case 1: b.Deposite(5000);
		break;
		case 2: b.withdraw(2000);
		break;
		case 3: b.checkBal();
		break;
		default : System.out.println("Invalid Choice:");
			
		}
	}
}

