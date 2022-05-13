import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		
		if (a > 0 && b > 0) {
			 return a + b;
		} else {
			throw new IllegalArgumentException("Both Parameters must be positive!");
		}
		
	}

	public int getRandomInt() {
		
		Random random = new Random();
		int num = random.nextInt(10) + 1;
		return num * num;
	}
	
	public int randomNumberSquared() {
		return getRandomInt();
	}
	
}
