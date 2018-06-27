public class Numbers-8{
	public static void main(String[] args) {
		System.out.println("List 10 Catalan numbers:");
		for(long i = 1; i <= 10; i++){
			long k = factorial(2 * i) / (long)Math.pow(factorial(i),2) / (i + 1);
			System.out.println(k);
		}
	}
	
	public static long factorial(long number) {
        if (number <= 1){
            return 1;
        }else{
            return number * factorial(number - 1);
		}
	}
}     