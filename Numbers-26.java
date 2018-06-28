import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = scanner.nextInt();
		int temp = 0;
		ArrayList<Integer> list = new ArrayList<>();
		String nStr = String.valueOf(num);
		int i = 0;
		while(i < nStr.length()){
			list.add(nStr.charAt(i) - '0');
			temp += (nStr.charAt(i) - '0');
			i++;
		}
		
		while(temp <= num){
			list.add(temp);
			if(temp == num){
				System.out.println("Keith Number");
				return;
			}
			temp += temp;
			temp -= list.get(i - nStr.length());
			i++;
		}
		System.out.println("Not a Keith Number");
	}
}     