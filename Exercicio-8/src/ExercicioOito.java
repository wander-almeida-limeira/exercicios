import java.util.Random;

public class ExercicioOito {

	static Random rand = new Random();
	
	public static void main(String[] args)
	{
		printAlgorithmResult(123, 123);
		printAlgorithmResult(1843, 28);
		printAlgorithmResult(11, 7502);
		printAlgorithmResult(43442243, 9999999);
		
		/*Result out =>
		A value: 123
		B value: 123
		C value: 112233
		-------------------
		A value: 1843
		B value: 28
		C value: 128843
		-------------------
		A value: 11
		B value: 7502
		C value: 171502
		-------------------
		A value: 43442243
		B value: 9999999
		C value: -1
		-------------------*/
	}
	
	private static void printAlgorithmResult(int a, int b) {

		int c = algorithm(a,b);
		
		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
		System.out.println("C value: " + c);
		System.out.println("-------------------");
		
	}
	
	private static int algorithm(int a, int b) {
		
		String strResult = "";
		int result = -1;
		String strA = String.valueOf(a);
		String strB = String.valueOf(b);
		
		for(int i = 0; i< strA.length() || i < strB.length(); ++i){ 
			if(i < strA.length()){
				strResult += strA.charAt(i);
			} 
			if(i < strB.length()) {
				strResult += strB.charAt(i);
			}
		}
		
		try {
			result = Integer.valueOf(strResult);
			if (result > 1000000) {
				return -1;
			}
		} catch (NumberFormatException e) {
			return -1;
		}

		return result;
	}
	
}
