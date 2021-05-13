
public class uc2_equality_of_two_lines {
	   public static void main(String[] args) {
			//variables
	      double x1=2;
	      double y1=5;
	      double x2=3;
	      double y2=4;

	      double x3=4;
	      double y3=1;
	      double x4=2;
	      double y4=5;

			//Computation
	      double line1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
	      System.out.println("Length of first line is: " +line1);
	      double line2 = Math.sqrt((Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2)));
	      System.out.println("Length of second line is: " +line2);

	      if (line1==line2)
	         System.out.println("Lines are equal");
	      else
	         System.out.println("Lines are not equal");
	   	}
	}


