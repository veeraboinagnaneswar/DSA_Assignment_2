package Answers;
import java.util.*;

class IsMotonic{
	public boolean isMotonic(int[]arr) {
		return isInc(arr)||isdec(arr);
	}

	public static  boolean isInc(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isdec(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,2,3};
		IsMotonic im=new IsMotonic();
		System.out.println(im.isMotonic(arr));
	}

}
