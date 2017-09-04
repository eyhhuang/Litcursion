
public class Memento {
	private static void Meme(double x, double y, double angle, double length){
		double width = length *2/3;
		double side = length/2*Math.cos(angle) + width/2*Math.sin(angle);
		double Bx = x + length*Math.cos(angle);
		double By = y + length*Math.sin(angle);
		double Cx = Bx + width*Math.cos(angle - Math.PI/2);
		double Cy = By + width*Math.sin(angle - Math.PI/2);
		double Dx = x + width*Math.cos(angle - Math.PI/2);
		double Dy = y + width*Math.sin(angle - Math.PI/2);
		double[] xRec = {x, Bx, Cx, Dx};
		double[] yRec = {y, By,Cy, Dy};
		double Px = x + (width - side)/2*Math.cos(Math.PI/2-angle);
		double Py = By - (side - (width - side)/2)*Math.sin(Math.abs(angle));
		double Qx = Px + side*Math.cos(angle);
		double Qy = Py + side*Math.sin(angle);
		double Rx = Qx + side*Math.cos(angle - Math.PI/2);
		double Ry = Qy + side*Math.sin(angle - Math.PI/2);
		double Sx = Px + side*Math.cos(angle - Math.PI/2);
		double Sy = Py + side*Math.sin(angle - Math.PI/2);
		double[] xSqu = {Px,Qx,Rx,Sx};
		double[] ySqu = {Py,Qy,Ry,Sy}; 
		StdDraw.filledPolygon(xRec,yRec);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledPolygon(xSqu, ySqu);
		StdDraw.setPenColor(StdDraw.BLACK;
	}
	private static void drawMeme(int N, double x, double y, double angle, double length){
		if(N==0)return;
		double x1; 
		double y1;
		
		
	}
}
