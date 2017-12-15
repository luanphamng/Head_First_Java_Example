package chap3PoolPuzzle;

public class PoolPuzzle {
	
	double area;
	int height;
	int length;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PoolPuzzle[] ta = new PoolPuzzle[4];
		int x = 0;
		while(x<4) {
			ta[x] = new PoolPuzzle();
			ta[x].height  = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			System.out.print("triangle " +x+ ", area");
			System.out.println(" = " + ta[x].area);			
			x++;
			
		}
		
		int y = x;
		x = 27;
		PoolPuzzle ta5 = ta[2];
		ta5.area = 343;
		
		System.out.print("y = " +y);
		System.out.println(", t5 area = " +ta5.area);
	}
	
	
	

	void setArea() {
		area = (height * length) / 2;
	}	
}
