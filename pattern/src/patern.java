import java.util.Scanner;

public class patern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numb = new Scanner(System.in);
		System.out.println("enter the number of rows in the pattern to be generated:");
		int n=numb.nextInt();
		int r,c;
		
		for( r=n;r>0;r--)
		{
			for(int i=n;i>r;i--)
				System.out.print(" ");
			
			for( c=1;c<=r;c++)
				System.out.print("* ");
			
			System.out.println();
			
		}
		
		
	}

}
