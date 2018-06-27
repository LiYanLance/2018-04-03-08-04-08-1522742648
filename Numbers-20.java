public class Numbers-20{
	public static void main(String[] args) {
		int i = 0;        
        double result;
        
        while (i <= 10) {
            result= Math.pow(2, Math.pow(2, i)) + 1;
            i++;
            System.out.println(result);
        }
	}
}     