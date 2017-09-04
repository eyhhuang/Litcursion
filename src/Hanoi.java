
import java.util.Stack;
import java.util.*;
/**
 * Tower of Hanoi
 * 
 * @author Emily Huang
 * @version 10-05-17
 */
public class Hanoi
{
    private static int discs;
    private static Stack<Integer> A = new Stack<Integer>();
    private static Stack<Integer> B = new Stack<Integer>();
    private static Stack<Integer> C = new Stack<Integer>();

    private Hanoi(int n){
        discs = n;
        //put the discs on the stack
        for(int i = n; i >= 1; i--){
            A.push(i);
        }
    }

    private static void drawPoles(int totalDiscs){
        StdDraw.clear();
        for (int i = 1; i <= 3; i++)
            StdDraw.rectangle(0.25*i,0.4,0.05/totalDiscs,0.4);
    }

    private static void drawDisc(int disc,int pole, int h, int totalDiscs){
        double height = (double)1/totalDiscs;
        double w = (double)disc/totalDiscs/2; 
        StdDraw.filledRectangle(pole*0.25,(double)(h+0.5)/totalDiscs/3,(double)w/4,(double)height/6);
    }

    public static void drawDiscs(Stack<Integer> A,Stack<Integer> B,Stack<Integer> C){
        int discNum = A.size()+B.size()+C.size();
        Stack<Integer> A2 = new Stack<Integer>();
        Stack<Integer> B2 = new Stack<Integer>();
        Stack<Integer> C2 = new Stack<Integer>();
        int h1 = 0;
        int h2 = 0;
        int h3 = 0;

        for (int i = A.size()-1;i >= 0; i--)
            A2.push(A.get(i));
        for (int i = B.size()-1;i >= 0; i--)
            B2.push(B.get(i));
        for (int i = C.size()-1;i >= 0; i--)
            C2.push(C.get(i));
        drawPoles(discNum);
        while (!A2.isEmpty()){
            drawDisc(A2.pop(),1,h1,discNum);
            h1++;
        }
        while (!B2.isEmpty()){
            drawDisc(B2.pop(),2,h2,discNum);
            h2++;
        }
        while (!C2.isEmpty()){
            drawDisc(C2.pop(),3,h3,discNum);
            h3++;
        }

        StdDraw.show();
        StdDraw.pause(50);
    }
        private static void solve(int n, Stack<Integer> source, Stack<Integer> other, Stack<Integer> dest){
        if(n == 1){
            dest.push(source.pop());
            
            drawDiscs(A, B, C);
        }
        else{
            solve(n-1, source,dest,other);            
            dest.push(source.pop());
            StdDraw.clear();
            drawDiscs(A, B, C);
            solve(n-1, other,source,dest);
        }
    }

    private static void visualize() {
        solve(discs, A, B, C);
    }

    public static void main(){
        Scanner in = new Scanner(System.in);
        StdDraw.enableDoubleBuffering();
        System.out.print("Enter number of discs: ");
        int n = in.nextInt();
        Hanoi h = new Hanoi(n);
        h.visualize();
    }
}

