package day5;

enum Fruits {
	   Apple(800), Mango(700), Banana(750), DragonFruit(900), Grapes(500);
	
	   private int price;
	   
	   Fruits(int price) {
	      this.price = price;
	   }
	   public int getPrice() {
	      return this.price;
	   }
	}
	public class Enum_Class{
	   public static void main(String args[]) {
	      Fruits fruits[] = Fruits.values();
	      for(Fruits fru: fruits) {
	         System.out.println("Price of "+fru+" is: "+fru.getPrice());
	      }
	   }
	}