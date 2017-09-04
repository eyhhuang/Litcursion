
public class SickTriangle {
	   public static void sickTriangle(){
	        help(25, 0.5, 0.5, 0.5,.04 );
	    }
	    
	    private static void help(int N, double centerX, double centerY, double size, double inc){
	        double Ax = centerX - size*Math.cos(Math.PI/6);
	        double Ay = centerY - size*Math.sin(Math.PI/6);
	        double Bx = centerX;
	        double By = centerY + size;
	        double Cx = centerX + size*Math.cos(Math.PI/6);
	        double Cy = centerY - size*Math.sin(Math.PI/6);
	        drawPic(N, Ax, Ay, Bx, By, Cx, Cy, inc);
	    }
	    
	    private static void drawPic(int N, double Ax, double Ay, double Bx, double By, double Cx, double Cy, double x){
	        if(N==0)return;
	        StdDraw.setPenColor(255-10*N, 0,0);
	        Pic(Ax, Ay, Bx, By, Cx, Cy);
	        Ax += x;
	        Bx -= x*Math.cos(Math.PI/3);
	        By -= x*Math.sin(Math.PI/3);
	        Cx -= x*Math.cos(Math.PI/3);
	        Cy += x*Math.sin(Math.PI/3);

	        drawPic(N-1, Ax, Ay, Bx, By, Cx, Cy, x*.95);
	        
	    }
	    public static void Pic(double Ax, double Ay, double Bx, double By, double Cx, double Cy){
	        StdDraw.line(Ax, Ay, Bx, By);
	        StdDraw.line(Bx, By, Cx, Cy);
	        StdDraw.line(Ax, Ay, Cx, Cy);
	        
	    }
}
