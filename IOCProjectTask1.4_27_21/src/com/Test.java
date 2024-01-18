package com;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		ApplicationContext aps=new ClassPathXmlApplicationContext("Bean.xml");
		Calculator c1=(Calculator) aps.getBean("p");

		while(true){
			System.out.println("Enter Your Chioce");
			System.out.println("Enter 1 for Addition");
			System.out.println("Enter 2 for Substraction");
			System.out.println("Enter 3 for Multiplication");
			System.out.println("Enter 4 for Division");
			System.out.println("Enter 5 for Exit");
			int ch=sc.nextInt();
			
			switch(ch){
			case 1:
				System.out.println("Enter First No");
				int a=sc.nextInt();
				System.out.println("Enter Second No");
				int b=sc.nextInt();
				c1.add(a, b);
				break;
			case 2:
				System.out.println("Enter First No");
				int a1=sc.nextInt();
				System.out.println("Enter Second No");
				int b1=sc.nextInt();
				c1.sub(a1, b1);
				break;
			case 3:
				System.out.println("Enter First No");
				int a2=sc.nextInt();
				System.out.println("Enter Second No");
				int b2=sc.nextInt();
				c1.mul(a2, b2);
				break;
			case 4:
				System.out.println("Enter First No");
				int a3=sc.nextInt();
				System.out.println("Enter Second No");
				int b3=sc.nextInt();
				c1.div(a3, b3);
				break;
			case 5: 
				System.exit(0);	
			default:
				System.out.println("Enter valid input");

			}

		}

	}
}
