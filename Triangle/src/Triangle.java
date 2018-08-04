//program to check triangle type
public class Triangle {

	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	public boolean isRight(int side1, int side2, int side3) {
		if ((side1 * side1) == ((side2 * side2) + (side3 * side3))
				|| ((side2 * side2) == (side1 * side1) + (side3 * side3))
				|| (side3 * side3) == (side2 * side2) + (side1 * side1))
			return true;
		else
			return false;

	}

	public int isIsosceles(int side1, int side2, int side3) {
		if ((side1 == side2) || (side2 == side3) || (side1 == side3))
			return 1;
		else
			return 0;
	}

	public int equilateral(int side1, int side2, int side3) {
		if ((side1 == side2) && (side2 == side3))
			return 1;
		else
			return 0;

	}

}
