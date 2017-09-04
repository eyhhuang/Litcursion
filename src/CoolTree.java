
public class CoolTree {
	public static void main(){
		drawTree(15,.5,.1,.3,Math.PI/2);
	}
	private static void Tree(double x, double y, double size, double angle){
		double x1 = x + size*Math.cos(angle);
		double y1 = y + size*Math.sin(angle);
		StdDraw.line(x, y, x1, y1);
	}
	private static void drawTree(int N, double x, double y, double size, double angle){
		if(N==0)return;
		StdDraw.setPenRadius(0.001*Math.pow(N/4,2.5));
		Tree(x,y,size,angle);
		double size1 = size*0.8;
		double size2 = size*0.75;
		double angle1 = angle + Math.PI/9;
		double angle2 = angle - Math.PI*5/11;
		double x1 = x + size/2*Math.cos(angle);
		double y1 = y + size/2*Math.sin(angle);
		double x2 = x1 + size1*Math.cos(angle1);
		double y2 = y1 + size1*Math.sin(angle1)+ N*0.002;
		drawTree(N-1,x1,y1,size1,angle1);
		drawTree(N-1,x2,y2,size2,angle2);
	}	
}
