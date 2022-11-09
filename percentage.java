import java.util.Scanner;
class percentage{
	
	public static void main(String [] args){
		

		
		int option;
		float a,b,c=100, res=0;



		while(true){





		Scanner sc = new Scanner(System.in);

		System.out.println("1.you want to calculate your percentage");
		System.out.println("2.exit");

  option = sc.nextInt();

switch (option) {

case 1:

	System.out.println("enter obtain marks");

	a = sc.nextFloat();

	System.out.println("enter total marks:");
	

	b = sc.nextFloat();

  res = a/b*c;
}






System.out.println("your percentage is:"+res);








}


	}
}