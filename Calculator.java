import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator");
		
		
		System.out.print("Enter One Number : ");
		Scanner input1 = new Scanner(System.in);
		int num1=input1.nextInt();
		
		System.out.print("Enter Another Number : ");
		Scanner input2= new Scanner(System.in);
		int num2=input2.nextInt();
		
		
		
		System.out.print("To Addition Input 1 : ");
		Scanner Addition= new Scanner(System.in);
		int A=Addition.nextInt();
	
        System.out.print("To Multiply Input 2 : ");
		Scanner Multiplication= new Scanner(System.in);
		int M=Multiplication.nextInt();

    		System.out.print("To Substraction Input 3 : ");
		Scanner Substraction= new Scanner(System.in);
		int S=Substraction.nextInt();
		
		
		
		

		if(A ==1 );
		{
    
    int result = num1+num2;
    	System.out.println("Result is  "+result);
}

	if ( M==2);
	{
		 int result = num1*num2;
    	System.out.println("Result is  "+result);
	}

if ( S==3);
	{
		 int result = num1-num2;
    	System.out.println("Result is  "+result);
	}



	}
}
