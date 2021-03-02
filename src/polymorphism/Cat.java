package polymorphism;

public class Cat extends Animal {

	private String meow;

	public Cat() {
		super();	
	}

	public Cat(String meow ) {
		this.meow = meow;
	}

	public Cat(String meow, String walk, String eat, String cuddle) {
		super(walk, eat, cuddle);
		setWalk(walk);
		setEat(eat);
		setCuddle(cuddle);
	}

	public String getMeow() {
		return meow;
	}

	public void setMeow(String meow) {
		this.meow = meow;
	}

	@Override
	public String toString() {
		return "Cat [meow=" + meow + ", getWalk()=" + getWalk() + ", getEat()=" + getEat() + ", getCuddle()="
				+ getCuddle() + "]";
	}
}
