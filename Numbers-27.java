import java.util.Scanner;

public class Numbers-27{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = scanner.nextInt();
		int num = n;
		String nStr = String.valueOf(n);
		System.out.println( "Output: " );
		if(nStr.matches(".*[024685].*")){
			System.out.println("It is not a Circular Prime number.");
		}else{
			for(int i = 0; i < nStr.length(); i++){
				nStr = String.valueOf(num);
				nStr = nStr.substring(i) + nStr.substring(0,i);
				n = Integer.parseInt(nStr);
				System.out.println("        " + n);
				int j = 2;
				while(j < n){
					if(n % j == 0){
						System.out.println("        " + num + " is not a Circular Prime number.");
						return;
					}
					j++;
				}
			}
			System.out.println();
			System.out.println("        " + num + " is a Circular Prime number.");
		}
	}
}     