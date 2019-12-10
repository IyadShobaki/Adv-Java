import java.util.ArrayList;
import java.util.List;



public class SockMerchant {

	public static void main(String[] args) {
		
		//int[] ar = {10 ,20, 20, 10, 10, 30 ,50, 10, 20};
		//int n = 9;
		int[] ar = {1, 1 ,3, 1, 2 ,1 ,3 ,3 ,3, 3};
		int n = 10;
		System.out.println(sockMerchant(n, ar));
	}
	public static int sockMerchant(int n, int[] ar) {
		int count =0;
		List<Integer> list = new ArrayList<>();
		int[] arr = new int[n];
		for(int i =0; i < ar.length; i++) {
			if(list.contains(ar[i])) {
				
			}else {
				list.add(ar[i]);
				
			}
		}
		
		int[] newArray = new int[list.size()];
		for(int i= 0; i < newArray.length; i++) {
			newArray[i] =0;
		}
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		for(int i =0; i < list.size(); i++) {
			for(int j =0; j <n; j++) {
				if(ar[j] == list.get(i)) {
					newArray[i]++;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		for(int i =0; i < newArray.length; i++) {
			if(newArray[i] == 0) {
				while(newArray[i] > 0) {
					count++;
					newArray[i]-= 2;
				}
			}else {
				while(newArray[i] > 1) {
					count++;
					newArray[i]-= 2;
				}
			}
			
		}
		System.out.println();
		return count;
	}
	
}
