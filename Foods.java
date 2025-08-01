import java.util.ArrayList;

public class Foods {
    ArrayList<String> foodList = new ArrayList();
    
    public void SetFoods(String foodNames) {
        foodList.add(foodNames); 
    }

    
    public void DisplayFoods() {
        System.out.println("\nFoods: ");
        
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }
    }
    
    public void RemoveFoods(String foodRemove) {
        foodList.remove(foodRemove);
    }
}
