package Lab2;

import java.util.Scanner;

/*Q   A school has following rules for grading system:
 a. Below 25 - F
 b. 25 to 45 - E
 c. 45 to 50 - D
 d. 50 to 60 - C
 e. 60 to 80 - B
 f. Above 80 - A
 Ask user to enter marks and print the corresponding grade 
 */
public class Q3 {

	public static void main(String[] args) {
	   int marks;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter marks");
	   marks = s.nextInt();
	    if(marks<25)
         System.out.println("grade F");
	    else if(marks>25 && marks<45)
	         System.out.println("grade E");
	    else if(marks>45 && marks<50)
	         System.out.println("grade D");
	    else if(marks>51 && marks<60)
	         System.out.println("grade C");
	    else if(marks>60 && marks<80)
	         System.out.println("grade B");
	    else 
	         System.out.println("grade A");
	    
	    
	}

}
