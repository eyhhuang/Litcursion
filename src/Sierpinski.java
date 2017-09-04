import java.util.*;
public class Sierpinski
{
   private static void drawTri(int N, double x, double y, double r){
       if(N==0)return;
       Tri(x, y, r);
       double x0 = x-r*Math.cos(Math.PI/6);
       double x1 = x+r*Math.cos(Math.PI/6);
       double y0 = y-r/2;
       double y1 = y+r;
       StdDraw.setPenColor(StdDraw.RED);
       drawTri(N-1,x0,y0,r/2);
       StdDraw.setPenColor(StdDraw.BLUE);
       drawTri(N-1,x1,y0,r/2);
       StdDraw.setPenColor(StdDraw.YELLOW);
       drawTri(N-1,x,y1,r/2);
    }
   
   private static void Tri(double x, double y, double r){
       double x0 = x - Math.cos(Math.PI/6)*r;
       double x1 = x + Math.cos(Math.PI/6)*r;
       double y0 = y - r;
       double y1 = y + r*Math.sin(Math.PI/6);
       StdDraw.line(x0,y1,x1,y1);
       StdDraw.line(x0,y1, x, y0);
       StdDraw.line(x1,y1,x,y0);
       StdDraw.ellipse(x,y,r*(Math.tan(Math.PI/6)),r/5);
       StdDraw.filledCircle(x,y,r/5);
    }
   
    public static void main(){
        drawTri(6, .5, .3, .3);
    }
    
}
