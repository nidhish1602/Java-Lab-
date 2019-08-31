import java.util.*;
class SGPA 
{
	 String USN;
	 String name;
	 float sgpa;
	 int arr[]=new int[10];
	 int marks[]=new int[10];
	 void get_info()
	  {
		 Scanner S=new Scanner (System.in);
		 System.out.println(" Enter the name ");
		 name=S.next();
		 System.out.println(" Enter the USN ");
		 USN=S.next();
		 for(int i=0;i<2;i++)
		 {
			 System.out.println(" Enter the credits of the subject "+(i+1));
			 arr[i]=S.nextInt();
			 System.out.println(" Enter the marks of the subject "+(i+1));
			 marks[i]=S.nextInt();
		 }
	  } 
	  void calculate_SGPA()
	  {
	   float sum=0,SumofCreds=0;
	   int grade;
	   for(int i=0;i<2;i++)
	   {
		    if(marks[i]>=90)
		    grade=10;
		    else if(marks[i]>=75)
		    grade=9;
		    else if(marks[i]>=60)
		    grade=8;
		    else if(marks[i]>=50)
		    grade=7;
		    else if(marks[i]>=45)
		    grade=6; 
		    else if(marks[i]>=40)
		    grade=5;
		    else  
		    grade=0;     
		    sum+=(arr[i]*grade);
		    SumofCreds+=arr[i];
	   }
	   sgpa=sum/SumofCreds;
	  }
	 void display_info()
	 { 
		  System.out.println("Name:"+name);
		  System.out.println("USN:"+ USN);
		  for(int i=0;i<2;i++)
		  {   
			  System.out.println("Marks of subject"+(i+1)+":"+marks[i]);
			  System.out.println("Credits:"+arr[i]);
		  }
		  System.out.println("Your SGPA is:"+sgpa);
	}
	 public static void main(String[]args)
	{
		 SGPA a1=new SGPA();
		 a1.get_info();
		 a1.calculate_SGPA();
		 a1.display_info();
	}   
 }