import java.util.ArrayList;

public class Drinks {
    ArrayList<String> drinkList = new ArrayList();
    
    public void SetDrinks(String drinkNames) {
        drinkList.add(drinkNames); 
    }

    
    public void DisplayDrinks() {
        System.out.println("\nDrinks: ");
        
        for (int i = 0; i < drinkList.size(); i++) {
            System.out.println(drinkList.get(i));
        }
    }
    
    public void RemoveDrinks(String drinkRemove) {
        drinkList.remove(drinkRemove);
    }
}
