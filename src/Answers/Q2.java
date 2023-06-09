package Answers;
import java.util.*;

class Candies{
	public int candies(int[]arr) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			lhs.add(arr[i]);
		}
		int s=lhs.size();
		int len=arr.length;
		int ol=len/2;
		if(ol==s) {
			return ol;
		}
		else if(ol<s) {
			return ol;
		}
		else {
			return s;
		}
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[] {1,1,2,2,3,3};
		Candies c=new Candies();
		System.out.println(c.candies(arr));
	}

}
