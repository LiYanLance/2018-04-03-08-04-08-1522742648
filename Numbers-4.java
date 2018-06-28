public class Main{
  public static void main(String[] args) {
	int count = 0;
    for(int i = 1; i < 1000; i++){
		if(i == 1){
			count++;
			System.out.println("1\t1\t0 + 1");
		}
		String sqr = i * i + "";
  		for(int j = 1; j < sqr.length(); j++){
  			int first = Integer.parseInt(sqr.substring(0,j));
  			int second = Integer.parseInt(sqr.substring(j));
  			if(first + second == i && second != 0){
  				System.out.println(i +"\t" + sqr + "\t" 
  				+ sqr.substring(0,j) + " + " + sqr.substring(j));
  				count++;
  			}
  		}
	}
	System.out.println(count + " Kaprekar numbers.");
  }
}     