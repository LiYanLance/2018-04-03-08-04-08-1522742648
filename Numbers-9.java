public class Numbers-9{
	public static void main(String[] args) {
		System.out.println("First 10 Happy numbers:");
		int count = 0, i = 0;
		while(count < 10){
			int n = i, num = 0;
			do{
				num = 0;
				while(n > 0){
					num += (int)Math.pow((n % 10), 2);
					n /= 10;
				}
				n = num;

			}while(num >= 10);
			if(num == 1){
				count++;
				System.out.println(i);
			}
			i++;
		}
	}
}     