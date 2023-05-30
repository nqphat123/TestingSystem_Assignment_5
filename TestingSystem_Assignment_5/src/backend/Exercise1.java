package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.News;

public class Exercise1 {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<News> listNews;

	public Exercise1() {
		listNews = new ArrayList<News>();
	}
	
	public void question1() {
		menu();
	}
	
	private void menu() {
		News news = null;
		int choice;
		do {
			System.out.println("-----Menu-----");
			System.out.println("1. Insert News.");
			System.out.println("2. View List News.");
			System.out.println("3. Average Rate.");
			System.out.println("4. Exit.");
			System.out.println("Your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				news = new News();
				System.out.println("Insert News:");
				System.out.println("Title: ");
				news.setTitle(sc.nextLine());
				System.out.println("Publish Date: ");
				news.setPublishDate(sc.nextLine());
				System.out.println("Author: ");
				news.setAuthor(sc.nextLine());
				System.out.println("Content: ");
				news.setContent(sc.nextLine());
				
				System.out.println("Enter 3 Rates: ");
				int[] rates = new int[3];
				for(int i = 0; i < 3; i++) {
					System.out.println("Rate: " + (i + 1) + " :");
					rates[i] = sc.nextInt();
				}
				news.setRates(rates);
				break;
			case 2:
				if(news != null) {
					news.display();
				} else {
					System.out.println("No news available!");
				}
				break;
			case 3:
					news.calculate();
					news.display();
					break;
			case 4:
				return;
			default:
				System.out.println("Invalid choice. Please choice again!");
			}
		} while (true);
	}
}
