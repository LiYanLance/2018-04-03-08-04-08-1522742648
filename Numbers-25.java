public class Main{
	public static void main(String[] args) {
		System.out.println("First 20 Pell numbers: ");
		int[] arr = new int[21];
		arr[0] = 0;
		arr[1] = 1;
		System.out.print("1");
		for(int i = 2; i < arr.length; i++){
			arr[i] = 2 * arr[i - 1] + arr[i - 2];
			System.out.print(" " + arr[i]);
		}
	}
}     