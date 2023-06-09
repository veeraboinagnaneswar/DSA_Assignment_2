package Answers;
import java.util.*;

class MaxProduct{
	public int maxPro(int[]arr) {
		Arrays.sort(arr);
		int first=arr[0]*arr[1]*arr[arr.length-1];
		int last=arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
		return Math.max(first, last);
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3};
		MaxProduct mp=new MaxProduct();
		System.out.println(mp.maxPro(arr));
	}

}
