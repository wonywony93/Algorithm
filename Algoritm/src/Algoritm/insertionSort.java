package Algoritm;

/*
 * 삽입정렬
 * 시간복잡도 O(N^2)
 * */
public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,10,5,8,7,6,4,3,2,9};
		int temp,j;
		
		for(int i =0; i<array.length-1; i++) {
			j = i;
			while (array[j]>array[j+1])
			{	
				temp= array[j];
				array[j] =array[j+1];
				array[j+1] =temp;
				j--;
			}
			
		}
		for (int i= 0; i<array.length; i++)
		{
			System.out.print(array[i] +" ");
		}
	}

}
