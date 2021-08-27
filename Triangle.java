import java.lang.Math;

public class Triangle {

	public int x1, x2, x3;
	public int y1, y2, y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
	}
	
	public String toString() {
		return "Triangle [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + "]";
	}

	public boolean containsPoint(int x, int y)
		{  
		// Calculate area of triangle possible triangles with new coord
		
		double A = area(x1, y1, x2, y2, x3, y3);
		double A1 = area(x, y, x2, y2, x3, y3);
		double A2 = area(x1, y1, x, y, x3, y3);
		double A3 = area(x1, y1, x2, y2, x, y);
		
		// Check if sum of A1, A2 and A3 is same as A 
		return (A == A1 + A2 + A3);
		}

	public double area(int x1, int y1, int x2, int y2, int x3, int y3)
		{
		return Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);
		}
}
