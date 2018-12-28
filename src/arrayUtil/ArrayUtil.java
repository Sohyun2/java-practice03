package arrayUtil;

public class ArrayUtil {

	// int 배열을 double 배열로 변환
	static double[] intToDouble(int[] source) {
		double[] d = new double[source.length];

		for (int i = 0; i < source.length; i++) {
			d[i] = (double) source[i];
		}
		return d;
	}

	// double 배열을 int 배열로 변환
	static int[] doubleToInt(double[] source) {
		int[] tmpInt = new int[source.length];
		
		for (int i = 0; i < source.length; i++) {
			tmpInt[i] = (int) source[i];
		}
		
		return tmpInt;
	}

	// int 배열 두 개를 연결한 새로운 배열 리턴
	static int[] concat(int[] s1, int[] s2) {
		int[] tmpInt = new int[s1.length+s2.length];
		
		for(int i=0; i<s1.length; i++) {
			tmpInt[i] = s1[i];
		}
		for(int i=0; i<s2.length; i++) {
			tmpInt[i+s1.length] = s2[i];
		}
		
		return tmpInt;
	}
}
