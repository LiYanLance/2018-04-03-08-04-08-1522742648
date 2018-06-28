import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int i = 1;
		while(i <= 1000){
			String n = String.valueOf(i);
			int k = n.length();
			int nar = 0;
			for(int j = 0; j < k; j++){
				nar += (int)Math.pow(n.charAt(j) - '0', k);
			}
			if(i == nar){
				System.out.println(i);
			}
			i++;
		}
	}
}     