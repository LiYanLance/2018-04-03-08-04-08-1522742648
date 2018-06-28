public class Main{
  public static void main(String[] args) {
	int count = 0, i = 0;
	while(count < 15){
		String n = String.valueOf(i);
		int k = n.length();
		int nar = 0;
		for(int j = 0; j < k; j++){
			nar += (int)Math.pow(n.charAt(j) - '0', k);
		}
		if(i == nar){
			count++;
			System.out.print(i + " ");
		}
		i++;
	}
  }
}     