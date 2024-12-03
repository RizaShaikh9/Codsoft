import java.util.Scanner;
class Student_Grade
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of 1st Subject: ");
      	int sub1 = sc .nextInt();
      	System.out.print("Enter Marks of 2nd Subject: ");
      	int sub2 = sc .nextInt();
      	System.out.print("Enter Marks of 3rd Subject: ");
      	int sub3 = sc .nextInt();
      	System.out.print("Enter Marks of 4th Subject: ");
      	int sub4 = sc .nextInt();
      	System.out.print("Enter Marks of 5th Subject: ");
      	int sub5 = sc .nextInt();

		int Total = sub1+sub1+sub3+sub4+sub5;
		float per = Total/5;
        
		System.out.println("Total : "+Total);
		System.out.println("Percentage : "+per);	
		if(per>=90)
			System.out.println("Your Grade is 'A'");
		else if(per>=80)
			System.out.println("Your Grade is 'B'");
		else if(per>=70)
			System.out.println("Your Grade is 'C'");
		else if(per>=60)
			System.out.println("Your Grade is 'D'");
		else if(per>=40)
			System.out.println("Your Grade is 'E'");
		else
			System.out.println("Your Grade is 'F'");
	}
}
