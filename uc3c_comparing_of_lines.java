
public class uc3c_comparing_of_lines {
	public static void main(String[] args) {
		//variables
      double x1=2;
      double y1=3;
      double x2=5;
      double y2=6;

      double x3=2;
      double y3=3;
      double x4=5;
      double y4=6;

		//Computation
      double line1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
      System.out.println("Length of first line is: " +line1);
      double line2 = Math.sqrt((Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2)));
      System.out.println("Length of second line is: " +line2);

      if (line1==line2)
         System.out.println("Lines are equal");
      else if (line1 > line2)
         System.out.println("Line1 is Greater");
		else
			System.out.println("Line2 is Greater");
   	}
}


