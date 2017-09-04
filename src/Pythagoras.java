public class Pythagoras {
	 public static void pythagoras(){
	        drawPy(7, .6, 0, .15, Math.PI/2, Math.PI/6);
	    }

	    private static void Py(double x, double y, double size, double angle){
	        double Bx = x + size*Math.cos(angle);
	        double By = y + size*Math.sin(angle);
	        double Cx = Bx + size*Math.cos(angle - Math.PI/2);
	        double Cy = By + size*Math.sin(angle - Math.PI/2);
	        double Dx = x + size*Math.cos(angle - Math.PI/2);
	        double Dy = y + size*Math.sin(angle - Math.PI/2);
	        StdDraw.line(x,y, Bx, By);
	        StdDraw.line(Bx, By, Cx, Cy);
	        StdDraw.line(Cx, Cy, Dx, Dy);
	        StdDraw.line(Dx, Dy, x, y);
	    }

	    private static void drawPy(int N, double x, double y, double size, double angle, double inc){
	        if(N==0)return;
	        if((N+1)%3 ==0){
	            StdDraw.setPenColor(StdDraw.BLACK);
	        }
	        else if((N+2)%3==0){
	            StdDraw.setPenColor(StdDraw.RED);
	        }
	        else{
	            StdDraw.setPenColor(StdDraw.BLUE);
	        }
	        Py(x,y,size,angle);
	        double size1 = size*Math.cos(inc);
	        double size2 = size*Math.sin(inc);
	        double angle1 = angle + inc;
	        double angle2 = angle - (Math.PI/2-inc);

	        double x1 = x + size*Math.cos(angle);
	        double y1 = y + size*Math.sin(angle);
	        //get to x1 y1 first then get to x2 y2 
	        double x2 = x1 + size1*Math.cos(angle1-Math.PI/2);
	        double y2 = y1 + size1*Math.sin(angle1 - Math.PI/2);
	        drawPy(N-1, x1, y1, size1, angle1,inc - Math.PI/50);
	        drawPy(N-1, x2, y2, size2, angle2,inc - Math.PI/50);
	    }
}
