public class Numbers-7{
	public static void main(String[] args) {
		System.out.println("First ten Lucas a numbers:");
		int count = 0;
		int[] lucas = new int[10];
		lucas[0] = 2;
		lucas[1] = 1;
		System.out.println("2\n1");
		for(int i = 2; i < 10; i++){
			lucas[i] = lucas[i-1] + lucas[i-2];
			System.out.println(lucas[i]);
		}
	}
}     