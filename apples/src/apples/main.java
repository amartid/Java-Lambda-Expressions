package apples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class main {

	public static ArrayList<Apple> filter(ArrayList<Apple> list){
		ArrayList<Apple> result = new ArrayList<Apple>() {};
		for(Apple i:list) {
			if(i.getColor().equals(AppleColor.GREEN)) {
				result.add(i);
			}
		}
		return result;
	}
	
	public static ArrayList<Apple> filterHeavy(ArrayList<Apple> list){
		ArrayList<Apple> result = new ArrayList<Apple>() {};
		for(Apple i:list) {
			if(i.getWeight()>=100) {
				result.add(i);
			}
		}
		return result;
	}
	
	public static ArrayList<Apple> filterApples(ArrayList<Apple> list,Predicate<Apple> p){
		ArrayList<Apple> result = new ArrayList<Apple>() {};
		for(Apple i:list) {
			if(p.test(i)) {
				result.add(i);
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
//		Apple milo1 = new Apple();
		Apple milo2 = new Apple(AppleColor.YELLOW,92);
//		System.out.println( milo1.toString());
//		System.out.println( milo2.toString());
		
//		
		ArrayList<Apple> inventory = new ArrayList<Apple>() {};
		inventory.add(	new Apple(AppleColor.RED,90) );
		inventory.add(	new Apple(AppleColor.GREEN,100) );
		inventory.add(	new Apple(AppleColor.RED,70) );
		inventory.add(	new Apple(AppleColor.GREEN,95) );
//		//	for(Apple i:inventory) {
//		//		System.out.println(i.toString());
//		//	};
		System.out.print("Inventory");
		System.out.println(inventory.toString());
		
		ArrayList<Apple> greenApples = filter(inventory);
		System.out.print("Green Apples");
		System.out.println(greenApples.toString());
		
		ArrayList<Apple> heavyApples = filterHeavy(inventory);
		System.out.print("Heavy Apples");
		System.out.println(heavyApples.toString());
//		
//		ArrayList<Apple> filteredApples = filterApples(inventory,Apple::isRedApple);
//		ArrayList<Apple> declaredMethodApples = filterApples(inventory,Apple::isHeavyApple);
//		System.out.print("Filter Apples Predicate Passing a declared method as vallue");
//		System.out.println(declaredMethodApples.toString());
//		
//		ArrayList<Apple> lambdaApples = filterApples(inventory, (Apple a) -> a.getColor().equals(AppleColor.RED));
//
//		ArrayList<Apple> lambdaApples = filterApples(inventory, (Apple a) -> a.getWeight()>=100);
//		System.out.print("Filter Apples Predicate Passing a Lambda(an Anonymus method) as vallue");
//		System.out.println(lambdaApples.toString());

		Comparator<Apple> comp = (Apple a,Apple b) -> Integer.compare(a.getWeight(),b.getWeight());
		
		int lambdaComp = comp.compare(milo2, inventory.get(0));
		System.out.println(milo2.toString()+" COMPARED WITH "+inventory.get(0).toString()+" = "+lambdaComp);
//
		inventory.sort(comp);
		System.out.println("Sorted Inventory"+inventory.toString());
	}
}
