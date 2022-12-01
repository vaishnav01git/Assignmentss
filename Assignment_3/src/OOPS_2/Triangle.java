package OOPS_2;

public class Triangle implements Shape {

	@Override
	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfTriangle = ((vertexB - vertexA) * (vertexC / 2));
		System.out.println("Area Of Triangle=" + areaOfTriangle);

	}

}
