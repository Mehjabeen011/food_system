package Hotel_Menu;

import java.util.Scanner;

public class FoodOrder {
	int frenchfriese = 180;
	int burger = 80;
	int pizza = 150;
	int coldCOffee = 100;
	int icecream = 200;
	int HotCoffee;
	int Coldring;
	int Franky;
	int choice;
	int quantity;
	String again;
	static int total;
	Scanner sc = new Scanner(System.in);

	// this is My hotel..............................
	// 1 Our food menu is ready...................................................
	public void Display() {
		System.out.println("**Welcome To Mj Food Center**");
		System.out.println("-----------------------");
		System.out.println("    1.frenchfries    180    ");
		System.out.println("    2.burger         150 ");
		System.out.println("    3.pizza        100");
		System.out.println("    4.icecream      200 ");
		System.out.println("    5.HotCofee      200 ");
		System.out.println("    6.Coldring    200 ");
		System.out.println("    7.Franky     200 ");
		System.out.println("    5.Exit      ");

		System.out.println("==================================== ");
		System.out.println(" What do you want to order??");
	}

	// 2 lets create method to order a food
	// 3 we have to create generateBill method............................
	public void generateBill() {
		System.out.println();
		System.out.println("***thank You for Order***");
		System.out.println("***your Bill is :***" + total + "****");
	}

	public void order() {
		while (true) {
			switch (choice) {
			case 1:// frenchfries
				System.out.println("You have Selected Frenchfries:");
				System.out.println();
				System.out.println(" Enter your desired quantity");
				quantity = sc.nextInt();
				total = total + quantity * frenchfriese;
				break;
			case 2:// burger
				System.out.println("You have Selected burger ");
				System.out.println();
				System.out.println(" Enter your desired quantity:");
				quantity = sc.nextInt();
				total = total + quantity * burger;
				break;
			case 3:// pizza
				System.out.println("You have Selected pizza ");
				System.out.println();
				System.out.println(" Enter your desired quantity:");
				quantity = sc.nextInt();
				total = total + quantity * pizza;
				break;
			case 4:// icecream
				System.out.println("You have Selected icecream  ");
				System.out.println();
				System.out.println(" Enter your desired quantity :");
				quantity = sc.nextInt();
				total = total + quantity * icecream;
				break;
			case 5:// HotCofee
				System.out.println("You have Selected HotCofee ");
				System.out.println();
				System.out.println(" Enter your desired quantity:");
				quantity = sc.nextInt();
				total = total + quantity * HotCoffee;
				break;
			case 6:// Coldring
				System.out.println("You have Selected Coldring ");
				System.out.println();
				System.out.println(" Enter your desired quantity :");
				quantity = sc.nextInt();
				total = total + quantity * Coldring;
				break;
			case 7:// icecream
				System.out.println("You have Selected icecream  ");
				System.out.println();
				System.out.println(" Enter your desired quantity:");
				quantity = sc.nextInt();
				total = total + quantity * Franky;
				break;
			case 8:
				System.exit(1);
				break;

			default:
				break;
			}
			System.out.println();
			System.out.println("do you want to wish Anything else (y/n): ");
			again = sc.next("");
			if (again.contentEquals("y")) {
				order();
			} else if (again.equalsIgnoreCase("N")) {
				generateBill();
				System.exit(1);
			} else {
				System.out.println("Invalid choice");
			}
		}

	}

}
