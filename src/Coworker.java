
public class Coworker {
	String name;
	int coffeePrice;
	int daysToPay;
	double percentage;
	
	public Coworker(String name, int coffeePrice) {
		super();
		this.name = name;
		this.coffeePrice = coffeePrice;
		daysToPay = 0;
		percentage = 0;
	}

	@Override
	public String toString() {
		return name + " : " + daysToPay + " days";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(int coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

	public int getDaysToPay() {
		return daysToPay;
	}
	
	public void setDaysToPay(int daysToPay) {
		this.daysToPay = daysToPay;
	}

	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}

