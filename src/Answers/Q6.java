package Answers;
import java.util.*;

class Search{
	public int sortedSearch(int[]arr,int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
}

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {-1,0,3,5,9,12};
		int target=9;
		Search s=new Search();
		System.out.println(s.sortedSearch(arr, target));

	}

}
