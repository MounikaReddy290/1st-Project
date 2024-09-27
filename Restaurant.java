package apjfsa;
class Restaurant1
{
	//method for single order/
	public void placeOrder(String item)
	{
		System.out.println("order is for single item:"+item);
		
	}
	//method for multiple orders
	public void placeOrder(String item1,String item2,String item3)
	{
		System.out.println("Oreder for mutiple items ");

		System.out.print(item1+",");
		System.out.print(item2+",");
		System.out.print(item3+",");
		
	}
	//method for items and specialInstructions
    public void placeOrder(String itemName, int quantity, String specialInstructions) {
        System.out.println("Order placed for item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Special Instructions: " + specialInstructions);
    }

		
	
}
public class Restaurant {

	public static void main(String[] args) {
		
        Restaurant1 restaurant = new Restaurant1();
        
        // Place a single item order
        restaurant.placeOrder("Sanwich");
        
        // Place a multiple items order
      restaurant.placeOrder("Burger","Coke","frenchfries");
        // Place an order with special instructions
        restaurant.placeOrder("Pizza", 2, "Extra cheese, no onions");

	}

}