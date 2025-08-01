import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    Foods foods = new Foods();
	    Drinks drinks = new Drinks();
	    
	    int selection = 0;
	    boolean terminate = false;
	    String foodNames = "";
	    String drinkNames = "";
		String foodRemove = "";
		String drinkRemove = "";
		int foodCount = 0;
		int drinkCount = 0;
		
		while (!terminate) {
            System.out.print("\nSelect an option 1 - Show List of Foods, 2 - Show List of Drinks, 3 - Add 3 Foods, ");
    		System.out.print("4 - Add 3 Drinks, 5 - Remove a Food, 6 - Remove a Drink, 7 - End the Program --- ");
    		selection = input.nextInt();
    		input.nextLine();
    		
		    if (selection == 1) {
		        if (!foods.foodList.isEmpty()) { // first approach to and mas advisable
		            foods.DisplayFoods();
		        } else {
		            System.out.println("\nThe list is empty. Input foods first.");
		        }
		        
		    } else if (selection == 2) {
		        if (drinks.drinkList.size() == 0) { // second approach ashdahs 
		           System.out.println("\nThe list is empty. Input drinks first.");
		        } else {
		           drinks.DisplayDrinks();
		        }
		        
		    } else if (selection == 3) {
		        if (!foods.foodList.isEmpty()) { 
                    foods.DisplayFoods();
		        } 
		        
		        for (int i = 1; i <= 3; i++) {
                    System.out.print(i + ". Food Name: ");
                    foodNames = input.nextLine();
                
                    if (!foods.foodList.contains(foodNames)) { 
                        foods.SetFoods(foodNames);
                        System.out.println(foodNames + " is successfully listed.");
                    } else {
                        System.out.println(foodNames + " is already listed.");
                        i--; 
                    }
                }
		        
		    } else if (selection == 4) {
		        if (!drinks.drinkList.isEmpty()) {
                    drinks.DisplayDrinks();
		        }
		        
		        for (int j = 1; j <= 3; j++) {
                    System.out.print(j + ". Drink Name: ");
                    drinkNames = input.nextLine();
                
                    if (!drinks.drinkList.contains(drinkNames)) { 
                        drinks.SetDrinks(drinkNames);
                        System.out.println(drinkNames + " is successfully listed.");
                    } else {
                        System.out.println(drinkNames + " is already listed.");
                        j--; 
                    }
		        }
		    } else if (selection == 5) {
		        if (!foods.foodList.isEmpty()) {
		            foods.DisplayFoods();
		            
		          //  while (!foodRemoval) {
		                // cancel ko kasi mas complicated sa user
		          //  }
                    System.out.print("How many foods do you want to remove?: ");
                    foodCount = input.nextInt();
                    input.nextLine();
                    
                    if (foodCount > foods.foodList.size() || foodCount == 0) { // not sure if included, added it anyway 
                         System.out.println("Invalid number of foods to remove.");
                    
                    } else {
                        for (int k = 1; k <= foodCount; k++) {
                            System.out.print(k + ". Remove food: ");
                            foodRemove = input.nextLine();
                            
        		            if (foods.foodList.contains(foodRemove)) {
        		                foods.RemoveFoods(foodRemove);
        		                System.out.println(foodRemove + " is successfully removed from the list.");
        		                
        		            } else {
        		                System.out.println(foodRemove + " is not on the list.");
        		                k--;
        		            }
                        }
                    }
		        } else {
		            System.out.println("\nThe list is empty. Input foods first.");
		        }

		    } else if (selection == 6) {
		        if (!drinks.drinkList.isEmpty()) {
		            drinks.DisplayDrinks();
		            
                    System.out.print("How many drinks do you want to remove?: ");
                    drinkCount = input.nextInt();
                    input.nextLine();
                    
                    if (drinkCount > drinks.drinkList.size() || drinkCount == 0) {
                         System.out.println("Invalid number of drink to remove.");
                    
                    } else {
                        for (int l = 1; l <= drinkCount; l++) {
                            System.out.print(l + ". Remove drink: ");
                            drinkRemove = input.nextLine();
                            
        		            if (drinks.drinkList.contains(drinkRemove)) {
        		                drinks.RemoveDrinks(drinkRemove);
        		                System.out.println(drinkRemove + " is successfully removed from the list.");
        		                
        		            } else {
        		                System.out.println(drinkRemove + " is not on the list.");
        		                l--;
        		            }
                        }
                    }
		        } else {
		            System.out.println("\nThe list is empty. Input foods first.");
		        }
		        
		    } else if (selection == 7) {
		        System.out.println("Thank you for using this program.");
		        terminate = true;
		    } else {
		        System.out.println("Invalid option.");
		    }
		}
	}
}
