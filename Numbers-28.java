public class Numbers-28{
	public static void main(String[] args) {
		System.out.print("First Twenty Hamming numbers:");
		int[] res = new int[20];
		res[0] = 1;
		System.out.print("1");
		int index = 1;
		int i = 0, j = 0, k = 0;
		while(index < 20){
			int s1 = res[i] * 2;
			int s2 = res[j] * 3;
			int s3 = res[k] * 5;
			int min = Math.min(Math.min(s1, s2),s3);
			res[index++] = min;
			System.out.print(" " + min);
			if(min == s1) i++;
			if(min == s2) j++;
			if(min == s3) k++;
		}
	}
}     