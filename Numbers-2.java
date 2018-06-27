public class Numbers-2{
  public static void main(String[] args) {
    int deficientCount = 0;
	int perfectCount = 0;
	int abundantCount = 0;

	for (long i = 1; i <= 10000; i++) {
		long sum = properDivisorsSum(i);
		if(sum < i){
			deficientCount++;
		}else if(sum == i){
			perfectCount++;
		}else{
			abundantCount++;
		}
	}
	System.out.println("Number Counting [(integers) between 1 to 10,000]: ");
	System.out.println("Deficient number: " + deficientCount);
	System.out.println("Perfect number: " + perfectCount);
	System.out.println("Abundant number: " + abundantCount);
  }
  
  public static long properDivisorsSum(long num){
	 long sum = 0;
	 for(long i = 1; i < num; i++){
		 if(num % i == 0){
			 sum += i;
		 }
	 }
	 return sum;
  }
}