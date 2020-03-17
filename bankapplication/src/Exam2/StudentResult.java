package Exam2;

import java.util.Scanner;
public class StudentResult
{ 
	public static void main(String args[]) 
	{ 
	int marks[] = new int[6]; 
	int i;
	float total=0,avg=0;
	Scanner scanner = new Scanner(System.in); 
	for(i=0; i<6; i++) 
	{ 
		System.out.print("Enter Marks of Subject"+(i+1)+":");
		marks[i] = scanner.nextInt(); total = total + marks[i];
	} 
	scanner.close(); 
	System.out.print("The student Grade is: ");
	if(avg>=80)
	{ 
		System.out.print("Distinction");
	}
	else if(avg>=60 && avg<79)
	{ 
		System.out.print("Firstclass"); 
	} 
	else if(avg>=50 && avg<60)
	{
		System.out.print("Secondclass");
	} 
	else
	{ 
		System.out.print("fail");
	} 
  }

}
	