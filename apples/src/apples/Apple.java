package apples;

public class Apple {
	
	private AppleColor color; 
	private int weight; 
	
	public Apple(){
		color = AppleColor.RED;
		weight = 100;
	}
	
	public Apple(AppleColor color,int weight){
		this.color = color;
		this.weight = weight;
	}
	
	public AppleColor getColor() {
		return color;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return Integer.toString(weight)
				+ " "
				+ color.name();
	}
	
	public Boolean isGreenApple() {
		return color.equals(AppleColor.GREEN);
	}
	
	public Boolean isRedApple() {
		return color.equals(AppleColor.RED);
	}
	
	public Boolean isYellowApple() {
		return color.equals(AppleColor.YELLOW);
	}
	
	public Boolean isHeavyApple() {
		return weight>=100;
	}
}