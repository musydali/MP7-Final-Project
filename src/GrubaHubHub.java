
import java.util.*;

public class GrubaHubHub {

	public static void main(String[] args) {

		// Asian Food Arrays
		String[] Cravings = new String[] { "Miso Soup", "Seafood Soup", "Pork Fried Rice", "Chicken Fried Rice",
				"House Fried Rice", "Vegetable Chop Suey", "Chicken Lo Mein", "KungPao Chicken", "Garlic Chicken" };
		double[] CravingsP = new double[] { 1.55, 2.55, 4.35, 4.35, 5.35, 6.99, 5.25, 6.25, 6.99 };
		String[] Sakanaya = new String[] { "Miso Soup", "Edamame", "Shrimp Tempura", "Sashimi 8 pc", "Sushi Sampler",
				"Willis Tower", "Big Apple", "Alaskan", "California", "Una-Q" };
		double[] SakanayaP = new double[] { 2.00, 4.00, 8.00, 12.00, 12.00, 12.00, 9.00, 6.00, 5.00, 6.00 };
		String[] SpoonHouse = new String[] { "Kimbap", "Burrito", "Ramen", "Bul-go-gi", "TonKatsu", "Bi Bim Bap",
				"Udon" };
		double[] SpoonHouseP = new double[] { 4.95, 7.95, 4.95, 10.95, 10.95, 9.95, 7.95 };
		String[] GoldenWok = new String[] { "Pad Thai", "Crab Rangoon 6 pc.", "Chicken Fried Rice",
				"Sweet & Sour Chicken", "Golden Shrimp Flower", "Hot & Sour Soup", "Pho Seafood",
				"Broccoli w/Garlic Sauce", "Mongolian Beef" };
		double[] GoldenWokP = new double[] { 9.75, 4.95, 8.95, 10.35, 5.95, 3.15, 10.95, 9.25, 10.95 };
		// Latin American Food Arrays
		String[] Chipotle = new String[] { "Steak Burrito/Bowl/3 Tacos/Salad", "Chicken Burrito/Bowl/3 Tacos/Salad",
				"Carnitas Burrito/Bowl/3 Tacos/Salad", "Sofritas Burrito/Bowl/3 Tacos/Salad",
				"Vegetarian Burrtio/Bowl/3 Tacos/Salad", "Cheese Quesadilla", "Chips & Guacamole" };
		double[] ChipotleP = new double[] { 7.41, 8.55, 7.92, 7.41, 7.41, 4.84, 3.70 };
		String[] Maize = new String[] { "Guacomole", "Nachos", "Taco Americano", "Taco Mexica", "Taco de Lomo",
				"Taco Pescado", "Taco Campesino", "Taco Veggie", "Burrito", "Torta" };
		double[] MaizeP = new double[] { 6.95, 9.95, 2.99, 3.25, 3.45, 3.25, 3.45, 5.25, 2.5, 6.40, 6.45 };
		String[] BurritoKing = new String[] { "Cheese Nachos", "Cheese, Beans and Beef Nachos", "Steak Nachos Fajita",
				"Breakfast Burrito", "Burrito King", "Super Burrito", "Acapulco", "Huevos a la Mexicana" };
		double[] BurritoKingP = new double[] { 4.00, 6.25, 7.50, 6.25, 9.99, 8.49, 10.50, 6.25 };
		// American Food Arrays
		String[] McDonalds = new String[] { "Big Mac", "Quarter Pounder w/Cheese", "10 Pc Chicken Nuggets",
				"McChicken/McDouble", "Fillet-O-Fish", "Premium McWrap", "Double Quarter Pounder", "SouthWest Salad",
				"Sausage Biscuit/Sausage McMuffin", "Bacon ClubHouse Burger" };
		double[] McDonaldsP = new double[] { 4.55, 6.83, 5.12, 1.58, 4.32, 5.00, 4.32, 5.46, 1.36, 5.12 };
		String[] BurgerKing = new String[] { "Whopper", "Double Whopper", "Original Chicken Sandwich",
				"Chicken Nuggets 10 Pc", "Bacon CheeseBurger", "Onion Rings", "Crispy Chicken Jr" };
		double[] BurgerKingP = new double[] { 4.78, 6.03, 4.66, 6.83, 1.70, 1.58, 1.14 };
		String[] Subway = new String[] { "BLT", "Black Forst Ham", "Chicken & Bacon Ranch Melt", "Oven Roasted Chicken",
				"MeatBall Marinara", "Steak & Cheese", "Tuna", "Roast Beef", "Spicy Italian" };
		double[] SubwayP = new double[] { 6.27, 6.27, 8.83, 7.69, 6.27, 8.83, 7.69, 8.83, 6.27 };
		String[] Panera = new String[] { "Frontega Chicken", "Steak & White Cheddar", "Roasted Turkey & Avocado BLT",
				"Bacon Turkey Bravo", "Napa Almond Chicken Salad", "Italian Combo Sandwich", "Steak & Arugula Sandwich",
				"Chicken Tortellini Alfredo" };
		double[] PaneraP = new double[] { 9.11, 10.25, 10.25, 9.11, 8.42, 9.79, 10.25, 9.56 };
		// Indian/Middle Eastern Food Arrays
		String[] Ambar = new String[] { "Vegetable Samosa", "Vegetable Pakora", "Naan", "Tandoori Roti",
				"Chicken Biryani", "Lamb Biryani", "Aloo Mutter", "Aloo Gobi" };
		double[] AmbarP = new double[] { 2.99, 2.99, 1.49, 1.99, 9.99, 10.99, 8.99, 8.99 };
		String[] Bombay = new String[] { "Bombay Chicken Curry", "Saag Paneer", "Chicken Curry", "Chicken Vendaloo",
				"Chicken Tikka Masala", "Chicken Makhani", "Garlic Naan", "Chicken Biryani" };
		double[] BombayP = new double[] { 8.99, 10.99, 9.99, 9.99, 10.99, 10.99, 3.99, 10.99 };
		String[] Amaravati = new String[] { "Vegetarian Paneer Biryani", "Chicke Dum Biryani", "Andhra Chicken Curry",
				"Gulab Jamun", "2 Piece Puri Bhaji", "2 Piece Chole Puri", "Chole Batura", "Dal Thadka",
				"Channa Masala" };
		double[] AmaravatiP = new double[] { 11.99, 10.99, 11.99, 2.99, 7.99, 8.49, 8.99, 8.99, 9.99 };
		// Desserts Arrays
		String[] InsomniaCookies = new String[] { "Chocolate Chunk Cookie", "Double Chocolate Chunk Cookie",
				"M&M Cookie", "Oatmeal Raisan Cookie", "Peanut Butter Chip Cookie", "Snickerdoodle Cookie",
				"Sugar Cookie", "Double Chocolate Mint Cookie", "White Chocolate Macadamia Cookie" };
		double[] InsomniaCookiesP = new double[] { 1.55, 1.55, 1.55, 1.55, 1.55, 1.55, 1.55, 1.55, 1.55 };
		String[] Coldstone = new String[] { "Browni A La Cold Stone", "Churro Caramel Crave", "Chocolate Lava Meltdown",
				"No Fair Funnel Cake", "Hot For Cookie", "Waffle Cone", "Dipped Waffle Cone", "Ice Cream Cupcakes",
				"Ice Cream Sandwiches" };
		double[] ColdstoneP = new double[] { 6.83, 6.83, 6.83, 6.83, 6.83, 1.14, 2.28, 15.96, 11.40 };
		String[] ParisSuper = new String[] { "Banana Nutella Crepe", "Wild Berry Crepe", "Chocolate Lover Crepe",
				"Signature Crepe", "Cheese Cake Delight", "Paris Super Crepe", "Milk Shakes", "LighBulb Drinks" };
		double[] ParisSuperP = new double[] { 6.50, 6.95, 7.50, 7.50, 7.50, 7.50, 4.00, 4.95 };
		// End of Arrays
		Scanner userInput = new Scanner(System.in);
		int category;
		int budget;

		String hungerResponse;
		System.out.println("Hello! Welcome to Gruba Hub Hub. Are you feeling hungry today?");
		hungerResponse = userInput.next();
		while ((!hungerResponse.equalsIgnoreCase("yes")) && !hungerResponse.equalsIgnoreCase("no")) {
			System.out.println("Please use only 'Yes' or 'No'.");
			System.out.println("Hello! Welcome to Gruba Hub Hub. Are you feeling hungry today?");
			hungerResponse = userInput.next();
		}
		
		if (hungerResponse.equalsIgnoreCase("no")) {
			System.out.println("Awwww. We'll help you find something next time.");
		} else if (hungerResponse.equalsIgnoreCase("yes")) {

			System.out.println("You must be hungry! Let's find you something to eat!");
			System.out.println("Here are the food categories that you can choose from:");
			while (hungerResponse.equalsIgnoreCase("yes")) {
				printMenu();
				category = userInput.nextInt();
				while (category > 5) {
					System.out.println("Please only choose from 1, 2, 3, 4, or 5.");
					category = userInput.nextInt();
				}
					// Asian
					if (category == 1) {
						System.out.println("You have chosen Asian Cuisine!");
						System.out.println("Please select your budget for this meal:");
						System.out.println("1: Low ($0-$5)");
						System.out.println("2: Medium ($5-$9) ");
						System.out.println("3: All Out ($9+) ");
						budget = userInput.nextInt();
						while (budget > 3) {
							System.out.println("Please select from either 1, 2, or 3.");
							budget = userInput.nextInt();
						}
						if (budget == 1) {
							System.out.println("Here are your dining options for a low budget:");
							System.out.println("Cravings:");
							for (int i = 0; i < CravingsP.length; i++) {
								if (CravingsP[i] < 5) {
									System.out.println(Cravings[i] + ": " + "$" + CravingsP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Sakanaya:");
							for (int i = 0; i < SakanayaP.length; i++) {
								if (SakanayaP[i] < 5) {
									System.out.println(Sakanaya[i] + ": " + "$" + SakanayaP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("SpoonHouse:");
							for (int i = 0; i < SpoonHouseP.length; i++) {
								if (SpoonHouseP[i] < 5) {
									System.out.println(SpoonHouse[i] + ": " + "$" + SpoonHouseP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("GoldenWok:");
							for (int i = 0; i < GoldenWokP.length; i++) {
								if (GoldenWokP[i] < 5) {
									System.out.println(GoldenWok[i] + ": " + "$" + GoldenWokP[i]);
								}
							}
						} else if (budget == 2) {
							System.out.println("Here are your dining options for a medium budget:");
							System.out.println("Cravings:");
							for (int i = 0; i < CravingsP.length; i++) {
								if (CravingsP[i] > 5 && CravingsP[i] < 9) {
									System.out.println(Cravings[i] + ": " + "$" + CravingsP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Sakanaya:");
							for (int i = 0; i < SakanayaP.length; i++) {
								if (SakanayaP[i] > 5 && SakanayaP[i] < 9) {
									System.out.println(Sakanaya[i] + ": " + "$" + SakanayaP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("SpoonHouse:");
							for (int i = 0; i < SpoonHouseP.length; i++) {
								if (SpoonHouseP[i] > 5 && SpoonHouseP[i] < 9) {
									System.out.println(SpoonHouse[i] + ": " + "$" + SpoonHouseP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("GoldenWok:");
							for (int i = 0; i < GoldenWokP.length; i++) {
								if (GoldenWokP[i] > 5 && GoldenWokP[i] < 9) {
									System.out.println(GoldenWok[i] + ": " + "$" + GoldenWokP[i]);
								}
							}
						} else if (budget == 3) {
							System.out.println("Here are your dining options for an all out budget:");
							System.out.println("Cravings:");
							for (int i = 0; i < CravingsP.length; i++) {
								if (CravingsP[i] > 9) {
									System.out.println(Cravings[i] + ": " + "$" + CravingsP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Sakanaya:");
							for (int i = 0; i < SakanayaP.length; i++) {
								if (SakanayaP[i] > 9) {
									System.out.println(Sakanaya[i] + ": " + "$" + SakanayaP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("SpoonHouse:");
							for (int i = 0; i < SpoonHouseP.length; i++) {
								if (SpoonHouseP[i] > 9) {
									System.out.println(SpoonHouse[i] + ": " + "$" + SpoonHouseP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("GoldenWok:");
							for (int i = 0; i < GoldenWokP.length; i++) {
								if (GoldenWokP[i] > 9) {
									System.out.println(GoldenWok[i] + ": " + "$" + GoldenWokP[i]);
								}
							}
						}
					}
					// Latin American
					else if (category == 2) {
						System.out.println("You have chosen Latin American Cuisine!");
						System.out.println("Please select your budget for this meal:");
						System.out.println("1: Low ($0-$5)");
						System.out.println("2: Medium ($5-$9) ");
						System.out.println("3: All Out ($9+) ");
						budget = userInput.nextInt();
						while (budget > 3) {
							System.out.println("Please select from either 1, 2, or 3.");
							budget = userInput.nextInt();
						}
						if (budget == 1) {
							System.out.println("Here are your dining options for a low budget:");
							System.out.println("Chipotle:");
							for (int i = 0; i < ChipotleP.length; i++) {
								if (ChipotleP[i] < 5) {
									System.out.println(Chipotle[i] + ": " + "$" + ChipotleP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Maize:");
							for (int i = 0; i < MaizeP.length; i++) {
								if (MaizeP[i] < 5) {
									System.out.println(Maize[i] + ": " + "$" + MaizeP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Burrito King:");
							for (int i = 0; i < BurritoKingP.length; i++) {
								if (BurritoKingP[i] < 5) {
									System.out.println(BurritoKing[i] + ": " + "$" + BurritoKingP[i]);
								}
							}
						} else if (budget == 2) {
							System.out.println("Here are your dining options for a medium budget:");
							System.out.println("Chipotle:");
							for (int i = 0; i < ChipotleP.length; i++) {
								if (ChipotleP[i] > 5 && ChipotleP[i] < 9) {
									System.out.println(Chipotle[i] + ": " + "$" + ChipotleP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Maize:");
							for (int i = 0; i < MaizeP.length; i++) {
								if (MaizeP[i] > 5 && MaizeP[i] < 9) {
									System.out.println(Maize[i] + ": " + "$" + MaizeP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Burrito King:");
							for (int i = 0; i < BurritoKingP.length; i++) {
								if (BurritoKingP[i] > 5 && BurritoKingP[i] < 9) {
									System.out.println(BurritoKing[i] + ": " + "$" + BurritoKingP[i]);
								}
							}
						} else if (budget == 3) {
							System.out.println("Here are your dining options for an all out budget:");
							System.out.println("Chipotle:");
							for (int i = 0; i < ChipotleP.length; i++) {
								if (ChipotleP[i] > 9) {
									System.out.println(Chipotle[i] + ": " + "$" + ChipotleP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Maize:");
							for (int i = 0; i < MaizeP.length; i++) {
								if (MaizeP[i] > 9) {
									System.out.println(Maize[i] + ": " + "$" + MaizeP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("BurritoKing:");
							for (int i = 0; i < BurritoKingP.length; i++) {
								if (BurritoKingP[i] > 9) {
									System.out.println(BurritoKing[i] + ": " + "$" + BurritoKingP[i]);
								}
							}
						}
					}
					// American
					else if (category == 3) {
						System.out.println("You have chosen American Cuisine!");
						System.out.println("Please select your budget for this meal:");
						System.out.println("1: Low ($0-$5)");
						System.out.println("2: Medium ($5-$9) ");
						System.out.println("3: All Out ($9+) ");
						budget = userInput.nextInt();
						while (budget > 3) {
							System.out.println("Please select from either 1, 2, or 3.");
							budget = userInput.nextInt();
						}
						if (budget == 1) {
							System.out.println("Here are your dining options for a low budget:");
							System.out.println("McDonald's:");
							for (int i = 0; i < McDonaldsP.length; i++) {
								if (McDonaldsP[i] < 5) {
									System.out.println(McDonalds[i] + ": " + "$" + McDonaldsP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Burger King");
							for (int i = 0; i < BurgerKingP.length; i++) {
								if (BurgerKingP[i] < 5) {
									System.out.println(BurgerKing[i] + ": " + "$" + BurgerKingP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Subway:");
							for (int i = 0; i < SubwayP.length; i++) {
								if (SubwayP[i] < 5) {
									System.out.println(Subway[i] + ": " + "$" + SubwayP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Panera");
							for (int i = 0; i < PaneraP.length; i++) {
								if (PaneraP[i] < 5) {
									System.out.println(Panera[i] + ": " + "$" + PaneraP[i]);
								}
							}
						} else if (budget == 2) {
							System.out.println("Here are your dining options for a medium budget:");
							System.out.println("McDonald's:");
							for (int i = 0; i < McDonaldsP.length; i++) {
								if (McDonaldsP[i] > 5 && McDonaldsP[i] < 9) {
									System.out.println(McDonalds[i] + ": " + "$" + McDonaldsP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Burger King:");
							for (int i = 0; i < BurgerKingP.length; i++) {
								if (BurgerKingP[i] > 5 && BurgerKingP[i] < 9) {
									System.out.println(BurgerKing[i] + ": " + "$" + BurgerKingP[i]);
								}
							}

							System.out.println("--------------");
							System.out.println("Subway:");
							for (int i = 0; i < SubwayP.length; i++) {
								if (SubwayP[i] > 5 && SubwayP[i] < 9) {
									System.out.println(Subway[i] + ": " + "$" + SubwayP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Panera");
							for (int i = 0; i < PaneraP.length; i++) {
								if (PaneraP[i] > 5 && PaneraP[i] < 9) {
									System.out.println(Panera[i] + ": " + "$" + PaneraP[i]);
								}
							}
						} else if (budget == 3) {
							System.out.println("Here are your dining options for an all out budget:");
							System.out.println("McDonald's:");
							for (int i = 0; i < McDonaldsP.length; i++) {
								if (McDonaldsP[i] > 9) {
									System.out.println(McDonalds[i] + ": " + "$" + McDonaldsP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Burger King:");
							for (int i = 0; i < BurgerKingP.length; i++) {
								if (BurgerKingP[i] > 9) {
									System.out.println(BurgerKing[i] + ": " + "$" + BurgerKingP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Subway:");
							for (int i = 0; i < SubwayP.length; i++) {
								if (SubwayP[i] > 9) {
									System.out.println(Subway[i] + ": " + "$" + SubwayP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Panera");
							for (int i = 0; i < PaneraP.length; i++) {
								if (PaneraP[i] > 9) {
									System.out.println(Panera[i] + ": " + "$" + PaneraP[i]);
								}
							}
						}

					}
					// Indian/Middle Eastern
					else if (category == 4) {
						System.out.println("You have chosen Indian Cuisine!");
						System.out.println("Please select your budget for this meal:");
						System.out.println("1: Low ($0-$5)");
						System.out.println("2: Medium ($5-$9) ");
						System.out.println("3: All Out ($9+) ");
						budget = userInput.nextInt();
						while (budget > 3) {
							System.out.println("Please select from either 1, 2, or 3.");
							budget = userInput.nextInt();
						}
						if (budget == 1) {
							System.out.println("Here are your dining options for a low budget:");
							System.out.println("Ambar:");
							for (int i = 0; i < AmbarP.length; i++) {
								if (AmbarP[i] < 5) {
									System.out.println(Ambar[i] + ": " + "$" + AmbarP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Bombay:");
							for (int i = 0; i < BombayP.length; i++) {
								if (BombayP[i] < 5) {
									System.out.println(Bombay[i] + ": " + "$" + BombayP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Amaravati:");
							for (int i = 0; i < AmaravatiP.length; i++) {
								if (AmaravatiP[i] < 5) {
									System.out.println(Amaravati[i] + ": " + "$" + AmaravatiP[i]);
								}
							}
						} else if (budget == 2) {
							System.out.println("Here are your dining options for a medium budget:");
							System.out.println("Ambar:");
							for (int i = 0; i < AmbarP.length; i++) {
								if (AmbarP[i] > 5 && AmbarP[i] < 9) {
									System.out.println(Ambar[i] + ": " + "$" + AmbarP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Bombay:");
							for (int i = 0; i < BombayP.length; i++) {
								if (BombayP[i] > 5 && BombayP[i] < 9) {
									System.out.println(Bombay[i] + ": " + "$" + BombayP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Amaravati:");
							for (int i = 0; i < AmaravatiP.length; i++) {
								if (AmaravatiP[i] > 5 && AmaravatiP[i] < 9) {
									System.out.println(Amaravati[i] + ": " + "$" + AmaravatiP[i]);
								}
							}
						} else if (budget == 3) {
							System.out.println("Here are your dining options for an all out budget:");
							System.out.println("Ambar:");
							for (int i = 0; i < AmbarP.length; i++) {
								if (AmbarP[i] > 9) {
									System.out.println(Ambar[i] + ": " + "$" + AmbarP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Bombay:");
							for (int i = 0; i < BombayP.length; i++) {
								if (BombayP[i] > 9) {
									System.out.println(Bombay[i] + ": " + "$" + BombayP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Amaravati:");
							for (int i = 0; i < AmaravatiP.length; i++) {
								if (AmaravatiP[i] > 9) {
									System.out.println(Amaravati[i] + ": " + "$" + AmaravatiP[i]);
								}
							}
						}
					}
					// Desserts
					else if (category == 5) {
						System.out.println("You have chosen Desserts!");
						System.out.println("Please select your budget for this meal:");
						System.out.println("1: Low ($0-$5)");
						System.out.println("2: Medium ($5-$9) ");
						System.out.println("3: All Out ($9+) ");
						budget = userInput.nextInt();
						while (budget > 3) {
							System.out.println("Please select from either 1, 2, or 3.");
							budget = userInput.nextInt();
						}
						if (budget == 1) {
							System.out.println("Here are your dining options for a low budget:");
							System.out.println("Insomnia Cookies:");
							for (int i = 0; i < InsomniaCookiesP.length; i++) {
								if (InsomniaCookiesP[i] < 5) {
									System.out.println(InsomniaCookies[i] + ": " + "$" + InsomniaCookiesP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Coldstone:");
							for (int i = 0; i < ColdstoneP.length; i++) {
								if (ColdstoneP[i] < 5) {
									System.out.println(Coldstone[i] + ": " + "$" + ColdstoneP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Paris Super:");
							for (int i = 0; i < ParisSuperP.length; i++) {
								if (ParisSuperP[i] < 5) {
									System.out.println(ParisSuper[i] + ": " + "$" + ParisSuperP[i]);
								}
							}
						} else if (budget == 2) {
							System.out.println("Here are your dining options for a medium budget:");
							System.out.println("Insomnia Cookies:");
							for (int i = 0; i < InsomniaCookiesP.length; i++) {
								if (InsomniaCookiesP[i] > 5 && InsomniaCookiesP[i] < 9) {
									System.out.println(InsomniaCookies[i] + ": " + "$" + InsomniaCookiesP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Coldstone:");
							for (int i = 0; i < ColdstoneP.length; i++) {
								if (ColdstoneP[i] > 5 && ColdstoneP[i] < 9) {
									System.out.println(Coldstone[i] + ": " + "$" + ColdstoneP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Paris Super:");
							for (int i = 0; i < ParisSuperP.length; i++) {
								if (ParisSuperP[i] > 5 && ParisSuperP[i] < 9) {
									System.out.println(ParisSuper[i] + ": " + "$" + ParisSuperP[i]);
								}
							}
						} else if (budget == 3) {
							System.out.println("Here are your dining options for an all out budget:");
							System.out.println("Insomnia Cookies:");
							for (int i = 0; i < InsomniaCookiesP.length; i++) {
								if (InsomniaCookiesP[i] > 9) {
									System.out.println(InsomniaCookies[i] + ": " + "$" + InsomniaCookiesP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Coldstone:");
							for (int i = 0; i < ColdstoneP.length; i++) {
								if (ColdstoneP[i] > 9) {
									System.out.println(Coldstone[i] + ": " + "$" + ColdstoneP[i]);
								}
							}
							System.out.println("--------------");
							System.out.println("Paris Super:");
							for (int i = 0; i < ParisSuperP.length; i++) {
								if (ParisSuperP[i] > 9) {
									System.out.println(ParisSuper[i] + ": " + "$" + ParisSuperP[i]);
								}
							}
						}

					}

					System.out.println("Would you like to search again?");
					hungerResponse = userInput.next();
					while ((hungerResponse.length() >= 3 || hungerResponse.length() <= 3) && (!hungerResponse.equalsIgnoreCase("yes")) && !hungerResponse.equalsIgnoreCase("no")) {
						System.out.println("Please use only 'Yes' or 'No'.");
						hungerResponse = userInput.next();
					}
					if (hungerResponse.equalsIgnoreCase("no")) {
						System.out.println("Thank You! See you next time!");
						
					}
			}
		}
	}

	public static void printMenu() {
		System.out.println("1: Asian ");
		System.out.println("2: Latin American ");
		System.out.println("3: American ");
		System.out.println("4: Indian/Middle Eastern ");
		System.out.println("5: Desserts ");
		System.out.println("Choose one category by picking from 1, 2, 3, 4, or 5.");
	}

}
