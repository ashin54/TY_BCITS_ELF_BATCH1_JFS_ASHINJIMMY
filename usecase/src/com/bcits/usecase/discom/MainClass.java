package com.bcits.usecase.discom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.bcits.usecase.projectdiscom.TariffCalculation;

public class MainClass {
	
	static HashMap<Integer, Consumer> map = new HashMap<Integer, Consumer>();
	static Scanner scanner = new Scanner(System.in);
	static long inl;
	static long fnl;
	static double bill;


	public static void main(String[] args) {
		while (true) {

			try {
				System.out.println("choose");
				System.out.println("1.Generate Bill");
				System.out.println("2.show  details");

				switch (Integer.parseInt(scanner.nextLine())) {
				case 1:
					try {
						System.out.println("Select the type of Consumer");
						System.out.println("1.RESIDENTIAL");
						System.out.println("2.COMMERECIAL");
						System.out.println("3.INDUSTRY");
						int choice = Integer.parseInt(scanner.nextLine());
						switch (choice) {
						case 1:

							System.out.println("enter the name ");
							String name1 = scanner.nextLine();
							int id =0;
							try {
								System.out.println("enter the id ");
								id = Integer.parseInt(scanner.nextLine());
								System.out.println("Enter the initial reading ");
								inl = Integer.parseInt(scanner.nextLine());
								System.out.println("Enter the final reading");
								fnl = Integer.parseInt(scanner.nextLine());
							} catch (Exception e) {

								System.out.println("enter valid id/readings");
							}
							bill = TariffCalculation.residentil(inl, fnl);
							System.out.println("bill = " + bill);
							Consumer user1 = new Consumer(name1, id, "RESIDENTIAL", bill);
							map.put(id, user1);
							break;
						case 2:
							System.out.println("enter the name ");
							String name = scanner.nextLine();
							int id2 =0;
							try {
				
								System.out.println("enter the id ");
								id2 = Integer.parseInt(scanner.nextLine());
								System.out.println("Enter the initial reading ");
								inl = Integer.parseInt(scanner.nextLine());
								System.out.println("Enter the final reading");
								fnl = Integer.parseInt(scanner.nextLine());
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							bill = TariffCalculation.commercial(inl, fnl);
							System.out.println("bill = " + bill);
							Consumer user2 = new Consumer(name, id2, "COMMERECIAL", bill);
							map.put(id2, user2);
							break;
						case 3:
							System.out.println("enter the name ");
							String name3 = scanner.nextLine();
							int id3=0;
							try {
								System.out.println("enter the id ");
								id3 = Integer.parseInt(scanner.nextLine());
								System.out.println("Enter the initial reading ");
								inl = Integer.parseInt(scanner.nextLine());
								System.out.println("Enter the final reading");
								fnl = Integer.parseInt(scanner.nextLine());
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							bill = TariffCalculation.industry(inl, fnl);
							System.out.println("bill = " + bill);
							Consumer user3 = new Consumer(name3, id3, "INDUSTRY", bill);
							map.put(id3, user3);
							break;

						default:
							System.out.println("wrong choice");
							break;
						}
					} catch (Exception e) {
						System.out.println("enter valid number");
						break;
					}
					break;

				case 2:
					System.out.println("----------DETAILS---------------");
					Set keys = map.keySet();
					Iterator itr = keys.iterator();
					while (itr.hasNext()) {
						Consumer consumer = map.get(itr.next());
						System.out.println("Name : "+ consumer.getName());
						System.out.println("ID   : "+consumer.getId());
						System.out.println("type : "+consumer.getTypeOfUser());
						System.out.println("bill : "+consumer.getBill());
						System.out.println();
						System.out.println("------------------------------");
					}
					break;

				default:
					System.out.println("invalid");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("enter valid number");
			}
		}
	}


}
