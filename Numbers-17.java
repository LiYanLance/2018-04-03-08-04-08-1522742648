import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		int n = scanner.nextInt();
		String nStr = String.valueOf(n);
		if(nStr.matches(".*[024685].*")){
			System.out.println("It is not a Circular Prime number.");
		}else{
			for(int i = 0; i < nStr.length(); i++){
				nStr = String.valueOf(n);
				nStr = nStr.substring(i) + nStr.substring(0,i);
				n = Integer.parseInt(nStr);
				int j = 2;
				while(j < n){
					if(n % j == 0){
						System.out.println("It is not a Circular Prime number.");
						return;
					}
					j++;
				}
			}
			System.out.println("It is a Circular Prime number.");
		}
	}
}     