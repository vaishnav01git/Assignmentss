package Com.Yash.Class_Object;

public class Box {

	int length;
	int width;
	int height;
	int volume;

	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int getVolume() {
		volume = length * width * height;
		return volume;
	}

	public static void main(String[] args) {
		Box b = new Box(2, 3, 4);

		System.out.println("The Volume of Box is " + b.getVolume());

	}
}
