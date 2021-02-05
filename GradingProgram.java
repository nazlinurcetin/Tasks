import java.util.*;

public class GradingProgram {

	public static void main(String[]args) {
		  
		   Scanner console = new Scanner(System.in);
		   
		   
		   System.out.print("First Midterm Grade  :");
		   double Examgrade1 = console.nextDouble();
		   Easy(Examgrade1, console);
		   
		   
		   System.out.print("Second Midterm Grade :");
		   double Examgrade2 = console.nextDouble();
		   Easy(Examgrade2,console);
		   
		   
		   System.out.print("Final Grade          :");
		   double Examgrade3 = console.nextDouble();
		   Easy(Examgrade3,console);
		   
		   double average = ((double)Examgrade1 + (double)Examgrade2 +(double) Examgrade3)/3;
		   System.out.println("Average             :" + average);
		  		   
		   System.out.print("Letter Grade         :");
		   letter(average);
	  }
	
	  public static void Easy(double examgrade,Scanner console) {
		  while (  examgrade>100 || 0>examgrade ) {
			   System.out.println(" Invalid exam grade, try again: ");
             examgrade = console.nextDouble();
	      }
	 
      }
	 
	 public static void letter(double average) {
		 
		 if (average >= 90) {
			 System.out.print("A");
		 }else if (90>average || average>= 80) {
			 System.out.print("B");
		 }else if (80>average || average>= 70) {
			 System.out.print("C");
		 }else if (70>average || average>= 60) {
			 System.out.print("D");
		 }else {
			 System.out.print("F");
		 }
		 
	 }
}

