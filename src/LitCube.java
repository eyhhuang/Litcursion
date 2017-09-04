
public class LitCube {
	private static final double ANGLE = Math.PI/4;
    private static final int LEVELS = 6;
	public static void main(){
		drawCube(LEVELS,.3,.3,.6);
	}
	private static void Cube(double x, double y, double size){
		double side = size/2/Math.cos(ANGLE);
		double Ax = x - size/2;
		double Ay = y + size/2;
		double Bx = Ax + side*Math.cos(ANGLE);
		double By = Ay + side*Math.sin(ANGLE);
		double Cx = Bx + size;
		double Cy = By;
		double Dx = Ax + size;
		double Dy = Ay;
		double Ex = x + size/2;
		double Ey = y - size/2;
		double Fx = Ex + side*Math.cos(ANGLE);
		double Fy = Ey + side*Math.sin(ANGLE);
		
		StdDraw.filledSquare(x, y, size/2);
		StdDraw.line(Ax, Ay , Bx, By);
		StdDraw.line(Bx, By, Cx, Cy);
		StdDraw.line(Cx, Cy, Dx, Dy);
		StdDraw.line(Cx, Cy, Fx, Fy);
		StdDraw.line(Ex, Ey, Fx, Fy);
	}
	
	private static void drawCube(int N, double x, double y, double size){
		if(N==0)return;
		Cube(x, y, size);
		StdDraw.setPenColor(255/N,0,0);
		double x1 = x + size/4;
		double y1 = y - size/4;
		double x2 = x + size/2;
		double y2 = y + size/2;
		drawCube(N-1,x,y,size/2);
		drawCube(N-1,x1,y1,size/2);
		drawCube(N-1,x2,y2,size/2);
	}
}
