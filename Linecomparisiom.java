import java.util.*;
public class Linecomparisiom {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
		double x1, x2, y1, y2;

        double dis;

        Scanner sc = new Scanner ( System.in );

        System.out.print ( "enter x1 point: " );

        x1 = sc.nextInt ();

        System.out.print ( "enter y1 point: " );

        y1 = sc.nextInt ();

        System.out.print ( "enter x2 point: " );

        x2 = sc.nextInt ();

        System.out.print ( "enter y2 point: " );

        y2 = sc.nextInt ();

        dis = Math.sqrt ( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );

        System.out.println ( "distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis );

	}

}
