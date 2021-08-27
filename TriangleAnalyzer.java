
public class TriangleAnalyzer {
		
		public static void main(String[] args) {
			
			//https://projecteuler.net/problem=102
			
			Triangle a = new Triangle(-340, 495, -153, -910, 835, -947);
			//triangle coordiantes input as (x1,y1), (x2,y2), (x3,y3)
			
			System.out.println(a.toString() + "\n");
			System.out.println(a.containsPoint(0,0));
			
		}
	}
